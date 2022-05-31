package LAB2_EMANUELVINICIUS;

public class RegistroTempoOnline {
	
	private String disciplina;
	private int tempoOnlineEsperado = 120;
	private int tempoAtual;
	
	
	public RegistroTempoOnline(String nomeDisciplina) {
		this.disciplina = nomeDisciplina;
	}
	
	public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
		this.disciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	public void adicionaTempoOnline(int tempo) {
		this.tempoAtual += tempo;
	}
	
	public boolean atingiuMetaTempoOnline() {
		if (this.tempoAtual >= tempoOnlineEsperado) {
			return true;
		} 
		 return false;
	}
	public String toString() {
		return disciplina + " " + tempoAtual + "/" + tempoOnlineEsperado;
	}
}
