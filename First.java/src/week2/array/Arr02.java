package week2.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화
        // 1. 배열에 특정값 대입하여 선언
        int[] intArr = {1,2,3,4,5};
        String[] stringArray = {"a","b","c","d","e"};
        boolean[] boolArray = {false,true,true,false,false};

        // 2. for 문을 통해서 대입
        // 1~5에서 intArr[i] = i; 구문을 추가하니 0~4로 바뀐다
        for (int i=0; i< intArr.length; i++){
            intArr[i] = i;
            System.out.println(intArr[i]) ;
        }

        //  향상된 for문
        // for ( int i : 배열이름) { 실행문 }
        for (int i : intArr) {
            System.out.println(i);
        }
        // 3. 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr,1);
        for(int i : intArr) {
            System.out.println(i);
        }
    }
}
