/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.maven.car.artifact;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;
import org.codehaus.plexus.util.FileUtils;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.wso2.carbonstudio.capp.model.Artifact;
import org.wso2.carbonstudio.capp.model.ArtifactDependency;
import org.wso2.carbonstudio.capp.mojo.AbstractPOMGenMojo;
import org.wso2.carbonstudio.capp.utils.MavenUtils;

/**
 * This is the Maven Mojo used for generating a pom for a sequence artifact 
 * from the old CApp project structure
 * 
 * @goal pom-gen
 * 
 */
public class CARPOMGenMojo extends AbstractPOMGenMojo {

	/**
	 * @parameter default-value="${project}"
	 */
	public MavenProject project;

	/**
	 * Maven ProjectHelper.
	 * 
	 * @component
	 */
	public MavenProjectHelper projectHelper;

	/**
	 * The path of the location to output the pom
	 * 
	 * @parameter expression="target/artifacts"
	 */
	public File outputLocation;

	/**
	 * The resulting extension of the file
	 * 
	 * @parameter
	 */
	public File artifactLocation;
	
	/**
	 * POM location for the module project
	 * 
	 * @parameter expression="target/pom.xml"
	 */
	public File moduleProject;
	
	/**
	 * Group id to use for the generated pom
	 * 
	 * @parameter
	 */
	public String groupId;

	/**
	 * Comma separated list of "artifact_type=extension" to be used when creating dependencies for other capp artifacts
	 * 
	 * @parameter
	 */
	public String typeList;

	/**
	 * Location to which the archive needs to be created
	 * 
	 * @parameter expression="target"
	 */
	public String archiveLocation;
	
	private static final String ARTIFACT_TYPE="carbon/application";
	
	
	protected void copyResources(MavenProject project, File projectLocation, Artifact artifact)throws IOException {
	}
	protected void addPlugins(MavenProject artifactMavenProject, Artifact artifact) {
		Plugin plugin = MavenUtils.createPluginEntry(artifactMavenProject,"org.wso2.maven","maven-car-plugin","1.0-SNAPSHOT",true);
		Xpp3Dom configuration = (Xpp3Dom)plugin.getConfiguration();
		//add configuration
		Xpp3Dom aritfact = MavenUtils.createConfigurationNode(configuration,"archiveLocation");
		aritfact.setValue(archiveLocation);
	}

	protected String getArtifactType() {
		return ARTIFACT_TYPE;
	}

	protected void addMavenDependencies(MavenProject artifactMavenProject,
			Artifact artifact, List<Artifact> artifacts)
			throws MojoExecutionException {
		List<ArtifactDependency> dependencies = artifact.getDependencies();
		for (ArtifactDependency dependency : dependencies) {
			String dGroupId=getGroupId();
			String dArtifactId = dependency.getName();
			String dVersion = dependency.getVersion();
			String scope = "capp/"+dependency.getServerRole();
			String type = getExtensionOfDependency(artifacts, dependency);
			addMavenDependency(artifactMavenProject, dGroupId, dArtifactId,
					dVersion, scope, type);
		}
	}
}
