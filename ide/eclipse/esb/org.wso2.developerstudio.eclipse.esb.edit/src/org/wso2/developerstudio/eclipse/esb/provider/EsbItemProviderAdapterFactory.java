/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.esb.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.wso2.developerstudio.eclipse.esb.CustomDelegatingItemProvider;
import org.wso2.developerstudio.eclipse.esb.util.EsbAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EsbItemProviderAdapterFactory extends EsbAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * {@inheritDoc}
	 */
    public Adapter createAdapter(Notifier target) {
	    Adapter adapter = super.createAdapter(target);
	    if (adapter instanceof ModelObjectItemProvider) {
	    	adapter = new CustomDelegatingItemProvider((ModelObjectItemProvider) adapter);
	    }
	    return adapter;
    }
	
	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.SynapseConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynapseConfigurationItemProvider synapseConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.SynapseConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createSynapseConfigurationAdapter() {
		if (synapseConfigurationItemProvider == null) {
			synapseConfigurationItemProvider = new SynapseConfigurationItemProvider(this);
		}

		return synapseConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.Description} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionItemProvider descriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptionAdapter() {
		if (descriptionItemProvider == null) {
			descriptionItemProvider = new DescriptionItemProvider(this);
		}

		return descriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.MediatorSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediatorSequenceItemProvider mediatorSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.MediatorSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createMediatorSequenceAdapter() {
		if (mediatorSequenceItemProvider == null) {
			mediatorSequenceItemProvider = new MediatorSequenceItemProvider(this);
		}

		return mediatorSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.UnknownObject} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected UnknownObjectItemProvider unknownObjectItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.UnknownObject}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createUnknownObjectAdapter() {
		if (unknownObjectItemProvider == null) {
			unknownObjectItemProvider = new UnknownObjectItemProvider(this);
		}

		return unknownObjectItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.NamespacedProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespacedPropertyItemProvider namespacedPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.NamespacedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createNamespacedPropertyAdapter() {
		if (namespacedPropertyItemProvider == null) {
			namespacedPropertyItemProvider = new NamespacedPropertyItemProvider(this);
		}

		return namespacedPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.RegistryKeyProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryKeyPropertyItemProvider registryKeyPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.RegistryKeyProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createRegistryKeyPropertyAdapter() {
		if (registryKeyPropertyItemProvider == null) {
			registryKeyPropertyItemProvider = new RegistryKeyPropertyItemProvider(this);
		}

		return registryKeyPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.NameValueTypeProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameValueTypePropertyItemProvider nameValueTypePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.NameValueTypeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameValueTypePropertyAdapter() {
		if (nameValueTypePropertyItemProvider == null) {
			nameValueTypePropertyItemProvider = new NameValueTypePropertyItemProvider(this);
		}

		return nameValueTypePropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyServiceItemProvider proxyServiceItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyServiceAdapter() {
		if (proxyServiceItemProvider == null) {
			proxyServiceItemProvider = new ProxyServiceItemProvider(this);
		}

		return proxyServiceItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyWsdlConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyWsdlConfigurationItemProvider proxyWsdlConfigurationItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyWsdlConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyWsdlConfigurationAdapter() {
		if (proxyWsdlConfigurationItemProvider == null) {
			proxyWsdlConfigurationItemProvider = new ProxyWsdlConfigurationItemProvider(this);
		}

		return proxyWsdlConfigurationItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyWsdlResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyWsdlResourceItemProvider proxyWsdlResourceItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyWsdlResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyWsdlResourceAdapter() {
		if (proxyWsdlResourceItemProvider == null) {
			proxyWsdlResourceItemProvider = new ProxyWsdlResourceItemProvider(this);
		}

		return proxyWsdlResourceItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyServiceParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyServiceParameterItemProvider proxyServiceParameterItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyServiceParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyServiceParameterAdapter() {
		if (proxyServiceParameterItemProvider == null) {
			proxyServiceParameterItemProvider = new ProxyServiceParameterItemProvider(this);
		}

		return proxyServiceParameterItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyServicePolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyServicePolicyItemProvider proxyServicePolicyItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyServicePolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyServicePolicyAdapter() {
		if (proxyServicePolicyItemProvider == null) {
			proxyServicePolicyItemProvider = new ProxyServicePolicyItemProvider(this);
		}

		return proxyServicePolicyItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyInSequenceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyInSequenceConfigurationItemProvider proxyInSequenceConfigurationItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyInSequenceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyInSequenceConfigurationAdapter() {
		if (proxyInSequenceConfigurationItemProvider == null) {
			proxyInSequenceConfigurationItemProvider = new ProxyInSequenceConfigurationItemProvider(this);
		}

		return proxyInSequenceConfigurationItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyEndpointConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyEndpointConfigurationItemProvider proxyEndpointConfigurationItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyEndpointConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyEndpointConfigurationAdapter() {
		if (proxyEndpointConfigurationItemProvider == null) {
			proxyEndpointConfigurationItemProvider = new ProxyEndpointConfigurationItemProvider(this);
		}

		return proxyEndpointConfigurationItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyOutSequenceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyOutSequenceConfigurationItemProvider proxyOutSequenceConfigurationItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyOutSequenceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyOutSequenceConfigurationAdapter() {
		if (proxyOutSequenceConfigurationItemProvider == null) {
			proxyOutSequenceConfigurationItemProvider = new ProxyOutSequenceConfigurationItemProvider(this);
		}

		return proxyOutSequenceConfigurationItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.ProxyFaultSequenceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyFaultSequenceConfigurationItemProvider proxyFaultSequenceConfigurationItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.ProxyFaultSequenceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createProxyFaultSequenceConfigurationAdapter() {
		if (proxyFaultSequenceConfigurationItemProvider == null) {
			proxyFaultSequenceConfigurationItemProvider = new ProxyFaultSequenceConfigurationItemProvider(this);
		}

		return proxyFaultSequenceConfigurationItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.LocalEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalEntryItemProvider localEntryItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.LocalEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createLocalEntryAdapter() {
		if (localEntryItemProvider == null) {
			localEntryItemProvider = new LocalEntryItemProvider(this);
		}

		return localEntryItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.EvaluatorExpressionProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluatorExpressionPropertyItemProvider evaluatorExpressionPropertyItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.EvaluatorExpressionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createEvaluatorExpressionPropertyAdapter() {
		if (evaluatorExpressionPropertyItemProvider == null) {
			evaluatorExpressionPropertyItemProvider = new EvaluatorExpressionPropertyItemProvider(this);
		}

		return evaluatorExpressionPropertyItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.TaskImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImplementationItemProvider taskImplementationItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.TaskImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskImplementationAdapter() {
		if (taskImplementationItemProvider == null) {
			taskImplementationItemProvider = new TaskImplementationItemProvider(this);
		}

		return taskImplementationItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.TaskProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPropertyItemProvider taskPropertyItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.TaskProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskPropertyAdapter() {
		if (taskPropertyItemProvider == null) {
			taskPropertyItemProvider = new TaskPropertyItemProvider(this);
		}

		return taskPropertyItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.DefaultEndPoint} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DefaultEndPointItemProvider defaultEndPointItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.DefaultEndPoint}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createDefaultEndPointAdapter() {
		if (defaultEndPointItemProvider == null) {
			defaultEndPointItemProvider = new DefaultEndPointItemProvider(this);
		}

		return defaultEndPointItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.AddressEndPoint} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AddressEndPointItemProvider addressEndPointItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.AddressEndPoint}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createAddressEndPointAdapter() {
		if (addressEndPointItemProvider == null) {
			addressEndPointItemProvider = new AddressEndPointItemProvider(this);
		}

		return addressEndPointItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.WsdlEndPoint} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected WsdlEndPointItemProvider wsdlEndPointItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.WsdlEndPoint}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createWsdlEndPointAdapter() {
		if (wsdlEndPointItemProvider == null) {
			wsdlEndPointItemProvider = new WsdlEndPointItemProvider(this);
		}

		return wsdlEndPointItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.FailoverEndPoint} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected FailoverEndPointItemProvider failoverEndPointItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.FailoverEndPoint}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createFailoverEndPointAdapter() {
		if (failoverEndPointItemProvider == null) {
			failoverEndPointItemProvider = new FailoverEndPointItemProvider(this);
		}

		return failoverEndPointItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.LoadBalanceEndPoint} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LoadBalanceEndPointItemProvider loadBalanceEndPointItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.LoadBalanceEndPoint}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createLoadBalanceEndPointAdapter() {
		if (loadBalanceEndPointItemProvider == null) {
			loadBalanceEndPointItemProvider = new LoadBalanceEndPointItemProvider(this);
		}

		return loadBalanceEndPointItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.DynamicLoadBalanceEndPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicLoadBalanceEndPointItemProvider dynamicLoadBalanceEndPointItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.DynamicLoadBalanceEndPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createDynamicLoadBalanceEndPointAdapter() {
		if (dynamicLoadBalanceEndPointItemProvider == null) {
			dynamicLoadBalanceEndPointItemProvider = new DynamicLoadBalanceEndPointItemProvider(this);
		}

		return dynamicLoadBalanceEndPointItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.DynamicLoadBalanceProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicLoadBalancePropertyItemProvider dynamicLoadBalancePropertyItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.DynamicLoadBalanceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createDynamicLoadBalancePropertyAdapter() {
		if (dynamicLoadBalancePropertyItemProvider == null) {
			dynamicLoadBalancePropertyItemProvider = new DynamicLoadBalancePropertyItemProvider(this);
		}

		return dynamicLoadBalancePropertyItemProvider;
	}

				/**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.XPathEndPointReference} instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected XPathEndPointReferenceItemProvider xPathEndPointReferenceItemProvider;

    /**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.XPathEndPointReference}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Adapter createXPathEndPointReferenceAdapter() {
		if (xPathEndPointReferenceItemProvider == null) {
			xPathEndPointReferenceItemProvider = new XPathEndPointReferenceItemProvider(this);
		}

		return xPathEndPointReferenceItemProvider;
	}

    /**
	 * This keeps track of the one adapter used for all {@link org.wso2.developerstudio.eclipse.esb.RegistryKeyEndPointReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryKeyEndPointReferenceItemProvider registryKeyEndPointReferenceItemProvider;

				/**
	 * This creates an adapter for a {@link org.wso2.developerstudio.eclipse.esb.RegistryKeyEndPointReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter createRegistryKeyEndPointReferenceAdapter() {
		if (registryKeyEndPointReferenceItemProvider == null) {
			registryKeyEndPointReferenceItemProvider = new RegistryKeyEndPointReferenceItemProvider(this);
		}

		return registryKeyEndPointReferenceItemProvider;
	}

				/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (synapseConfigurationItemProvider != null) synapseConfigurationItemProvider.dispose();
		if (descriptionItemProvider != null) descriptionItemProvider.dispose();
		if (commentItemProvider != null) commentItemProvider.dispose();
		if (unknownObjectItemProvider != null) unknownObjectItemProvider.dispose();
		if (mediatorSequenceItemProvider != null) mediatorSequenceItemProvider.dispose();
		if (namespacedPropertyItemProvider != null) namespacedPropertyItemProvider.dispose();
		if (registryKeyPropertyItemProvider != null) registryKeyPropertyItemProvider.dispose();
		if (nameValueTypePropertyItemProvider != null) nameValueTypePropertyItemProvider.dispose();
		if (defaultEndPointItemProvider != null) defaultEndPointItemProvider.dispose();
		if (addressEndPointItemProvider != null) addressEndPointItemProvider.dispose();
		if (wsdlEndPointItemProvider != null) wsdlEndPointItemProvider.dispose();
		if (failoverEndPointItemProvider != null) failoverEndPointItemProvider.dispose();
		if (loadBalanceEndPointItemProvider != null) loadBalanceEndPointItemProvider.dispose();
		if (dynamicLoadBalanceEndPointItemProvider != null) dynamicLoadBalanceEndPointItemProvider.dispose();
		if (dynamicLoadBalancePropertyItemProvider != null) dynamicLoadBalancePropertyItemProvider.dispose();
		if (xPathEndPointReferenceItemProvider != null) xPathEndPointReferenceItemProvider.dispose();
		if (registryKeyEndPointReferenceItemProvider != null) registryKeyEndPointReferenceItemProvider.dispose();
		if (proxyServiceItemProvider != null) proxyServiceItemProvider.dispose();
		if (proxyWsdlConfigurationItemProvider != null) proxyWsdlConfigurationItemProvider.dispose();
		if (proxyWsdlResourceItemProvider != null) proxyWsdlResourceItemProvider.dispose();
		if (proxyServiceParameterItemProvider != null) proxyServiceParameterItemProvider.dispose();
		if (proxyServicePolicyItemProvider != null) proxyServicePolicyItemProvider.dispose();
		if (proxyInSequenceConfigurationItemProvider != null) proxyInSequenceConfigurationItemProvider.dispose();
		if (proxyEndpointConfigurationItemProvider != null) proxyEndpointConfigurationItemProvider.dispose();
		if (proxyOutSequenceConfigurationItemProvider != null) proxyOutSequenceConfigurationItemProvider.dispose();
		if (proxyFaultSequenceConfigurationItemProvider != null) proxyFaultSequenceConfigurationItemProvider.dispose();
		if (localEntryItemProvider != null) localEntryItemProvider.dispose();
		if (evaluatorExpressionPropertyItemProvider != null) evaluatorExpressionPropertyItemProvider.dispose();
		if (taskImplementationItemProvider != null) taskImplementationItemProvider.dispose();
		if (taskPropertyItemProvider != null) taskPropertyItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
	}

}
