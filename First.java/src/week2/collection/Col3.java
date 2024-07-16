package week2.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        // Stack
        // 수직으로 값을 쌓아놓고, 넣었다가 뺀다 , FIFO(Basket)
        // push, peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(10);
        intStack.push(15);
        intStack.push(20);


        while (!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
        System.out.println("-----");
    }
}
