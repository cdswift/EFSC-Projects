import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class BouncingBallPanel extends JPanel implements Runnable, MouseListener {

	private Ball[] ballArray = new Ball[20];
	private int ballCount = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (ballCount < 20)
		{
			ballArray[ballCount] = new Ball();
			ballCount++;
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	

}
