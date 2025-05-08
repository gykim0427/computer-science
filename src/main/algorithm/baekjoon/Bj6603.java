package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// hard
public class Bj6603 {
	static int n; 
	
	static int[] arr;
	static int[] result;
	static boolean[] visit;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			
			if (n==0) {
				break;
			}
			
			arr = new int[n];
			
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
			
			result = new int[6];
			visit = new boolean[n]; 
			
			back(0, 0);
			
			sb.append("\n");
		}
		
		System.out.println(sb);	
	}
	
    public static void back(int start, int depth) {
        if (depth == 6) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            
            sb.append("\n");
            return;
        }

        for (int i=start; i<n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = arr[i];
                
                back(i, depth + 1);
                
                visit[i] = false;
            }
        }
    }
    
}
