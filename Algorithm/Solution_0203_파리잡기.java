import java.util.Scanner;

public class Solution_0203_파리잡기 {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            // Matrix 입력
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] Matrix = new int[N][N];
        

            for (int p = 0; p < N; p++) {
                for (int q = 0; q < N; q++) {
                    Matrix[p][q] = sc.nextInt();
                }
            } // Matrix 입력
            
            int sum, max = 0;
            // 각 경우, Matrix의 합 구하기
            for (int ps = 0; ps <= N - M; ps++) { //ps, qs ==> 사각형의 가로 세로 시작점의 인덱스 
                for (int qs = 0; qs <= N - M ; qs++) {
                    sum = 0;
                    for (int p = ps; p < ps+ M; p++) { // 한 케이스에 대해 정사각형 계산 (시작점 +M-1) 계산 
                        for (int q = qs; q < qs + M; q++) {
                            sum += Matrix[p][q];
                        }

                    }// 각 사각형 하나 씩 
                    if (max<sum) 
                        max = sum;
                }
            }// 총 비교  마무리
            System.out.println("#"+i+" "+max);

        } // for T

    } // main

}// class

