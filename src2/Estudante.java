class Estudante {
    private String nome;
    private int nota1;
    private int nota2;

    public Estudante(String nome, int nota1, int nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calculaMedia() {
        return (double) (nota1 + nota2) / 2;
    }

    public String getAcademicSituation() {
        double media = calculaMedia();
        if (media >= 70) {
            return "Aprovado";
        } else if (media < 40) {
            return "Reprovado";
        } else {
            return "Final";
        }
    }

    public String getName() {
        return nome;
    }
}