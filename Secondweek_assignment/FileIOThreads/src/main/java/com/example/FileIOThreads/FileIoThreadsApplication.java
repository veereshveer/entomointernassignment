package com.example.FileIOThreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FileIoThreadsApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(FileIoThreadsApplication.class, args);
		IOFileFunction fileFunctionObject=context.getBean(IOFileFunction.class);
		fileFunctionObject.fileFunctions();

		FileOperations FileOperationsObject=context.getBean(FileOperations.class);
		FileOperationsObject.fileOperations();

		CreateThread CreateThreadObject=context.getBean(CreateThread.class);
		CreateThreadObject.createThread();

		MultiThreading MultiThreadingObject=context.getBean(MultiThreading.class);
		MultiThreadingObject.multiThreading();

		ThreadMethods ThreadMethodsObjects=context.getBean(ThreadMethods.class);
	}

}
