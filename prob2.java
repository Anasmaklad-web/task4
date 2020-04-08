package task3;

import java.util.Scanner;

public class prob2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[];
		 System.out.println("enter the size of the array");
	        int s1 = input.nextInt();
	        a = new int[s1];
	        System.out.println("enter the array");
	        for (int i = 0; i < s1; i++) {
	            int a1 = input.nextInt();
	            a[i] = a1;

	        }
		
	        System.out.println("enter the sum you want");
		     int sum = input.nextInt();
		     
		     boolean notExist =true;
		     
		for(int i =0;i < s1 ;i++) {
			for(int k = i+1 ;k < s1 ; k++) {
				if(a[i]+a[k]== sum ) {
					
					System.out.println("the two numbers are: " + a[i]+" and " + a[k]);
					System.out.println("the position of the two numbers  are: " + i+" and " + k);
					notExist = false;
					
				}
				
				
			}
			
			
		}
		
		if(notExist) {
			System.out.println("there is no two numbers the sum of them is "+sum);	
		}
	}	
	

}
