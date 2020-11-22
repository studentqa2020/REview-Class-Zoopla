package com.java.condition.practice;

public class TestingJavaCondition {
	
	public void getsalary(){
		
		int age = 45;
		
		if(age <21) {//false
			
			System.out.println("Not Adult");
		}else if(age>65) {//false
			System.out.println("Senior citizen");
		}else {//here
			System.out.println("Age not in my range");
		}
		
	
		
		
	}
	
	public static void main(String[] args) {
		//How to call= create object ==> RT
		//Why need to create object? ==> confused (No static word)
		
		TestingJavaCondition obj = new TestingJavaCondition();
		obj.getsalary();
	}

}
