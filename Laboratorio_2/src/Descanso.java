package LAB2_EMANUELVINICIUS;

public class Descanso {
	
	private int horas;
	private int semanas;
	private int status = this.horas / this.semanas;
	
	public void defineHorasDescanso(int valor) {
		this.horas = valor;
	}
	
	public void defineNumeroSemanas(int valor) {
		this.semanas = valor;
	}
	
	public String getStatusGeral() {
		if (this.horas == 0 || this.semanas == 0) {
			return "cansado";
		} else if (status < 26) {
			return "cansado";
		} else {
			return "descansado";
		}
	}
}	
