package com.bank.www.service;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserJFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6477270330102433152L;

	public UserJFrame() {
		super("用户账户操作窗口");
		this.setBounds(300, 240, 400, 150);
		this.setResizable(false);
		this.setBackground(Color.lightGray);
		this.setLayout(new java.awt.FlowLayout(FlowLayout.CENTER));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		this.getContentPane().add(panel1, "North");
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {
		new UserJFrame();
	}
}
