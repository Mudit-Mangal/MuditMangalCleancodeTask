package com_home_task.Task2;
import java.util.*;

class Construction{
	static double cost(int MaterialStandard, double area, boolean home) {
		if (MaterialStandard==0) {
			return 1200*area;
		}
		else if(MaterialStandard==1) {
			return 1500*area;
		}
		else{
		if(home) {
			return 2500*area;
		}
		else {
			return 1800*area;
		}
	}	
}
}

public class App2 {
	
public static void main(String [] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter standard value : normal-0, above-1 and high-2");
	int mat = sc.nextInt();
	System.out.println("enter area");
	double area = sc.nextDouble();
	boolean home = false;
	if (mat==2) {
	System.out.println("enter Y for Yes or N for No for fully automated home");
	home = (sc.next().equalsIgnoreCase("Y"));
	}
	System.out.println(Construction.cost(mat,area,home));

}
}
