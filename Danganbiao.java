package Xueshengxuanke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TableDemo extends JFrame
{
	public TableDemo()
	{
		super("教师信息表");
		String[] columnNames = {"教师/学生","姓名","编号","性别","所授/选课程"};
		Object[][]data = {
				{"教师","王舞","005","女","物理"},
				{"教师","王陆","006","男","高数"},
				{"学生","李华","0001","男","高数"},
				{"学生","小明","0002","女","物理"}
				
		
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
