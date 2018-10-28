package PruebaLaptop2;

import AppletMetodos.Cuenta;

public class Laptop {

	private static String marca, modelo;
	private static int memoria = 0;
	private static double precio = 0;
	private static int cuenta = 0;

	public Laptop() {
		cuenta++;
	}

	public Laptop(String marca, String modelo, int memoria, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.precio = precio;
		cuenta++;
	}

	public Laptop(String marca, String modelo, int memoria, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.precio = (int) precio;
		cuenta++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	// Sobrecarga del metodo anterior con parametro double
	public void setMemoria(double memoria) {
		this.memoria = (int) memoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Sobrecarga del metodo anterior para que acepte como parametro un int
	public void setPrecio(int precio) {
		this.precio = (double) precio;
	}

	public static int getCuenta() {
		return cuenta;
	}

	public static double getCuenta(int cuenta) {
		return (double) cuenta;
	}
}
