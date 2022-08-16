package com.motivity.exception;

import java.util.Scanner;

//class representing custom exception  
class InvalidAgeException  extends Exception  
{  
 public InvalidAgeException (String str)  
 {  
     // calling the constructor of parent Exception  
     super(str);  
 }  
}  
 
//class that uses custom exception InvalidAgeException  
public class Exceptionprog {

 // method to check the age  
 static void validate (int age) throws InvalidAgeException { 

    if(age < 18){ 

     // throw an object of user defined exception  
     throw new InvalidAgeException( age+" years is not valid to vote");   
        	
    	  
    } else {   
     System.out.println("welcome to vote");  
    }
  
    
  }
 //exception propagation
 static void verify(int age) throws InvalidAgeException
 {
	 validate(age);
	 System.out.println("you are eligible for voting ");
	 
 }

 // main method  
 public static void main(String args[]) throws InvalidAgeException 
 {
	

 Scanner sc=new Scanner(System.in);
 System.out.println("enter the age of the candidate");
 int age=sc.nextInt();
     // calling the method 
 try  
 {  
     // calling the method   
	 verify(age);  
 }  
 catch (InvalidAgeException ex)  
 {  
     System.out.println("Caught the exception");  

     // printing the message from InvalidAgeException object  
     System.out.println("Exception occured: " + ex);  
 } 
 
     System.out.println("rest of the code..."); 
     
     ExceptionPropagation1 obj=new ExceptionPropagation1();  
     obj.p();
     System.out.println("1.NullPointerException  2.NumberFormatException 3.ArrayIndexOutOfBoundsException ");
     System.out.println("enter exception number");
     int ch=sc.nextInt();
     switch (ch)
     {
     case 1:
    	 try {
    	 String s=null;  
    	 System.out.println(s.length());//NullPointerException 
    	 }catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
    	 break;
     case 2:
    	 try {
    	 String s1="abc";  
    	 int i=Integer.parseInt(s1);//NumberFormatException  
    	 }catch(Exception e1)
    	 {
    		 System.out.println(e1);
    	 }
    	 break;
     case 3:
    	 try {
    	 int a[]=new int[5];  
    	 a[10]=50; //ArrayIndexOutOfBoundsException  
    	 }catch(Exception e1)
    	 {
    		 System.out.println(e1);
    	 }
    	 
     }
 } 
}  
class ExceptionPropagation1{  
	//exception propagation
       //Arithmetic exception
	  void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println( e+"exception handled");}  
	  }  
	  	  
	}  
