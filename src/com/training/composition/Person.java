package com.training.composition;

public class Person {
	  //composition has-a relationship - Composition means mixture of two or more, 
	//here Job is mixed with  Person as it has a  releationship
    private Job job;
   
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

}
