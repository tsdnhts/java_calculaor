package week2.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // 순서가 있는 데이터의 집합 => Array와 비슷(최초 길이를 알아야 함)
        // 처음에 길이를 몰라도 만들 수 있음!
        // 1) Array -> 정적 배열
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다)
        //  - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        //  - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(99);
        intList.add(33);
        intList.add(55);

        System.out.println(intList.get(0));
        System.out.println(intList.get(1));
        System.out.println(intList.get(2));
        System.out.println("---------------------");

        // 2번째 있는 값(33)을 변경하고 싶을 때.
        // 인덱스 값인 1, 변경할 값인 15를 기입하여 변경
        intList.set(1,15);
        System.out.println(intList.get(1));
        System.out.println("---------------------");


        // 삭제
        intList.remove(0);
        // 0번 방에 있던 99를 삭제, 15, 55 2가지 값만 남아 0번째인 15가 또 출력된다
        System.out.println(intList.get(0));

        // 전체 삭제
        intList.clear();
        System.out.println("---------전체 삭제 클리어 후------------");
        System.out.println(intList.toString());
    }
}
