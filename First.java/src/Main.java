// 숫자 -> 문자
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 만들어야 할 것
        // 요리 제목을 입력 받아서 저장하기
        // 요리 별점을 1~5 사이의 실수로 입력받기(double이나 float로 받으면 될듯)
        // 좋아하는 요리 레시피를 한 문장씩 10 문장 입력하기
        Scanner sc = new Scanner(System.in); // Scanner 객체를 new 명령어로 생성
        System.out.println(" 좋아하는 요리 제목을 입력해 주세요 ");
        System.out.println(" 해당 요리의 점수를 1~5점 사이의 소수점이 있는 실수로 입력해 주세요");
        System.out.println(" 해당 요리의 레시피를 한 문장씩 총 10문장을 입력해 주세요");

        String title = sc.nextLine(); // sc(Scanner)의 .next(); 를 실행하면 input 변수에 입력한 변수를 받음
        double score = sc.nextDouble();
        sc.nextLine();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();

        title = " [ " + title + " ] ";
        double percentRate = score * 100 / 5 ;
        System.out.println(title);
        System.out.println("별점 : " + score + " " + "( " + percentRate + " % )");
        System.out.println("1." + input1);
        System.out.println("2." + input2);
        System.out.println("3." + input3);
        System.out.println("4." + input4);
        System.out.println("5." + input5);
        System.out.println("6." + input6);
        System.out.println("7." + input7);
        System.out.println("8." + input8);
        System.out.println("9." + input9);
        System.out.println("10." + input10);

    }

}


//        int intNumber = 10;
//        double doubleNumber = 5.5;
//
//        double result = intNumber + doubleNumber;
//
//        System.out.println("Plus => " + result);
//
//        // 정수로 나누기
//        int iResult = intNumber / 4;
//        System.out.println( "divide int => " + iResult);
//        // 실수로 나누기
//
//        double dResult = intNumber / 4.0;
//        System.out.println("divide double => " + dResult);
        // byte -> int 형변환
//        byte byteNumber = 10;
//        int intNumber = byteNumber;
//        System.out.println(intNumber);

        // char -> int 형변환
//        char charAlphabet = 'A';
//        intNumber = charAlphabet;
//        System.out.println(intNumber);
//
        // int -> number 형변환
//        intNumber = 100;
//        long longNumber = intNumber;
//        System.out.println(longNumber);
//
        // int -> double 형변환
//        intNumber = 12420;
//        double doubleNumber = intNumber;
//        System.out.println(doubleNumber);

