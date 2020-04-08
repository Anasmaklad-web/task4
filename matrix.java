package task3;

import java.util.Scanner;

public class matrix {

	public matrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// name : anas mohamed maklad    Bn: 16     Sec: 1
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" enter the size of the first matrix row then coloumn ");
		int x =input.nextInt();
		int y =input.nextInt();
		int a [][] = new int[x][y]; 
		
		
		System.out.println(" enter the size of the second matrix row then coloumn ");
		int x1 =input.nextInt();
		int y1 =input.nextInt();
		int b [][] =new int [x1][y1];
		
		if (y != x1) {
			
			System.out.println(" the two matricies can not be multiblyed");
			
			System.exit(0);
		
		}
		
		System.out.println(" enter the first row of the first matrics matrix row by row");
		
		for( int i =0; i < x; i++) {
			for( int k =0; k < y ; k++) {
				
				int n = input.nextInt();
				a[i][k]= n;
				
			}
			
		}
		
		System.out.println(" enter the first row of the second matrics matrix row by row ");
		
		for( int i =0; i < x1; i++) {
			for( int k =0; k < y1 ; k++) {
				
				int n = input.nextInt();
				b[i][k]= n;
				
			}
			System.out.println(" enter the row number  "+i );
		}
		
		int z [][] = new int [x][y1];
		int r = 0;
		
		for( int i =0; i < x; i++) {
			for( int k =0; k < y1 ; k++) {
				for (int l =0; l < y ;l++ ) {
					
					r = r +(a[i][l]*b[l][k] );
					
				}
				z[i][k] = r;
				
				r= 0;
				}
			}
		System.out.println(" the product of matrix multiplication is ");
		
		for( int i =0; i < x; i++) {
			for( int k =0; k < y1 ; k++) {
				
				System.out.print("   "+z[i][k]);
			}
			System.out.println("");
			
			}
		
			}
		
	}


