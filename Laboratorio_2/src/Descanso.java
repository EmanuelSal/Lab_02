package LAB2_EMANUELVINICIUS;

public class Descanso {
	
	private int horas;
	private int semanas;
	private int status;
	
	public void defineHorasDescanso(int valor) {
		this.horas = valor;
	}
	public void defineNumeroSemanas(int valor) {
		this.semanas = valor;
		if (this.semanas != 0) {
			status = this.horas / this.semanas;
		}
	}
	public String getStatusGeral() {
		if (this.horas == 0 || this.semanas == 0) {
			return "cansado";
		} else if (status >= 26) {
			return "descansado";
		} else {
			return "cansado";
		}
	}
}	
