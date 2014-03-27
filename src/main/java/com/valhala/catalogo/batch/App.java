package com.valhala.catalogo.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		App batch = new App();
		batch.run();
	}
	
	private void run() {
		String[] springConfig = {"config/batch-config.xml"};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("backupJob");
		
		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit status : " + execution.getStatus());
			System.out.println("Exit status : " + execution.getAllFailureExceptions());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Finalizado!!!!");
	}

}
