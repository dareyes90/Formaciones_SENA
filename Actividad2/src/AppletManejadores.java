import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import java.applet.*;

public class AppletManejadores extends Applet implements ActionListener {

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

	public AppletManejadores() {
		setLayout(new GridLayout(5, 3, 10, 10));
		l1 = new Label("X");
		l2 = new Label("Y");
		l3 = new Label("RESULTADO");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t3.setEditable(false);
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("X");
		b4 = new Button("/");
		b5 = new Button("Raiz X");
		b6 = new Button("Raiz Y");
		b7 = new Button("X a la Y");
		b8 = new Button("Y a la X");
		b9 = new Button("X mod Y");
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			sumar();
		} else if (e.getSource().equals(b2)) {
			restar();
		} else if (e.getSource().equals(b3)) {
			multiplicar();
		} else if (e.getSource().equals(b4)) {
			dividir();
		} else if (e.getSource().equals(b5)) {
			raiz(Double.parseDouble(t1.getText()));
		} else if (e.getSource().equals(b6)) {
			raiz((Double.parseDouble(t2.getText())));
		} else if (e.getSource().equals(b7)) {
			potencia((Double.parseDouble(t1.getText())), (Double.parseDouble(t2.getText())));
		} else if (e.getSource().equals(b8)) {
			potencia((Double.parseDouble(t2.getText())), (Double.parseDouble(t1.getText())));
		} else if (e.getSource().equals(b9)) {
			XmodY(Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()));
		}
	}

	private void XmodY(int dividendo, int divisor) {
		if (divisor < 0 || divisor > dividendo) {
			JOptionPane.showMessageDialog(null, "En esta primera versión, no es posible realizar este calculo");
		} else {
			while (dividendo >= divisor) {
				dividendo = dividendo - divisor;
			}
			t3.setText("" + dividendo);
		}
	}

	private void potencia(double base, double exponente) {
		if (exponente < 0.0) {
			JOptionPane.showMessageDialog(null, "En esta primera versión, no es posible realizar este calculo");
		} else {
			double resultado = Math.pow(base, exponente);
			t3.setText("" + resultado);
		}
	}

	private void raiz(double base) {
		if (base < 0.0) {
			JOptionPane.showMessageDialog(null, "En esta primera versión, no es posible realizar este calculo");
		} else {
			double resultado = Math.sqrt(base);
			t3.setText("" + resultado);
		}
	}

	private void dividir() {
		if (Double.parseDouble(t2.getText()) == 0.0) {
			JOptionPane.showMessageDialog(null, "El coeficient no puede ser el numero 0");
		} else {
			double resultado = Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());
			t3.setText("" + resultado);
		}
	}

	private void multiplicar() {
		double resultado = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
		t3.setText("" + resultado);
	}

	private void restar() {
		double resultado = Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
		t3.setText("" + resultado);
	}

	public void sumar() {
		double resultado = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
		t3.setText("" + resultado);
	}
}
