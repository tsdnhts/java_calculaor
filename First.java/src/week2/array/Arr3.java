package week2.array;

public class Arr3 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = a; // 얕은복사

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정(1->3)
        System.out.println(a[0]); // 출력이 3으로 나옴( <- a 배열의 0번째 순번값도 3으로 조회가 된다.
        // b의 값을 바꿨지만, a 배열의 값도 바뀌게 되어 부적절한 상황이 발생할 수 있음
    }
}
