import javax.swing.*;
import java.awt.*;

//Tis is the Main Class
public class PlayFallDown extends JFrame
{
	public PlayFallDown()
	{
		getContentPane().setLayout(new FlowLayout());
		add(new FallDownComponent());
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new PlayFallDown();
	}
}
