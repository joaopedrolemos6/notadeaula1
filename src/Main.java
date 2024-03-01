import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("digite sua matricula: ");
        f.setMatricula(sc.nextInt());
        sc.nextLine();

        System.out.println("digite seu nome completo: ");
        f.setNome(sc.nextLine());

        System.out.println("digite seu Salario: ");
        f.setSalario(sc.nextDouble());
        sc.nextLine();
        f.calcularINSS();

        double salarioLiquido = f.salarioLiquido();

        System.out.printf("Seu salário líquido é: R$ %.2f%n", salarioLiquido);
    }
    }
