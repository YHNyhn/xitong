package Xueshengxuanke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TableDemo extends JFrame
{
	public TableDemo()
	{
		super("��ʦ��Ϣ��");
		String[] columnNames = {"��ʦ/ѧ��","����","���","�Ա�","����/ѡ�γ�"};
		Object[][]data = {
				{"��ʦ","����","005","Ů","����"},
				{"��ʦ","��½","006","��","����"},
				{"ѧ��","�","0001","��","����"},
				{"ѧ��","С��","0002","Ů","����"}
				
		
	};
		 JTable table = new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,700));
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}

public class Danganbiao
{
	public static void main(String[] args)
	{
		TableDemo frame = new TableDemo();
	}
}
