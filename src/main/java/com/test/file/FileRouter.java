package com.test.file;

import org.apache.camel.builder.RouteBuilder;

public class FileRouter extends RouteBuilder {
	
	private FileProcessor fileProcessor;
	
	

	public void setFileProcessor(FileProcessor fileProcessor) {
		this.fileProcessor = fileProcessor;
	}



	@Override
	public void configure() throws Exception {
		from("file:data/input?delete=true").process(fileProcessor).to("file:data/output");

	}

}
