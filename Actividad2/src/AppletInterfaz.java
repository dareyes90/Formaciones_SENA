import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletInterfaz extends Applet implements ItemListener {

	Label l1;
	List ch1;
	Panel p1;

	public AppletInterfaz() {
		setLayout(new BorderLayout());
		p1 = new Panel(new FlowLayout());
		ch1 = new List(3);
		ch1.add("Gray");
		ch1.add("Dark Gray");
		ch1.add("Cyan");
		ch1.add("Black");
		p1.add(ch1);
		l1 = new Label();
		ch1.addItemListener(this);
		add(p1, BorderLayout.NORTH);
		add(l1, BorderLayout.CENTER);
	}

	public void itemStateChanged(ItemEvent e) {
		switch (ch1.getSelectedIndex()) {
		case 0:
			l1.setBackground(Color.GRAY);
			p1.setBackground(Color.GRAY);
			break;
		case 1:
			l1.setBackground(Color.DARK_GRAY);
			p1.setBackground(Color.DARK_GRAY);
			break;
		case 2:
			l1.setBackground(Color.CYAN);
			p1.setBackground(Color.CYAN);
			break;
		case 3:
			l1.setBackground(Color.BLACK);
			p1.setBackground(Color.BLACK);
			break;
		default:
			break;
		}
		repaint();
	}
}
