package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		
		int n = Integer.parseInt(inputArr[0]);
		int m = Integer.parseInt(inputArr[1]);
		
		String[][] arr = new String[m][n];
		
		if (m == 1) {
			for (int i=0; i<n; i++) {
				System.out.println(i+1);
			}
		} if (m == 2) {
			for (int i=0; i<n; i++) {
				int flag = 0;
				
				for (int j=0; j<n-1; j++) {
					int firstVal = i + 1;
					int secondVal = j + 1;
					
					if ((firstVal == secondVal) || (flag == 1)) {
						secondVal = secondVal + 1;
						flag = 1;
					}
					
					System.out.println(firstVal + " " + secondVal);
				}
			}
		} if (m == 4) {
			for (int i=0; i<n; i++) {
				int flag = 0;
				
				for (int j=0; j<n-1; j++) {
					for (int k=0; k<n-2; k++) {
						int firstVal = i + 1;
						int secondVal = j + 1;
						int thirdVal = k + 1;
						int fourthVal = k + 1;
						
						if ((firstVal == secondVal) || (flag == 1)) {
							secondVal = secondVal + 1;
							flag = 1;
						} 
						
						int swap = 0;
						
						if (firstVal == thirdVal) {
							fourthVal = fourthVal + 1;
						} if (thirdVal == fourthVal) {
							if (swap == 0) { 
								fourthVal = fourthVal + 1;
								swap = 1;
							} if (swap == 1) {
								thirdVal = thirdVal + 1;
								swap = 0;
							}
						}
						
						System.out.println(firstVal + " " + secondVal + " " + thirdVal + " " + fourthVal);
					}
				}
			}
		}
	}
}
