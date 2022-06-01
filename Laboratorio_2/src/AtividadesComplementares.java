package LAB2_EMANUELVINICIUS;

public class AtividadesComplementares {
	
	private int creditoEstagio;
	private int creditoProjeto;
	private double creditoCurso;
	private int creditos;
	private int totalCreditos;
	private int horas;
	private int[] horasEstagio, horasProjetos;
	private int indiceEstagio, indiceProjetos; 
	private double horasCursos;
	
	
	public AtividadesComplementares() {
		this.horasEstagio = new int[9];
		this.horasProjetos = new int[16];
		this.indiceEstagio = 0;
		this.indiceProjetos = 0;
		
	}
	void adicionarEstagio(int horas) {
		this.horasEstagio[indiceEstagio] = horas; 
		this.indiceEstagio++;
		this.creditoEstagio = (horas / 300) * 5;
	}
	public void adicionarProjeto(int meses) {
		this.horasProjetos[indiceProjetos] = horas; 
		this.indiceProjetos++;
		this.creditoProjeto = (meses / 3) * 2;
		}
	
	
	
	public void adicionarCurso(double horas) {
		this.horasCursos += horas;
		
	}
	public int contaCreditos() {
		this.totalCreditos += creditos;
		return this.totalCreditos;
	}
	public String[] pegaAtividades() {
		
	}

}
