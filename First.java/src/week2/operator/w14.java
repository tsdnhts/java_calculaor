package week2.operator;

public class w14 {
    public static void main(String[] args) {
        int month = 1;
        String monthString = "";

        //Switch문
        switch(month){
            // case ~~ 연산
            case 1 :
                monthString = "01월";
                break;
            //shift + tap = tap 한칸만큼 앞으로 오기
            case 2:
                monthString = "02월";
                break;
            case 3:
                monthString = "03월";
                break;
            case 4:
                monthString = "04월";
                break;
            case 5:
                monthString = "05월";
                break;
            case 6:
                monthString = "06월";
                break;
            case 7:
                monthString = "07월";
                break;
            case 8:
                monthString = "08월";
                break;
            case 9:
                monthString = "09월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = " 해당하는 월 없음";
        }
        System.out.println(monthString);
    }
}
