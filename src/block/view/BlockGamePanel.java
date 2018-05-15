package block.view;

import javax.swing.*;
import block.controller.BlockController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlockGamePanel extends JPanel
{
	private BlockController appController;
	private JLabel levelLabel;
	private SpringLayout appLayout;
	private JButton resetButton;
	
	public BlockGamePanel(BlockController appController)
	{
		super();
		this.appController = appController;
		levelLabel = new JLabel();
		resetButton = new JButton();
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.setLayout(appLayout);
		this.add(levelLabel);
		this.add(resetButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
