package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10866 {
	static int front = 0;
	static int back = 0;
	static int size = 0;
	static int[] deque = new int[10000];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			
			switch (s[0]) {
				case "push_front": {
					deque[front] = Integer.parseInt(s[1]);
					front = (front - 1 + 10000) % 10000;
					size++;
					break;
				}
					
				case "push_back": {
					back = (back + 1) % 10000;
					size++;
					deque[back] = Integer.parseInt(s[1]);			
					break;
				}
				
				case "pop_front" : {
					int m = 0;
					
					if (size == 0) {
						m = -1;
					} 
					
					int ret = deque[(front + 1) % 10000];
					front = (front + 1) % 10000;
					size--;	
					m = ret;
							
					sb.append(m).append('\n');
					
					break;
				}
				
				case "pop_back": {
					int m = 0;
					
					if (size == 0) {
						m = -1;
					} 
					int ret = deque[back];
					back = (back - 1 + 10000) % 10000;
					size--;
					m = ret;
					
					sb.append(m).append('\n');
					
					break;
				}
				
				case "size": {
					
					break;
				}
				
				case "empty": {
					
					break;
				}
				
				case "front": {
					
					break;
				}
				
				case "back": {
					
					break;
				}
			}
		}
		

		
	}

}
