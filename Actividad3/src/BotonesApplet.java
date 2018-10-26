import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.applet.*;

public class BotonesApplet extends Applet implements ActionListener {

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4, b5, b6, b7, b8;
	Panel p1, p2, p3, p4, p5, p6;

	public BotonesApplet() {
		setLayout(new GridLayout(0, 1));
		l1 = new Label("Numero 1");
		l2 = new Label("Numero 2");
		l3 = new Label("Resultado");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		b1 = new Button("Suma");
		b2 = new Button("Resta");
		b3 = new Button("Multiplica");
		b4 = new Button("Divide");
		b5 = new Button("Raiz de 1");
		b6 = new Button("Raiz de 2");
		b7 = new Button("Mayor");
		b8 = new Button("Limpia");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p1.setLayout(new GridLayout(0, 2));
		p1.add(l1);
		p1.add(t1);
		p6.setLayout(new GridLayout(0, 2));
		p6.add(l2);
		p6.add(t2);
		p2.setLayout(new GridLayout(0, 3));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p3.setLayout(new GridLayout(0, 2));
		p3.add(b4);
		p3.add(b5);
		p4.setLayout(new GridLayout(0, 3));
		p4.add(b6);
		p4.add(b7);
		p4.add(b8);
		p5.setLayout(new GridLayout(0, 2));
		p5.add(l3);
		p5.add(t3);
		add(p1);
		add(p6);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
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
			mayor((Double.parseDouble(t1.getText())), (Double.parseDouble(t2.getText())));
		} else if (e.getSource().equals(b8)) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}

	private void mayor(double d, double e) {
		if (d > e) {
			t3.setText("" + d);
		} else {
			t3.setText("" + e);
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
