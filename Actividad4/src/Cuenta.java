
public class Cuenta {

	private int numero;
	private double saldo;
	private String nombre;

	public Cuenta(int numero, double saldo, String nombre) {
		this.numero = numero;
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
