package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObj")
public class Employee {
@Value("879")
private int empId;
public void getMsg(){
	System.out.println("B.method1");
}
public String getwelcome(){
	System.out.println("B.method2");
	return "byeeee";
}
public void getString(){
	if(empId>100)
	System.out.println("welcome");
	else
     throw new ArithmeticException("not valid");  
    
}


}
