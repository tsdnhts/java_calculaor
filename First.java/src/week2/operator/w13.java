package week2.operator;

import java.util.Objects;
import java.util.Scanner;

public class w13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" A 입력 : ");
        String aHand = sc.nextLine();
        System.out.println(" A의 값이 입력 되었습니다");

        System.out.println("----------------------------------");

        System.out.println(" B 입력 : ");
        String bHand = sc.nextLine();
        System.out.println(" B의 값이 입력 되었습니다");

        System.out.println("----------------------------------");
        System.out.println(" 결과는 다음과 같습니다 ");

        // 두 개의 값을 비교하는 메서드 -> Objects.equls(좌,우) : 좌 우가 같은 경우 true, 다른 경우 false

        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println(" 무승부입니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println(" B의 승리입니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println(" A의 승리입니다. ");
            } else {
                System.out.println("잘못된 값이 입력되었습니다.");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "바위")) {
                System.out.println(" 무승부입니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println(" B의 승리입니다.");
            } else if (Objects.equals(bHand, "가위")) {
                System.out.println(" A의 승리입니다. ");
            } else {
                System.out.println("잘못된 값이 입력되었습니다.");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "보")) {
                System.out.println(" 무승부입니다.");
            } else if (Objects.equals(bHand, "가위")) {
                System.out.println(" B의 승리입니다. ");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println(" A의 승리입니다.");
            } else {
                System.out.println("잘못된 값이 입력되었습니다.");
            }
        }
        else {
            System.out.println("잘못된 값이 입력되었습니다.");
        }
    }
}