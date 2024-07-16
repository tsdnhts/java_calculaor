package week2.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자( char / 1byte), 문자열(String)
        // String = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작' / 참조형 변수는 '대문자로 시작'
        // Wrapper 클래스의 경우 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장 , 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함( =주소형 변수)

        //사용 빈도 : char < String
        // String이 가지고 있는 기능이 더 많다
        // Wrapper class와도 비슷 -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper로 감싸서 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length

        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0,3);
        System.out.println(strSub);

        // (4) equals(String str)
        String newStr = "abcd";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char[]
        char [] strCharArray = str.toCharArray();
        System.out.println(strCharArray);

        // (6) 반대로 char[] -> String -> char
        char[] charArray = {'A','B','C','D'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
        // a, b, c, d 라는 char 배열이 String형태의 ABCD로 변경된다
    }
}
