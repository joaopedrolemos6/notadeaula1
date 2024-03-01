import java.util.Scanner;


public class Main {
    public static void main(String[]args) {
        int r;
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        do {
            System.out.println("Digite 1 para somar. \n Digite 2 para multiplicar \n Digite 3 para subtrair");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Número 1:");
                    n1=sc.nextInt();
                    System.out.println("Número 2:");
                    n2=sc.nextInt();
                    c.somar (n1,n2);
                    break;
                case 2:
                    System.out.println("Número 1:");
                    n1=sc.nextInt();
                    System.out.println("Número 2:");
                    n2=sc.nextInt();
                    c.multiplicar (n1,n2);
                    break;
                case 3:
                    System.out.println("Número 1:");
                    n1=sc.nextInt();
                    System.out.println("Número 2:");
                    n2=sc.nextInt();
                    c.subtrair (n1,n2);
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            System.out.println("para repetir, digite 0");
            r = sc.nextInt();
        } while (r== 0);
    }
}