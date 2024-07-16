package week2.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기
        int[] arr = {3,2,1,5,1};

        // 최대값 초기화 세팅
        int max = arr[0];

        for (int num : arr){
            if (num>max){
                max = num;
            }
        }
        System.out.println("최대값은 => " + max);

        // 최소값 구하기
        int[] arr2 = {1,6,3,7,9,5,2,0};

        int min = arr2[0];

        for (int num : arr2){
            if (num<min){
                min = num;
            }
        }
        System.out.println("최소값은 => " + min);
    }
}
