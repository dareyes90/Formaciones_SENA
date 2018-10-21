import java.applet.Applet;
import java.awt.*;

public class AppletDrawRectangle extends Applet {

	public AppletDrawRectangle() {
		repaint();
	}

	public void paint(Graphics g) {
		Color color = new Color(50, 10, 100);
		g.setColor(color);
		g.fillRect(50, 50, 100, 50);
	}
}