package 学生系统;
import javax.swing.*;
//定义 用窗体组件Swing
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt. FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;
//窗体组件awt

class BtnIcon extends JFrame implements ActionListener
{
	private static final java.awt.event.ActionListener ActionListener = null;
	ImageIcon icon = new ImageIcon("选课页面");
	JButton jbtn = new JButton("点击选课");
	JButton b1 = new JButton("学生注册");
	JButton b2 = new JButton("课程新加");
	JButton b3 = new JButton("学生退课");
	JButton b4 = new JButton("打印学生选课列表");
	
	//建立一个窗口 是进入系统界面 只有一个按钮为“点击进入”
	
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
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		validate();
		b2.addActionListener(ActionListener);
		
		validate();
		b3.addActionListener(ActionListener);
		
		validate();
		b4.addActionListener(this);
		
		
		validate();
		b1.addActionListener(this);;
		
		validate();
		jbtn.addActionListener(this);
		//设置监听器 达到点击按钮即可进入下一界面的目的
	}
	public void actionPerformedb1(ActionEvent b1)
	{
		// TODO Auto-generated method stub
		JFrame newf1 = new JFrame("学生注册");
		newf1.setSize(200,400);
		newf1.setVisible(true);
		
		newf1.setLayout(new FlowLayout());
		newf1.add(new Label("输入学号："));
		newf1.setBounds(27,20,400,400);
		
		JTextField text0 = new JTextField(20);
		newf1.add(text0);
		text0.addActionListener(this);
		//JTextArea txt1 = new JTextArea()
		//添加文本框
		
	}
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) 
		// TODO Auto-generated method stub
	{
		JFrame newf = new JFrame("选课页面");
		newf.setSize(200,400);
		newf.setVisible(true);
		
		newf.setLayout(new FlowLayout());
		newf.add(new Label ("姓名："));
		newf.setBounds(27, 20, 400, 400);
		//设置一个输入框，标签为“姓名”
		
		JTextField text = new JTextField(20);
		newf.add(text);
		text.addActionListener(this);
		//JTextArea txt1 = new JTextArea()
		//添加文本框
	
		

		
		
		Label a = new Label("学号：");
		newf.add(a);
		newf.setBounds(27, 80, 300, 400);
		JTextField text1 = new JTextField(20);
		newf.add(text1);
		newf.setResizable(false);
		
		Label c = new Label("性别：");
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
		
		
		
		
		
		
		Label b = new Label("选课：");
		newf.add(b);
		newf.setBounds(27, 80, 300, 400);
		JCheckBox box1 = new JCheckBox("高数");
		JCheckBox box2 = new JCheckBox("物理");
		JCheckBox box3 = new JCheckBox("英语");
		
		newf.add(box1);
		newf.add(box2);
		newf.add(box3);
		
		JButton btn2 = new JButton("确 定");
		newf.add(btn2);
		
		
		JTextArea area = new JTextArea(5,20);
		JScrollPane pane = new JScrollPane(area);
		newf.add(pane);
		
		JButton btn3 = new JButton("打印");
		newf.add(btn3);
		
		
		JButton btn4 = new JButton("选课完成");
		newf.add(btn4);
				

		
		
		
		
	}
}
public class Xueshengxuanke
{

	public static void main(String[] args)
	{
		new BtnIcon();
			
	}
}