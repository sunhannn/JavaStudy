package study;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
public class DrawActionListener implements ActionListener {
	
	JTextField text1, text2, text3;
	DrawingPanel drawingPanel;
	
	public DrawActionListener(JTextField text1, JTextField text2, JTextField text3, DrawingPanel drawingPanel) {
		
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			
			drawingPanel.setScores(korean, english, math);
			drawingPanel.repaint();
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(drawingPanel.ERROR_MASSAGE);
		}
		
		
	}

}
