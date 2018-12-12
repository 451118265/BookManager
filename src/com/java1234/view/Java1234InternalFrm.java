package com.java1234.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Java1234InternalFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java1234InternalFrm frame = new Java1234InternalFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Java1234InternalFrm() {
		getContentPane().setBackground(Color.RED);
		setIconifiable(true);
		setClosable(true);
		setTitle("\u5173\u4E8Ejava");
		setBounds(100, 100, 450, 300);
		
		JLabel label = new JLabel("\u81ED\u5C45\u5C45");
		label.setFont(new Font("ºÚÌå", Font.BOLD, 35));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(148)
					.addComponent(label)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(100)
					.addComponent(label)
					.addContainerGap(123, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
