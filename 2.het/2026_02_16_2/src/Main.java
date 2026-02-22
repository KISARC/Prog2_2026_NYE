import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float time;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Hány másodperccel hallatszott a villámlás után a dörgés?");
            time = scanner.nextFloat();
        }while (time<=0);
        float speedOfSound=300.0f;
        float distance = time*speedOfSound;
        System.out.println("A villámlás " + distance +" méterre volt" );

    }
}