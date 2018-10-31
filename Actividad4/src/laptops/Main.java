package laptops;

import pruebaLaptop2.Laptop;

public class Main {
	
	private static Laptop laptop1, laptop2, laptop3;

	public static void main(String[] args) {
		laptop1 = new Laptop();
		laptop2 = new Laptop("Dell", "N4110", 8096, 2400000);
		laptop3 = new Laptop("Lenovo", "T450s", 16384, 4000000);
	}
	
	public void modificarLaptops() {
		laptop1.setMarca("HP");
		laptop2.setMemoria(4048);
		laptop3.setPrecio(4200000);
	}
	
	public int laptosCreados(){
		return laptop1.getCuenta();
	}
}
