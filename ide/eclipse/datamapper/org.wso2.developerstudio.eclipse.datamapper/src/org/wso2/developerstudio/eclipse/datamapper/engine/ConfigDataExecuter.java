/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.datamapper.engine;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.wso2.developerstudio.eclipse.datamapper.model.ConfigDataModel;

public class ConfigDataExecuter {
	private String configMethodname;
	private List<String> configparameterList;
	private List<ConfigDataModel> configDataList;
	private Map<String,String> outputElementsValues;
	private File inputFile;

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public List<ConfigDataModel> getConfigDataList() {
		return configDataList;
	}

	public void setConfigDataList(List<ConfigDataModel> configDataList) {
		this.configDataList = configDataList;
	}

	public void executeConfigs() {
		
		Iterator<ConfigDataModel> configIterator = configDataList.listIterator();
		ConfigDataModel configDataModel;
		outputElementsValues = new HashMap<String,String>();
		FunctionHandler functionHandler = new FunctionHandler(inputFile);
		
		String outputElementName;
		String methodName;
		String configResult;
		
		while (configIterator.hasNext()) {
			configDataModel = configIterator.next();
			outputElementName = configDataModel.getOutputElement();
			methodName = configDataModel.getMethodName();
			configResult = functionHandler.executeFunction(methodName, configDataModel.getArgList());
			outputElementsValues.put(outputElementName, configResult);
		}
	}
}
