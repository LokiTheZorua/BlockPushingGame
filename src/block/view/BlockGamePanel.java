package block.view;

import javax.swing.*;
import javax.swing.table.TableModel;

import block.controller.BlockController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import block.controller.MKeyListener;

public class BlockGamePanel extends JPanel
{
	private BlockController appController;
	private JLabel levelLabel;
	private SpringLayout appLayout;
	private JButton resetButton;
	private JTable table;
	private int rows = 60;
	private int cols = 60;
	public int levelNumber = 0;
	private JButton nextButton;
	private Boolean active = true;
	
	
	
	public BlockGamePanel(BlockController appController)
	{
		super();
		this.appController = appController;
		setupGrid();
		levelLabel = new JLabel();
		levelLabel.setEnabled(false);
		levelLabel.setForeground(Color.BLACK);
		levelLabel.setBackground(Color.WHITE);
		levelLabel.setText("Level");
		levelLabel.setFont(new Font( "Serif", Font.PLAIN, 24));
		resetButton = new JButton("Reset");
		appLayout = new SpringLayout();
		
		
		table = new JTable(rows, cols);
		table.setGridColor(Color.DARK_GRAY);
		table.setRowHeight(15);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setEnabled(false);
		for (int i = 0; i < table.getColumnCount(); i++)
		{
			table.getColumnModel().getColumn(i).setPreferredWidth(10);
		}
		
		
		nextButton = new JButton("Next Level");
		
		
		
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
		this.add(table);
		this.add(nextButton);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, levelLabel, 716, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, levelLabel, -18, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, levelLabel, 1234, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, levelLabel, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, table, 15, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, table, 250, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nextButton, -219, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 64, SpringLayout.SOUTH, nextButton);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, nextButton);
		appLayout.putConstraint(SpringLayout.WEST, nextButton, 50, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		
		nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				nextLevel();
			}
		});
		
	}
	private void setupGrid()
	{
//		for(int i = 0; i >= 60; i++)
//		{
//			for(int h = 0; h >=60; h++)
//			{
//				grid[i][h] = Color.WHITE;
//			}
//		}
	}
	public void nextLevel()
	{
		levelNumber++;
		
		levelLabel.setText("Level " + levelNumber );
	}
	public void moveUp()
	{
		
	}
	public void moveDown()
	{
		
	}
	public void moveLeft()
	{
		
	}
	public void moveRight()
	{
		
	}
	
}
