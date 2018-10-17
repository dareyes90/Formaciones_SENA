import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletInterfaz extends Applet implements ItemListener {

	Label l1;
	List ch1;
	Panel p1, p2;

	public AppletInterfaz() {
		setLayout(new BorderLayout());
		ch1 = new List();
		ch1.add("Gray");
		ch1.add("Dark Gray");
		ch1.add("Cyan");
		ch1.add("Black");
		l1 = new Label();
		ch1.addItemListener(this);
		add(ch1, BorderLayout.NORTH);	
		add(l1, BorderLayout.CENTER);
	}

	public void itemStateChanged(ItemEvent e) {
		switch (ch1.getSelectedIndex()) {
		case 0:
			l1.setBackground(Color.GRAY);
			break;
		case 1:
			l1.setBackground(Color.DARK_GRAY);
			break;
		case 2:
			l1.setBackground(Color.CYAN);
			break;
		case 3:
			l1.setBackground(Color.BLACK);
			break;
		default:
			break;
		}
		repaint();
	}
}
