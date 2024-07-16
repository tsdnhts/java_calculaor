package week2.operator;

public class w05 {
    public static void main(String[] args) {
        // 대입 연산자
        int number = 10;
        number = number + 2;
        System.out.println(number); // 12

        number = number - 2;
        System.out.println(number); // 10

        number = number * 2;
        System.out.println(number); // 20

        number = number / 2;
        System.out.println(number); // 10

        number = number % 2;
        System.out.println(number); // 0

        number++;
        System.out.println(number); // 1

        number--;
        System.out.println(number); // 0


        System.out.println("---------------");

// 복합 대입 연산자
        number = 10;

        number += 2;
        System.out.println(number); // 12

        number -= 2;
        System.out.println(number); // 10

        number *= 2;
        System.out.println(number); // 20

        number /= 2;
        System.out.println(number); // 10

        number %= 2;
        System.out.println(number); // 0
    }
}
