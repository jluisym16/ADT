package pruebainicial;

public class Baño {
	boolean ocupado = false;
	double recaudacion =0;
	
	public Baño(boolean ocupado, double recaudacion) {
		super();
		this.ocupado = ocupado;
		this.recaudacion = recaudacion;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	@Override
	public String toString() {
		return "Baño [ocupado=" + ocupado + ", recaudacion=" + recaudacion + "]";
	}
	
	
}
