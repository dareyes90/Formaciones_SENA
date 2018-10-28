package AppletMetodos;
import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletMétodos extends Applet implements ActionListener {

	private Label numeroCuenta, nombreCliente, saldo, resultado;
	private TextField tNumeroCuenta, tNombreCliente, tSaldo;
	private TextArea tResultado;
	private Button desplegar;
	private Panel p1, p2, p3;
	private Cuenta cuenta;

	public AppletMétodos() {
		setLayout(new GridLayout(0, 1));
		numeroCuenta = new Label("Numero de cuenta");
		tNumeroCuenta = new TextField();
		nombreCliente = new Label("Nombre del cliente");
		tNombreCliente = new TextField();
		saldo = new Label("Saldo de la cuenta");
		tSaldo = new TextField();
		p1 = new Panel(new GridLayout(0, 1));
		p1.add(numeroCuenta);
		p1.add(tNumeroCuenta);
		p1.add(nombreCliente);
		p1.add(tNombreCliente);
		p1.add(saldo);
		p1.add(tSaldo);
		add(p1);
		desplegar = new Button("Despliega cuenta");
		desplegar.addActionListener(this);
		p2 = new Panel();
		p2.add(desplegar);
		add(p2);
		resultado = new Label("Resultado");
		tResultado = new TextArea();
		p3 = new Panel(new GridLayout(0, 2));
		p3.add(resultado);
		p3.add(tResultado);
		add(p3);
	}

	public void init() {
		resize(400, 500);
	}

	public void actionPerformed(ActionEvent e) {
		cuenta = new Cuenta(Integer.parseInt(tNumeroCuenta.getText()), Double.parseDouble(tSaldo.getText()),
				nombreCliente.getText());
		tResultado.setText(cuenta.getNumero()+"   "+cuenta.getNombre()+"   "+cuenta.getSaldo());
	}

}
