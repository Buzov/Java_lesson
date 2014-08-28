package My56;

import java.awt.*;
import javax.swing.*;

//апплет

public class My56 extends JApplet
{
	public void init()//главный метод апплета
	{
		Container pane =getContentPane();
		JLabel label=new JLabel("It is my first applet",JLabel.CENTER);
		pane.add(label);
	}
}
