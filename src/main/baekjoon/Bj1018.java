package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()); 
		
		int[][] arr = new int[n][m];
		
		for (int i=0; i<n; i++) {
			String row = br.readLine();
			
			for (int j=0; j<m; j++) {
				arr[i][j] = (row.charAt(j) == 'B') ? 1 : 0;
			}
		}
		
		int minNum = Integer.MAX_VALUE;
		
		for (int i=0; i<=n-8; i++) {
            for (int j=0; j<=m-8; j++) {
                int[][] pattern1 = {
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1}
                    };
                
                int[][] pattern2 = {
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0}
                    };
                
                int rectPattern1 = 0;
                int rectPattern2 = 0;
                
                for (int k=i; k<i+8; k++) {
                    for (int l=j; l<j+8; l++) {
                        if (arr[k][l] != pattern1[i-k][j-l]) {
                            rectPattern1++;
                        }

                        if (arr[k][l] != pattern2[i-k][j-l]) {
                            rectPattern2++;
                        }
                    }
                }
                
                int rects = Math.min(rectPattern1, rectPattern2);
                
                minNum = Math.min(minNum, rects); 
            }
        }
		
		System.out.println(minNum);
	}

}
