package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
		
		int result = Integer.MAX_VALUE;
		
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
                
                for (int i=x; i<x+8; i++) {
                    for (int j=y; j<y+8; j++) {
                        
                        // arr 배열에서의 현재 위치의 값과 pattern1 배열에서 동일한 위치에 있는 값을 비교
                        if (arr[i][j] != pattern1[i-x][j-y]) {
                            rectPattern1++;
                        }

                        // arr 배열에서의 현재 위치의 값과 pattern2 배열에서 동일한 위치에 있는 값을 비교
                        if (arr[i][j] != pattern2[i-x][j-y]) {
                            rectPattern2++;
                        }
                    }
                }
                
                Math.min(rectPattern1, rectPattern2);
                
                result = Math.min(result, rects); 
            }
        }
		
		System.out.println(result);
	}

}
