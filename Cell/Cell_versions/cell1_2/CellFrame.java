package cell1_2;

import static cell1_2.Cell.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CellFrame {
	
	static JFrame jF = new JFrame("Cell");
	static JPanel[][] jp = new JPanel[SIZE + 1][SIZE + 1];
	
	public static void jF_() {
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jF.setResizable(false);
		jF.setBounds(90, 60, 366, 388);
		jF.setLayout(new GridLayout(SIZE, SIZE));
		
		for (int row = 1; row <= SIZE; row++)
			for(int col = 1; col <= SIZE; col++) {
				jp[row][col] = new JPanel();
				jp[row][col].setBackground(Color.WHITE);
				//jp[row][col].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
				jp[row][col].addMouseListener(new JPanelClickCommand(jp[row][col]));
				jF.add(jp[row][col]);
		}
		
		jF.setVisible(true);
	}
	
	static JFrame jFc = new JFrame();
	static JButton jB = new JButton("��ʼ/��ͣ");
	
	public static void jF_control() {
		jFc.setUndecorated(true);
		jFc.setBounds(800, 60, 90, 60);

		jB.addActionListener(event -> sign = !sign);
		jFc.add(jB);
		
		jFc.setVisible(true);
	}
	
	 private static class JPanelClickCommand implements MouseListener {
		
		private JPanel jP;

		public JPanelClickCommand(JPanel _jP) {
			jP = _jP ;
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if(!jP.getBackground().equals(Color.BLACK))
					jP.setBackground(Color.LIGHT_GRAY);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if(jP.getBackground().equals(Color.LIGHT_GRAY))
				jP.setBackground(Color.WHITE);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if(jP.getBackground().equals(Color.BLACK))
				jP.setBackground(Color.WHITE);
			else
				jP.setBackground(Color.BLACK);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
