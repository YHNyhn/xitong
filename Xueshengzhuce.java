package 学生系统;
import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.Area;
//定义 用窗体组件Swing
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt. FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import java.awt.*;
//窗体组件


class BtnIcon extends JFrame implements ActionListener
{
	ImageIcon icon = new ImageIcon("注册页面");
	JButton jbtn = new JButton(" 学 生 注 册 ");
	JButton jbtn1 = new JButton(" 课 程 新 加");
	JButton jbtn2 = new JButton(" 学 生 选 课 ");
	JButton jbtn3 = new JButton(" 学 生 退 课 ");
	JButton jbtn4 = new JButton(" 打 印 选 课 列 表 ");
	protected JTextArea area1;

	
	//建立一个窗口 是进入系统界面 有一个按钮为“学生注册”
	
	BtnIcon()
	{
		super("教务系统");
		setSize(400,250);
		setVisible(true);
		
		
		setLayout(new FlowLayout());
		add(new Label("欢迎进入教务系统!"));
		//设置一个便签为“欢迎进入选课系统”

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(jbtn);
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);


		
		
		validate();
		jbtn1.addActionListener(this);
		
		validate();
		jbtn2.addActionListener(this);
		
		public void actionPerformed(ActionEvent e)
		{
			JFrame newx = new JFrame("学生选课");
			newx.setSize(200,400);
			newx.setVisible(true);
			
			newx.setLayout(new FlowLayout());
			newx.add(new Label ("姓名："));
			newx.setBounds(27, 20, 400, 400);
			//设置一个输入框，标签为“姓名”
			
			JTextField text = new JTextField(20);
			newx.add(text);
			text.addActionListener(this);
			//JTextArea txt1 = new JTextArea()
			//添加文本框
			
			Label a = new Label("学号：");
			newx.add(a);
			newx.setBounds(27, 80, 300, 400);
			JTextField text1 = new JTextField(20);
			newx.add(text1);
			newx.setResizable(false);
			
			Label c = new Label("性别：");
			newx.add(c);
			newx.setBounds(27, 80, 300, 400);
			JRadioButton r1 = new JRadioButton("男");
			JRadioButton r2 = new JRadioButton("女");
			JRadioButton r3 = new JRadioButton("未知");
			ButtonGroup group = new ButtonGroup();
			
			group.add(r1);
			group.add(r2);
			group.add(r3);
			newx.add(r1);
			newx.add(r2);
			newx.add(r3);
			
			JButton btn1 = new JButton("确 定");
			newx.add(btn1);
			
			
			
			
			
			
			Label b = new Label("选课：");
			newx.add(b);
			newx.setBounds(27, 80, 300, 400);
			JCheckBox box1 = new JCheckBox("高数");
			JCheckBox box2 = new JCheckBox("物理");
			JCheckBox box3 = new JCheckBox("英语");
			
			newx.add(box1);
			newx.add(box2);
			newx.add(box3);
			
			JButton btn2 = new JButton("确 定");
			newx.add(btn2);
			
			
			JTextArea area = new JTextArea(5,20);
			JScrollPane pane = new JScrollPane(area);
			newx.add(pane);
			
			JButton btn3 = new JButton("打印");
			newx.add(btn3);
			
			
			JButton btn4 = new JButton("选课完成");
			newx.add(btn4);
			
			validate();
			btn4.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				newx.setVisible(false);

				//		System.exit(0);
			}
			});
		}
			
		
	
		validate();
		jbtn3.addActionListener(this);
		validate();
		jbtn4.addActionListener(this);
		validate();
		jbtn.addActionListener(this);
		//设置监听器 达到点击按钮即可进入下一界面的目的
		
	}

	
	

	private ActionListener ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void actionPerformed(ActionEvent e) 
		// TODO Auto-generated method stub
	{
		JFrame newf = new JFrame("学生注册");
		newf.setSize(200,400);
		newf.setVisible(true);
		
		
		Label b = new Label("身份：");
		newf.add(b);
		newf.setBounds(27, 80, 300, 400);
		JRadioButton box1 = new JRadioButton("教师");
		JRadioButton box2 = new JRadioButton("学生");
		ButtonGroup group1 = new ButtonGroup();
		
		newf.add(box1);
		newf.add(box2);
		
		JButton btn2 = new JButton("确 定");
		newf.add(btn2);
		
		newf.setLayout(new FlowLayout());
		newf.add(new Label ("输入姓名："));
		newf.setBounds(27, 20, 400, 400);
		//设置一个输入框，标签为“姓名”
		
		
		
		JTextField text0 = new JTextField(20);
		newf.add(text0);
		JTextArea area1 = new JTextArea(5,20);
		JScrollPane pane = new JScrollPane(area1);
		newf.add(pane);
		text0.addActionListener(new ActionListener()
		//JTextArea txt0 = new JTextArea()
		//添加文本框
		{
		public void actionPerformed(ActionEvent e)
		{
			String s = text0.getText();
		    area1.append("\n"+s);
		}
		});
	
		Label a = new Label("输入学号：");
		newf.add(a);
		newf.setBounds(27, 80, 300, 400);
		JTextField text1 = new JTextField(20);
		newf.add(text1);
		
		newf.setResizable(false);
		
		Label c = new Label("选择性别：");
		newf.add(c);
		newf.setBounds(27, 80, 300, 400);
		JRadioButton r1 = new JRadioButton("男");
		JRadioButton r2 = new JRadioButton("女");
		JRadioButton r3 = new JRadioButton("未知");
		ButtonGroup group = new ButtonGroup();
		
		group.add(r1);
		group.add(r2);
		group.add(r3);
		newf.add(r1);
		newf.add(r2);
		newf.add(r3);
		
		JButton btn1 = new JButton("确 定");
		newf.add(btn1);
		
		
		
		
		JButton btn4 = new JButton("注册完成");
		newf.add(btn4);
		
		validate();
		btn4.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			newf.setVisible(false);

			//		System.exit(0);
		}
		});
		
		
	}




	protected void append(String string) {
		// TODO Auto-generated method stub
		
	}





	
}
public class Xueshengzhuce
{

	public static void main(String[] args)
	{
		new BtnIcon();
			
	}
}