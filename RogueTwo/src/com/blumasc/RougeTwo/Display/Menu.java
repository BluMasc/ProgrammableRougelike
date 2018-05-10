package com.blumasc.RougeTwo.Display;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.blumasc.RogueTwo.values.SETTINGS;
import com.blumasc.RougeTwo.ReaderWriter.VariationsGetter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtRougetwo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu(args);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param variations 
	 */
	public Menu(String[] variations) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.5);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_1);
		
		txtRougetwo = new JTextField();
		txtRougetwo.setEditable(false);
		txtRougetwo.setFont(new Font("Power Red and Blue Intl", Font.BOLD, 40));
		txtRougetwo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRougetwo.setText("RougeTwo");
		splitPane_1.setLeftComponent(txtRougetwo);
		txtRougetwo.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>(variations);
		comboBox.setFont(new Font("Power Red and Blue Intl", Font.BOLD, 20));
		splitPane_1.setRightComponent(comboBox);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setResizeWeight(0.5);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_2);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SETTINGS.chosenPath=comboBox.getSelectedItem().toString();
				
			}
		});
		btnStart.setFont(new Font("Power Red and Blue Intl", Font.BOLD, 20));
		splitPane_2.setLeftComponent(btnStart);
		
		JButton btnNewButton = new JButton("BEENDEN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CloseFrame();
			}
		});
		btnNewButton.setFont(new Font("Power Red and Blue Intl", Font.BOLD, 20));
		splitPane_2.setRightComponent(btnNewButton);
	}
	private void CloseFrame() {
		super.dispose();
		
	}
}
