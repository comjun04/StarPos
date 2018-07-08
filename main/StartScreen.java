package main;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Label;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class StartScreen extends JFrame {
	
	private final int SCREEN_WIDTH = 720;
	private final int SCREEN_HEIGHT = 480;
	
	private final int sellStartDialog_SCREEN_WIDTH = 480;
	private final int sellStartDialog_SCREEN_HEIGHT = 320;
	
	private final String menu1 = "영업 시작";
	private final String menu2 = "상품 관리";
	private final String menu3 = "통계";
	private final String menu4 = "환경 설정";
	private final String menu5 = "프로그램 종료";
	
	Label title = new Label(Main.app_title);
	Label sellStart_title = new Label(menu1);
	JButton b1 = new JButton(menu1);
	JButton b2 = new JButton(menu2);
	JButton b3 = new JButton(menu3);
	JButton b4 = new JButton(menu4);
	JButton b5 = new JButton(menu5);
	GridBagLayout gbl = new GridBagLayout();
	GridBagLayout gbl2 = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JDialog sellStartDialog = new JDialog(this, menu1, true);
	
	public StartScreen() {
		//Start Screen Initialization Start
		//Basic Settings
		setTitle(Main.app_title);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Start Screen Components Initialization & add
		setLayout(gbl);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 0, 5, 0);
		add(title, gbc);
		title.setFont(new Font("", Font.BOLD, 30));
		
		gbc.gridy = 1;
		add(b1, gbc);
		
		gbc.gridy = 2;
		add(b2, gbc);
		
		gbc.gridy = 3;
		add(b3, gbc);
		
		gbc.gridy = 4;
		add(b4, gbc);
		
		gbc.gridy = 5;
		add(b5, gbc);
		
		//영업 시작 Dialog Initialization
		sellStartDialog.setLayout(gbl2);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = null;
		sellStartDialog.add(sellStart_title);
		
		sellStartDialog.setSize(sellStartDialog_SCREEN_WIDTH, sellStartDialog_SCREEN_HEIGHT);
		sellStartDialog.setResizable(false);
		sellStartDialog.setLocationRelativeTo(null);
		
		//Button ActionListener Initialization
		ActionHandlerAll aha = new ActionHandlerAll();
		b1.addActionListener(aha);
		b2.addActionListener(aha);
		b3.addActionListener(aha);
		b4.addActionListener(aha);
		b5.addActionListener(aha);
		
		//Screen Initialization Finish
		setVisible(true);
	}
	
	class ActionHandlerAll implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton compare = (JButton)e.getSource();
			if(compare == b1) {
				//영업 시작
				sellStartDialog.setVisible(true);
			}
			if(compare == b2) {
				//상품 관리
			}
			if(compare == b3) {
				//통계
			}
			if(compare == b4) {
				//환경설정
			}
			if(compare == b5) {
				//TODO Make Exit Dialog
				System.exit(1);
			}
		}
	}
}

