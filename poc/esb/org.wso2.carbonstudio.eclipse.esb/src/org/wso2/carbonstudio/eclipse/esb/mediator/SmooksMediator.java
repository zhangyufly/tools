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
package org.wso2.carbonstudio.eclipse.esb.mediator;

import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smooks Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getConfigurationKey <em>Configuration Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getInput <em>Input</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSmooksMediator()
 * @model
 * @generated
 */
public interface SmooksMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Configuration Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Key</em>' containment reference.
	 * @see #setConfigurationKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSmooksMediator_ConfigurationKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getConfigurationKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getConfigurationKey <em>Configuration Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Key</em>' containment reference.
	 * @see #getConfigurationKey()
	 * @generated
	 */
	void setConfigurationKey(RegistryKeyProperty value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(SmooksInConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSmooksMediator_Input()
	 * @model containment="true"
	 * @generated
	 */
	SmooksInConfiguration getInput();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(SmooksInConfiguration value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(SmooksOutConfiguration)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getSmooksMediator_Output()
	 * @model containment="true"
	 * @generated
	 */
	SmooksOutConfiguration getOutput();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(SmooksOutConfiguration value);

} // SmooksMediator
