/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.developerstudio.eclipse.artifact.cep.project.nature;

import java.io.File;
import java.util.List;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Repository;
import org.apache.maven.model.RepositoryPolicy;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.JavaModelException;
import org.wso2.developerstudio.eclipse.capp.maven.utils.MavenConstants;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.ide.FileExtensionResourcevisitor;

public class CEPProjectNature extends AbstractWSO2ProjectNature {

	public void configure() throws CoreException, JavaModelException {
		try {
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deconfigure() throws CoreException {

	}

	public void updatePom() throws Exception {
		File mavenProjectPomLocation = getProject().getFile("pom.xml")
				.getLocation().toFile();
		MavenProject mavenProject = MavenUtils
				.getMavenProject(mavenProjectPomLocation);
		Plugin pluginEntry = MavenUtils.createPluginEntry(mavenProject,
				"org.wso2.maven", "maven-cep-plugin",
				MavenConstants.MAVEN_CEP_PLUGIN_VERSION, true);
		Xpp3Dom configurationNode = MavenUtils
				.createMainConfigurationNode(pluginEntry);
		Xpp3Dom artifactNode = MavenUtils.createXpp3Node(configurationNode,
				"artifact");
		if (getcepFile() != null) {
			String fileName = FileUtils.getRelativePath(getProject()
					.getLocation().toFile(), getcepFile().getLocation()
					.toFile());
			artifactNode.setValue(fileName);
		}
		Repository repo = new Repository();
		repo.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo.setId("wso2-nexus");
		RepositoryPolicy releasePolicy = new RepositoryPolicy();
		releasePolicy.setEnabled(true);
		releasePolicy.setUpdatePolicy("daily");
		releasePolicy.setChecksumPolicy("ignore");
		repo.setReleases(releasePolicy);
		mavenProject.getModel().addRepository(repo);
		mavenProject.getModel().addPluginRepository(repo);
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}

	private IFile getcepFile() throws CoreException {
		getProject().refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		FileExtensionResourcevisitor fileExtensionResourceVisitor = new FileExtensionResourcevisitor(
				".xml", IResource.FILE);
		getProject().accept(fileExtensionResourceVisitor);
		List<IResource> resources = fileExtensionResourceVisitor
				.getResourceList();
		return resources.size() == 0 ? null : (IFile) resources.get(0);
	}

}