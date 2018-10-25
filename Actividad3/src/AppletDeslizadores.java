import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JScrollBar;

public class AppletDeslizadores extends Applet implements AdjustmentListener {

	JScrollBar barra1, barra2, barra3;
	Panel barras, fondo;
	Color color;
	Label deslizador1, deslizador2, deslizador3;

	public AppletDeslizadores() {
		setLayout(new BorderLayout());
		barra1 = new JScrollBar(0, 0, 100, 0, 255);
		barra2 = new JScrollBar(0, 0, 100, 0, 255);
		barra3 = new JScrollBar(0, 0, 100, 0, 255);
		barras = new Panel();
		barras.setLayout(new GridLayout(1, 3));
		fondo = new Panel();
		fondo.setLayout(new GridLayout(3, 1, 10, 10));
		deslizador1 = new Label("Deslizador 1");
		deslizador2 = new Label("Deslizador 2");
		deslizador3 = new Label("Deslizador 3");
		barras.add(barra1);
		barras.add(barra2);
		barras.add(barra3);
		fondo.add(deslizador1);
		fondo.add(deslizador2);
		fondo.add(deslizador3);
		add(barras, BorderLayout.NORTH);
		add(fondo, BorderLayout.CENTER);
		barra1.addAdjustmentListener(this);
		barra2.addAdjustmentListener(this);
		barra3.addAdjustmentListener(this);
		barra1.setAutoscrolls(true);
		barra2.setAutoscrolls(true);
		barra3.setAutoscrolls(true);
	}

	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		color = new Color(barra1.getValue(), barra2.getValue(), barra3.getValue());
		fondo.setBackground(color);
		deslizador1.setBackground(color);
		deslizador2.setBackground(color);
		deslizador3.setBackground(color);
	}
}
