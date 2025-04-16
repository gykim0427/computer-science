package main.algorithm.baekjoon;

import java.util.Scanner;

public class Bj7568 {

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        for (int i=0; i<n; i++) {
        	int weight = sc.nextInt();
        	int height = sc.nextInt();
        	
        	arr[i][0] = weight;
        	arr[i][1] = height;
        }
        
        for (int i=0; i<n; i++) {
        	int rank = 1;
        	
        	for (int j=0; j<n; j++) {
        		if ((arr[i][0]<arr[j][0]) && (arr[i][1]<arr[j][1])) {
        			rank++;
        		}
        	}	
        	
        	System.out.print(rank + " ");
        }
	}
	
}
