package week2.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        // linked List
        // 메모리에 남는 공간을 요청해서 요기저기 나누어 실제 값을 저장
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조

        // 기본적 기능은 -> ArrayList와 동일하다
        // LinkedList는 값 -> 여기저기 나누어서 저장 => 조회 속도가 느림(찾아야 함)
        // 값을 추가하거나 삭제할 때는 빠름(순서대로 추가 또는 삭제하지 않고 집어넣기만 하면 됨)

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);

        System.out.println("------------------------------------");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println("--------------전체 조회를 실시합니다--------------");
        // 전체 조회
        System.out.println(linkedList.toString()); // 조회 시 속도는 arraylist보다 느리다
        System.out.println("----------특정 위치에 값이 추가되었습니다------------");

        // 특정 위치에 값 추가
        linkedList.add(2,50000);
        System.out.println(linkedList.toString());

        // 특정 위치의 값 변경하기

        linkedList.set(1,-500);
        System.out.println("----------특정 위치에 값이 변경되었습니다------------");
        System.out.println(linkedList.toString());

        // 특정 값 삭제
        linkedList.remove(2);
        System.out.println("----------특정 위치에 값이 삭제되었습니다------------");
        System.out.println(linkedList.toString());

        // 전체 삭제
        linkedList.clear();
        System.out.println("------------값이  전부 삭제되었습니다---------------");
        System.out.println(linkedList.toString());

    }
}
