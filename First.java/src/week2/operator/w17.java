package week2.operator;

import java.util.Scanner;

public class w17 {
    public static void main(String[] args) {
        // 입력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외한 구구단 수의 값
        for (int i = 2; i <= 9; i++) {// 구구단의 첫 번째 수
            if (i == passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) { // 구구단의 두 번째 수
                System.out.println(i + "곱하기 " + j + "는" + (i*j) + "입니다.");
            }
        }
    }
}