package week2.operator;

public class w15 {
    public static void main(String[] args) {
        // for문 작성
        // (초기값 ; 조건문 ; 증가연산 )
//        for (int i=0; i < 5; i++){
//            System.out.println(i + "번째 값입니다");
//        }
        // 향상된 for 문
        // 기존 : for 문 안에 3개의 표현 -> ( 초기값 ; 조건문 ; 증가연산)
        // 향상된 for 문 : 2개로 줄여줌
        int [] numbers = {3,6,9,12,15};
        for (int number : numbers){
            System.out.println(number + "");
        }
    }
}
