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
		if (ch == 'a' || ch == KeyEvent.VK_UP)
		{
			
		}
	}
}
