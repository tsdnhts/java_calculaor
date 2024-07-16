package week2.operator;

public class w12 {
    public static void main(String[] args) {
        // 중첩 if문
        boolean flag = true;
        int number = 5;

        if(flag) {
            if (number == 1){
                System.out.println("flag가 true이고, number는 1입니다");
            } else if(number == 2){
                System.out.println("flag가 true이고, number는 2입니다");
            }
            else {
                System.out.println("flag가 true이고, number는 1이나 2가 아닌 수입니다");

            }
        }
            else{
            if (number == 1){
                System.out.println("flag가 false이고, number는 1입니다");
            } else if(number == 2){
                System.out.println("flag가 false이고, number는 2입니다");
            }
            else {
                System.out.println("flag가 false이고, number는 1이나 2가 아닌 수입니다");

            }

            }
        }
    }
