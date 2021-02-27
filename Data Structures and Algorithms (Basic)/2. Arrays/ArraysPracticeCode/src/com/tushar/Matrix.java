package com.tushar;

public class Matrix {

	public static void main(String[] args) {
		int a[][] = {{1, 0, 0},
					{0, 1, 0},
					{0, 0, 1}};
		boolean flag = true;
		var rows = a.length;//3
		var cols = a[0].length;//3
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		if(rows != cols) {
			System.out.println("Matrix should be a square matrix");
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++){
				if((i==j && a[i][j]==1) || (i!=j && a[i][j]==0)) {
					flag = true;
				}
				
				if((i==j && a[i][j]!=1) || (i!=j && a[i][j]!=0)) {
					flag = false;
					System.out.println("it's not an identity matrix.");
					break;
				}
			
			}
			
		}
		if(flag) {
			System.out.println("it's an identity matrix.");
		}
		
		for(int i = 0; i< a.length; i++) {//printing matrix
			for(int j = 0; j < a.length; j++) {
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
