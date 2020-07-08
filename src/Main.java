import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        int num1 = input.nextInt();
        System.out.println("Dame otro numero para multiplicarlo: ");
        int num2 = input.nextInt();

        while(num1 < 0 || num2 < 0)
        {
            System.out.println("Dame un numero: ");
            num1 = input.nextInt();
            System.out.println("Dame otro numero para multiplicarlo: ");
            num2 = input.nextInt();
        }
        int resultado = 0;



        if (num1 < num2)
        {
            num1 = num1 - num2;
            num2 = num2 + num1;
            num1 = num2 - num1;

        }

        for ( int i = 0; i < num2; i++)
        {
            resultado = resultado + num1;

        }
        System.out.println(resultado);

    }
}
