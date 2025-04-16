package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bj10845 {

	public static void main(String[] args) throws Exception {
		Queue<Integer> queue = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String[] strArr = br.readLine().split(" ");
			
			switch (strArr[0]) {
				
				case "push" :
					int x = Integer.parseInt(strArr[1]);
					queue.offer(x);
					break;
				case "pop" :
					if (!queue.isEmpty()) {
						System.out.println(queue.poll());
					} else {
						System.out.println("-1");
					}
					break;
				case "size" :
					System.out.println(queue.size());
					break;
				case "empty" :
					if (!queue.isEmpty()) {
						System.out.println("0");
					} else {
						System.out.println("1");
					}
					break;
				case "front" :
					if (!queue.isEmpty()) {
						System.out.println(queue.peek());
					} else {
						System.out.println("-1");
					}
					break;
				case "back" :
					if (!queue.isEmpty()) {
						int lastElement = 0;
						for (int element : queue) {
							lastElement = element;
						}
						System.out.println(lastElement);
					} else {
						System.out.println("-1");
					}
					break;
			}
		}
	}
}
