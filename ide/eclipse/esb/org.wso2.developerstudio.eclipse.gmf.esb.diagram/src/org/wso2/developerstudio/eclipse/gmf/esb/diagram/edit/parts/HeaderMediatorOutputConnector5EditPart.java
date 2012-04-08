package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EastPointerShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.HeaderMediatorOutputConnector5ItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated NOT
 */
public class HeaderMediatorOutputConnector5EditPart extends
		AbstractOutputConnector {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3460;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public HeaderMediatorOutputConnector5EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HeaderMediatorOutputConnector5ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new EastPointerFigure();
	}

	/**
	 * @generated
	 */
	public EastPointerFigure getPrimaryShape() {
		return (EastPointerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(12, 10);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShapeForward();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		figure_ = figure;
		createNodeShapeReverse();
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EsbElementTypes.EsbLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ProxyInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SequenceInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EventMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EntitlementMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ClassMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SpringMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ScriptMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FaultMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XQueryMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CommandMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SmooksMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SendMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CloneMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CacheMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof IterateMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RuleMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof OAuthMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LogMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DropMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FilterMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FaultMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SendMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CloneMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof IterateMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SequenceInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DropMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ThrottleMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FilterMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LogMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SequenceInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EventMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EntitlementMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ClassMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SpringMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ScriptMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FaultMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XQueryMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CommandMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SmooksMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SendMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CloneMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CacheMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof IterateMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RuleMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof OAuthMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof AggregateMediatorInputConnector2EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LogMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DropMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FilterMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FaultMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SendMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CloneMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof IterateMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SequenceInputConnector4EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DefaultEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof AddressEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FailoverEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof WSDLEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LoadBalanceEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DropMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ThrottleMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FilterMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LogMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SequenceInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EventMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EntitlementMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ClassMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SpringMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ScriptMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FaultMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XQueryMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CommandMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SmooksMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SendMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CloneMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CacheMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof IterateMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnector5EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof RuleMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof OAuthMediatorInputConnector3EditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof MessageInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof MergeNodeFirstInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof MergeNodeSecondInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EsbElementTypes.EsbLink_4001) {
			types.add(EsbElementTypes.ProxyInputConnector_3003);
			types.add(EsbElementTypes.DropMediatorInputConnector_3008);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3033);
			types.add(EsbElementTypes.ThrottleMediatorInputConnector_3121);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3010);
			types.add(EsbElementTypes.LogMediatorInputConnector_3018);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3036);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3039);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3042);
			types.add(EsbElementTypes.SequenceInputConnector_3049);
			types.add(EsbElementTypes.EventMediatorInputConnector_3052);
			types.add(EsbElementTypes.EntitlementMediatorInputConnector_3055);
			types.add(EsbElementTypes.ClassMediatorInputConnector_3058);
			types.add(EsbElementTypes.SpringMediatorInputConnector_3061);
			types.add(EsbElementTypes.ScriptMediatorInputConnector_3064);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3067);
			types.add(EsbElementTypes.XQueryMediatorInputConnector_3070);
			types.add(EsbElementTypes.CommandMediatorInputConnector_3073);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3076);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3079);
			types.add(EsbElementTypes.SmooksMediatorInputConnector_3082);
			types.add(EsbElementTypes.SendMediatorInputConnector_3085);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3100);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3103);
			types.add(EsbElementTypes.CacheMediatorInputConnector_3106);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3109);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3115);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3118);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3124);
			types.add(EsbElementTypes.RuleMediatorInputConnector_3127);
			types.add(EsbElementTypes.OAuthMediatorInputConnector_3130);
			types.add(EsbElementTypes.AggregateMediatorInputConnector_3112);
			types.add(EsbElementTypes.LogMediatorInputConnector_3135);
			types.add(EsbElementTypes.DropMediatorInputConnector_3138);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3140);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3144);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3147);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3150);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3153);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3157);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3160);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3163);
			types.add(EsbElementTypes.SendMediatorInputConnector_3166);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3169);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3172);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3176);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3181);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3183);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3185);
			types.add(EsbElementTypes.SequenceInputConnector_3188);
			types.add(EsbElementTypes.DropMediatorInputConnector_3192);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3201);
			types.add(EsbElementTypes.ThrottleMediatorInputConnector_3207);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3238);
			types.add(EsbElementTypes.LogMediatorInputConnector_3242);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3245);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3248);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3251);
			types.add(EsbElementTypes.SequenceInputConnector_3255);
			types.add(EsbElementTypes.EventMediatorInputConnector_3258);
			types.add(EsbElementTypes.EntitlementMediatorInputConnector_3261);
			types.add(EsbElementTypes.ClassMediatorInputConnector_3264);
			types.add(EsbElementTypes.SpringMediatorInputConnector_3267);
			types.add(EsbElementTypes.ScriptMediatorInputConnector_3270);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3273);
			types.add(EsbElementTypes.XQueryMediatorInputConnector_3276);
			types.add(EsbElementTypes.CommandMediatorInputConnector_3279);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3282);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3285);
			types.add(EsbElementTypes.SmooksMediatorInputConnector_3288);
			types.add(EsbElementTypes.SendMediatorInputConnector_3291);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3294);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3297);
			types.add(EsbElementTypes.CacheMediatorInputConnector_3301);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3304);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3307);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3310);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3313);
			types.add(EsbElementTypes.RuleMediatorInputConnector_3316);
			types.add(EsbElementTypes.OAuthMediatorInputConnector_3319);
			types.add(EsbElementTypes.AggregateMediatorInputConnector_3322);
			types.add(EsbElementTypes.LogMediatorInputConnector_3326);
			types.add(EsbElementTypes.DropMediatorInputConnector_3195);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3330);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3203);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3388);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3338);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3341);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3345);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3348);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3351);
			types.add(EsbElementTypes.SendMediatorInputConnector_3354);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3357);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3360);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3364);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3367);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3370);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3373);
			types.add(EsbElementTypes.SequenceInputConnector_3376);
			types.add(EsbElementTypes.DefaultEndPointInputConnector_3021);
			types.add(EsbElementTypes.AddressEndPointInputConnector_3030);
			types.add(EsbElementTypes.FailoverEndPointInputConnector_3088);
			types.add(EsbElementTypes.WSDLEndPointInputConnector_3092);
			types.add(EsbElementTypes.LoadBalanceEndPointInputConnector_3095);
			types.add(EsbElementTypes.DropMediatorInputConnector_3395);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3397);
			types.add(EsbElementTypes.ThrottleMediatorInputConnector_3400);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3403);
			types.add(EsbElementTypes.LogMediatorInputConnector_3407);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3410);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3413);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3416);
			types.add(EsbElementTypes.SequenceInputConnector_3420);
			types.add(EsbElementTypes.EventMediatorInputConnector_3423);
			types.add(EsbElementTypes.EntitlementMediatorInputConnector_3426);
			types.add(EsbElementTypes.ClassMediatorInputConnector_3429);
			types.add(EsbElementTypes.SpringMediatorInputConnector_3432);
			types.add(EsbElementTypes.ScriptMediatorInputConnector_3435);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3438);
			types.add(EsbElementTypes.XQueryMediatorInputConnector_3441);
			types.add(EsbElementTypes.CommandMediatorInputConnector_3444);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3447);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3450);
			types.add(EsbElementTypes.SmooksMediatorInputConnector_3453);
			types.add(EsbElementTypes.SendMediatorInputConnector_3456);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3459);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3462);
			types.add(EsbElementTypes.CacheMediatorInputConnector_3466);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3469);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3472);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3475);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3478);
			types.add(EsbElementTypes.RuleMediatorInputConnector_3481);
			types.add(EsbElementTypes.OAuthMediatorInputConnector_3484);
			types.add(EsbElementTypes.MessageInputConnector_3046);
			types.add(EsbElementTypes.MergeNodeFirstInputConnector_3014);
			types.add(EsbElementTypes.MergeNodeSecondInputConnector_3015);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class EastPointerFigure extends EastPointerShape {

		/**
		 * @generated
		 */
		public EastPointerFigure() {

			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(10)));
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
