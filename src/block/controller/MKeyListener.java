package block.controller;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import block.view.BlockGamePanel;

public class MKeyListener extends KeyAdapter
{
	@Override
	public void keyPressed(KeyEvent event)
	{
		char ch = event.getKeyChar();
		if (ch == 'a' || ch == KeyEvent.VK_LEFT)
		{
			System.out.println("Left");
		}
		else if (ch == 's' || ch == KeyEvent.VK_DOWN)
		{
			System.out.println("Down");
		}
		else if (ch == 'd' || ch == KeyEvent.VK_RIGHT)
		{
			System.out.println("Right");
		}
		else if (ch == 'w' || ch == KeyEvent.VK_UP)
		{
			System.out.println("Up");
		}
	}
}
