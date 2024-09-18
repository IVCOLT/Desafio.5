import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double v = 0;
        double r = 0;
        double a = 0;
        int esc;

        do {
            System.out.println("Escolha oque você deseja calcular 1 = Volume. 2 = Raio. 3 = Altura.");
            esc = input.nextInt();

            if (esc > 3 || esc < 1) {
                System.out.println("Digite um valor valido! (1, 2 ou 3)");
            }
        } while (esc > 3 || esc < 1);


        if (esc == 1) {

            System.out.println("Digite o valor do Raio e Altura. Respectivamente: ");

            r = input.nextDouble();
            a = input.nextDouble();
            v = pi * r * r * a;

            System.out.println("Volume = " + v + ".");
        }
        if (esc == 2) {

            System.out.println("Digite o valor do Volume e Altura. Respectivamente: ");

            v = input.nextDouble();
            a = input.nextDouble();
            r = Math.sqrt(v / (pi * a));

            System.out.println("Raio = " + r + ".");
        }
        if (esc == 3) {

            System.out.println("Digite o valor do Volume e Raio. Respectivamente: ");

            v = input.nextDouble();
            r = input.nextDouble();
            a = v / (pi * (r * r));

            System.out.println("Altura = " + a + ".");
        }

        input.close();

    }

}


