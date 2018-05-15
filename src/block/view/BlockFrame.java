package block.view;

import block.controller.BlockController;
import javax.swing.JFrame;

public class BlockFrame extends JFrame
{
	private BlockController appController;
	private BlockGamePanel appPanel;
	
	public BlockFrame(BlockController appController)
	{
		super();
		this.appController = appController;
		appPanel = new BlockGamePanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Push the block");
		this.setResizable(false);
		this.setSize(1600, 1000);
		this.setVisible(true);
	}
}
