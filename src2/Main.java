import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.print("Digite a nota 2: ");
        int nota2 = scanner.nextInt();

        Estudante estudante = new Estudante(nome, nota1, nota2);
        String situacaoAcademica = estudante.media();

        System.out.println("A situação do aluno " + estudante.getName() + " é: " + situacaoAcademica);

        scanner.close();
    }
}