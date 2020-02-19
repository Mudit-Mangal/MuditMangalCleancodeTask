package com_home_task.Task2;
import java.util.*;
/**
 * Hello world!
 *
 */
class Interest{
	
	static double SI(int principal,double rate, int time) {
		
		return principal*rate*time/100;
		
	}
static double CI(int principal,double rate, int time) {
		
	return principal* Math.pow((1+(rate/100)),time) - principal;
		
	}
	
}


public class App 
{
    public static void main( String[] args )
    {Scanner sc  = new Scanner(System.in);
    System.out.println("Enter Principal");    
    int pr = sc.nextInt();
    System.out.println("Enter rate");    
    double rt = sc.nextDouble();
    System.out.println("Enter time");    
    int tm = sc.nextInt();
    System.out.println("The Simple Interest is "+Interest.SI(pr, rt, tm));
    System.out.println("The Compound Interest is "+Interest.CI(pr, rt, tm));    
    
    }
}
