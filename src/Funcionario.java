public class Funcionario {
   private int matricula;
   private String nome;
   private double salario;
   private double inss;
   private double salarioLiquido;

   public Funcionario() {

   }

   public double inss() {
      return inss;
   }

   public double salarioLiquido() {
      return salario - inss;
   }

   public void calcularINSS() {
      inss = salario * 0.15;
   }

   public int getMatricula() {
      return matricula;
   }

   public void setMatricula(int matricula) {
      this.matricula = matricula;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
      this.calcularINSS();
   }
}