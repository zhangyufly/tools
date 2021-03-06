/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.capp.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;

public class ServerRoleCollectionNode {
	private List<ServerRoleNode> serverRoleNodes;
	private IProject project;
    
	public ServerRoleCollectionNode(IProject project) {
		setProject(project);
    }
	
	public void setServerRoleNodes(List<ServerRoleNode> serverRoleNodes) {
	    this.serverRoleNodes = serverRoleNodes;
    }

	public List<ServerRoleNode> getServerRoleNodes() {
		if (serverRoleNodes==null){
			serverRoleNodes=new ArrayList<ServerRoleNode>();
		}
		refresh();
	    return serverRoleNodes;
    }

	public void setProject(IProject project) {
	    this.project = project;
    }

	public IProject getProject() {
	    return project;
    }
	
	public String getCaption() {
		return "Server Roles";
    }
	
	private void refresh() {
		List<ServerRoleNode> nodesToRemove=new ArrayList<ServerRoleNode>();
		List<IServerRole> serverRoles = new ArrayList<IServerRole>(Arrays.asList(CAppArtifactManager.getInstance().getServerRoles(getProject())));
		for (ServerRoleNode serverRoleNode : serverRoleNodes) {
			IServerRole serverRoleContained = isServerRoleContained(serverRoles,serverRoleNode.getServerRole().getServerRoleName());
	        if (serverRoleContained!=null){
	        	serverRoles.remove(serverRoleContained);
	        }else{
	        	nodesToRemove.add(serverRoleNode);
	        }
        }
		for (IServerRole serverRole : serverRoles) {
			serverRoleNodes.add(new ServerRoleNode(getProject(),serverRole));
        }
		serverRoleNodes.removeAll(nodesToRemove);
		ServerRoleNode defaultNode = null;
		for (ServerRoleNode node : serverRoleNodes) {
	        if (node.getServerRole().getServerRoleName().equalsIgnoreCase(CAppEnvironment.getDefaultServerRole().getServerRoleName())){
	        	defaultNode=node;
	        	break;
	        }
        }
		if (defaultNode!=null){
			serverRoleNodes.remove(defaultNode);
			serverRoleNodes.add(defaultNode);
		}
    }
	
	private IServerRole isServerRoleContained(List<IServerRole> list, String serverRoleName){
		for (IServerRole serverRole : list) {
	        if (serverRole.getServerRoleName().equals(serverRoleName)){
	        	return serverRole;
	        }
        }
		return null;
	}
}
