package study;
import java.awt.*;
import javax.swing.*;
public class GraphicExam {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("성적 그래프 프로그램");
		frame.setPreferredSize(new Dimension(400,350));
		frame.setLocation(500,200);
		
		
		Container contentPane = frame.getContentPane();
		
	DrawingPanel drawingPanel = new DrawingPanel();
	contentPane.add(drawingPanel,BorderLayout.CENTER);
	
		
		
		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(1);
		JTextField text2 = new JTextField(2);
		JTextField text3 = new JTextField(3);
		
		JButton button = new JButton("그래프 그리기");
		controlPanel.add(new JLabel("국어"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("수학"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("영어"));
		controlPanel.add(text3);
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}

}
