import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.applet.*;

public class AppletCalculadora extends Applet implements ActionListener {

	TextField t1;
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
	Panel p1, p2;
	double num1, num2, res;
	String entrada = "";
	String operacion = "";
	int contadorPunto = 0;
	int contadorOperacion = 0;

	public AppletCalculadora() {
		setLayout(new BorderLayout());
		p1 = new Panel();
		p2 = new Panel();
		t1 = new TextField(25);
		t1.setEditable(false);
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b10 = new Button(".");
		b11 = new Button("CE");
		b12 = new Button("+");
		b13 = new Button("-");
		b14 = new Button("=");
		b15 = new Button("*");
		b16 = new Button("/");
		b17 = new Button("C");
		p1.add(t1);
		p2.setLayout(new GridLayout(6, 3, 5, 5));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b0);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);
		p2.add(b17);
		add(p1);
		add(p2, BorderLayout.SOUTH);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Button button = (Button) e.getSource();
		if (esNumero(e.getSource()) || (contadorPunto == 0 && esPunto(e.getSource()))) {
			entrada = entrada + button.getLabel();
			actualizarPantalla();
		} else if (contadorOperacion == 0 && esOperacion(button)) {
			num1 = Double.parseDouble(entrada);
			entrada = "";
			contadorPunto = 0;
			actualizarPantalla();
		} else if (esResultado(e.getSource())) {
			if (entrada.equals("")) {
				t1.setText(entrada);
			} else {
				num2 = Double.parseDouble(entrada);
				realizarOperacion();
			}
		} else if (button.getLabel().equals("C")) {
			num1 = 0;
			num2 = 0;
			res = 0;
			entrada = "";
			operacion = "";
			contadorPunto = 0;
			contadorOperacion = 0;
			t1.setText(entrada);
		} else if (button.getLabel().equals("CE")) {
			entrada = "";
			t1.setText(entrada);
		}
	}

	private void realizarOperacion() {
		if (operacion.equals("+")) {
			res = num1 + num2;
			t1.setText("" + res);
		} else if (operacion.equals("-")) {
			res = num1 - num2;
			t1.setText("" + res);
		} else if (operacion.equals("*")) {
			res = num1 * num2;
			t1.setText("" + res);
		} else if (operacion.equals("/")) {
			if (num2 == 0) {
				t1.setText("Error matematico");
			} else {
				res = num1 / num2;
				t1.setText("" + res);
			}
		}
	}

	private boolean esResultado(Object source) {
		if (source.equals(b14)) {
			return true;
		}
		return false;
	}

	private boolean esOperacion(Button source) {
		if (source.equals(b12) || source.equals(b13) || source.equals(b15) || source.equals(b16)) {
			contadorOperacion++;
			operacion = source.getLabel();
			return true;
		}
		return false;
	}

	private boolean esPunto(Object o) {
		if (o.equals(b10)) {
			contadorPunto++;
			return true;
		}
		return false;
	}

	public boolean esNumero(Object o) {
		if (o.equals(b0) || o.equals(b1) || o.equals(b2) || o.equals(b3) || o.equals(b4) || o.equals(b5) || o.equals(b6)
				|| o.equals(b7) || o.equals(b8) || o.equals(b9)) {
			return true;
		}
		return false;
	}

	public void actualizarPantalla() {
		t1.setText(entrada);
	}
}