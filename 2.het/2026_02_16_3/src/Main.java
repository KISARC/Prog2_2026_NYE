import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int age;
        do {
            System.out.println("Hány éves vagy?");
            age=scanner.nextInt();
        }while(age<1 || age>20);

        String candleTop="",candleMidle="",candleBottom="";

        for (int i=0;i<age;i++){
            if(i==age-+1){
                candleTop+="*";
                candleMidle+="|";
                candleBottom+="-";
                System.out.println(candleTop);
                System.out.println(candleMidle);
                System.out.println(candleBottom);
            }
            else{
                candleTop+="* ";
                candleMidle+="| ";
                candleBottom+="--";

            }

        }
    }
}