import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature;
        System.out.print("Az aktuális hőmérséklet: ");
        temperature=scanner.nextInt();

        if(temperature<0)
        {
            System.out.println("Fagypont alatti");
        }
        else if(temperature<30){
            System.out.println("Átlagos");
        }
        else{
            System.out.println("Túl meleg");
        }

    }
}