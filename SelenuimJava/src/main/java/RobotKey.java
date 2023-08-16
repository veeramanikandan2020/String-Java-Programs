import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotKey {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_DELETE);
		
		Runtime.getRuntime().exec("C://Users//Veeramanikandan//Desktop//Hybrid Framework.txt");
		
		
		
	}

}
