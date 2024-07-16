package week2.array;

public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArray = new int[3];
        String[] stringArray = new String[3];
        boolean[] boolArray = new boolean[3];

        // 배열 선언 먼저! -> 나중에 초기화
        int[] intArray2;
        intArray2 = new int[3]; // 위의 방법과 다른 방법이지만 동일하게 생성된다

        String[] stringArray2;
        stringArray2 = new String[3];

        boolean[] boolArray2;
        boolArray2 = new boolean[3];

        // 생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회한다
        // (1) 단건 조회

        System.out.println(intArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(boolArray[2]);
        System.out.println("----------------------");
        // (2) 다건 조회
        for (int i=0; i< intArray2.length; i++){
            System.out.println(intArray2[i]);
        }
        System.out.println(stringArray2[1]);
        System.out.println(boolArray2[2]);
    }
}
