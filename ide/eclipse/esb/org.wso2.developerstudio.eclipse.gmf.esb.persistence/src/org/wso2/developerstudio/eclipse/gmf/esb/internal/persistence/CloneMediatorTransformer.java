package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.eip.Target;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneTarget;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType;
import org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CloneMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(
				createCloneMediator(information, subject));
		/*
		 * Transform the mediator output data flow path.
		 */
		doTransform(information, ((CloneMediator) subject).getOutputConnector());

	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createCloneMediator(information, subject));
		doTransformWithinSequence(information, ((CloneMediator) subject)
				.getOutputConnector().getOutgoingLink(), sequence);
	}

	private org.apache.synapse.mediators.eip.splitter.CloneMediator createCloneMediator(
			TransformationInfo information, EsbNode subject) throws Exception {
		/*
		 * Check subject.
		 */
		Assert.isTrue(subject instanceof CloneMediator, "Invalid subject.");
		CloneMediator visualClone = (CloneMediator) subject;

		/*
		 * Configure Clone mediator.
		 */
		org.apache.synapse.mediators.eip.splitter.CloneMediator cloneMediator = new org.apache.synapse.mediators.eip.splitter.CloneMediator();
		setCommonProperties(cloneMediator, visualClone);
		{
			if (visualClone.getCloneID() != null && !visualClone.getCloneID().isEmpty()) {
				cloneMediator.setId(visualClone.getCloneID());
			}
			cloneMediator.setSequential(visualClone.isSequentialMediation());
			cloneMediator.setContinueParent(visualClone.isContinueParent());

			List<Target> targetList = new ArrayList<Target>();

			for (int i = 0; i < visualClone.getTargets().size(); ++i) {

				CloneTarget visualTarget = visualClone.getTargets().get(i);
				Target target = new Target();
				
				if (visualTarget.getSoapAction()!= null && !visualTarget.getSoapAction().equals("")) {
					target.setSoapAction(visualTarget.getSoapAction()); // set soap action.
				} else {
					target.setSoapAction(null);
				}
				if (visualTarget.getToAddress() != null && !visualTarget.getToAddress().equals("")) {
					target.setToAddress(visualTarget.getToAddress()); // set to address.
				} else {
					target.setToAddress(null);
				}
				
				if (visualTarget.getSequenceType().equals(
						TargetSequenceType.ANONYMOUS)) { // handle if target sequence type anonymous.

					CloneMediatorTargetOutputConnector outputConnector = visualClone
							.getTargetsOutputConnector().get(i);

					//ListMediator listMediator = new AnonymousListMediator();

					SequenceMediator targetSequence = new SequenceMediator();

					TransformationInfo newInfo = new TransformationInfo();
					newInfo.setTraversalDirection(information
							.getTraversalDirection());
					newInfo.setSynapseConfiguration(information
							.getSynapseConfiguration());
					newInfo.setOriginInSequence(information
							.getOriginInSequence());
					newInfo.setOriginOutSequence(information
							.getOriginOutSequence());
					newInfo.setCurrentProxy(information.getCurrentProxy());
					newInfo.setParentSequence(targetSequence);
					doTransform(newInfo, outputConnector);

					//targetSequence.addAll(listMediator.getList());
					target.setSequence(targetSequence);

				} else if (visualTarget.getSequenceType().equals(
						TargetSequenceType.REGISTRY_REFERENCE)) { //handle if target sequence type registry ref.

					target.setSequenceRef(visualTarget.getSequenceKey()
							.getKeyValue());

				}

				if (visualTarget.getEndpointType().equals(
						TargetEndpointType.ANONYMOUS)) {

					// TODO handle this situation.

				} else if (visualTarget.getEndpointType().equals(
						TargetEndpointType.REGISTRY_REFERENCE)) {

					target.setEndpointRef(visualTarget.getEndpointKey()
							.getKeyValue());
				}

				targetList.add(target);

			}

			cloneMediator.setTargets(targetList);
		}
		return cloneMediator;
	}

}
