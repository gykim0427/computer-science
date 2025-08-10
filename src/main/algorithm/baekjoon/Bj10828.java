package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj10828 {
	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String[] strArr = br.readLine().split(" ");
			
			switch (strArr[0]) {
				case "push" :
					int x = Integer.parseInt(strArr[1]);
					stack.push(x);
					break;
				case "pop" :
					if (!stack.isEmpty()) {
                        System.out.println(stack.pop());
					} else {
						System.out.println("-1");
					}
					break;
				case "size" :
					System.out.println(stack.size());
					break;
				case "empty" :
					if (!stack.isEmpty()) {
                        System.out.println("0");
					} else {
						System.out.println("1");
					}
        			break;
				case "top" :
					if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
					} else {
						System.out.println("-1");
					}
        			break;
			}
		}
	}
}
