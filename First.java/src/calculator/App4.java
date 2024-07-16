package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList<>(); // 연산 결과를 저장할 리스트

        while (true) {
            int num1 = 0;
            int num2 = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = Integer.parseInt(sc.next());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                }
            }

            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = Integer.parseInt(sc.next());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                }
            }

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.println("입력한 첫번째 값은 " + num1);
            System.out.println("입력한 두번째 값은 " + num2);
            System.out.println("입력한 연산자는 " + operator);

            int result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("오류: 유효하지 않은 연산자입니다.");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
                results.add(result); // 결과 저장

                if (results.size() > 10) {
                    results.remove(0); // 10개 초과시 가장 오래된 결과 삭제
                }
            }

            System.out.println("원하는 작업을 입력하세요 (계속 계산: enter, 삭제: remove, 조회: inquiry, 종료: exit)");
            String userInput = sc.next();

            if (userInput.equalsIgnoreCase("remove")) {
                if (!results.isEmpty()) {
                    results.remove(0);
                    System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
            } else if (userInput.equalsIgnoreCase("inquiry")) {
                System.out.println("저장된 연산결과:");
                for (int res : results) {
                    System.out.println(res);
                }
            } else if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }

        sc.close();
    }
}
