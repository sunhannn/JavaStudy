package study;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class RemoveActionListener implements ActionListener {

	JTable table;
	
	public RemoveActionListener(JTable table) {
		
		this.table=table;
	}
	
	
	
	@Override
	
	
	public void actionPerformed(ActionEvent e) {
		int row =  table.getSelectedRow();
		if(row == -1) {
			return;
			
		}
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
	}

}
