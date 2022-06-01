package LAB2_EMANUELVINICIUS;

public class Disciplina {
    
    private String disciplina;
    private int notas;
    private double valornotas;
    private double[] totalnotas = new double[4];
    private double media;
    private int horas = 0;
    
    public Disciplina(String nomeDisciplina) {
        this.disciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota) { // notas possíveis: 1, 2, 3 e 4
        this.notas = nota;
        this.valornotas += valorNota;
        totalnotas[nota -1] = valorNota;
            
    }
    public boolean aprovado() {
        this.media = valornotas / notas;
        if (media >= 7.0) {
            return true;
        }
        return false;
    }
}
