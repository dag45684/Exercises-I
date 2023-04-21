package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class CList extends JFrame{
	private static final long serialVersionUID = 1L;
	
	CList(){
		super("MyApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
//		contentPane.setPreferredSize(new Dimension(500, 500));
		contentPane.setBackground(Color.GRAY);
		DefaultListModel<String> model = new DefaultListModel<>();
		for (int i =0 ; i<20; i++) {
			model.add(i, "Elemento " + i);
		}
		JList<String> list = new JList<>();
		list.setOpaque(false);
		((JLabel) list.getCellRenderer()).setOpaque(false);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setModel(model);
		list.setVisibleRowCount(10); // Makes initialization of the panel to adjust this number of elements
		JScrollPane listScroll = new JScrollPane(list);
		listScroll.setOpaque(false);
		
		add(listScroll, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
	}

}
