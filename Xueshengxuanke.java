package ѧ��ϵͳ;
import javax.swing.*;
//���� �ô������Swing
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt. FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;
//�������awt

class BtnIcon extends JFrame implements ActionListener
{
	private static final java.awt.event.ActionListener ActionListener = null;
	ImageIcon icon = new ImageIcon("ѡ��ҳ��");
	JButton jbtn = new JButton("���ѡ��");
	JButton b1 = new JButton("ѧ��ע��");
	JButton b2 = new JButton("�γ��¼�");
	JButton b3 = new JButton("ѧ���˿�");
	JButton b4 = new JButton("��ӡѧ��ѡ���б�");
	
	//����һ������ �ǽ���ϵͳ���� ֻ��һ����ťΪ��������롱
	
	BtnIcon()
	{
		super("����ϵͳ");
		setSize(400,250);
		setVisible(true);
		
		
		setLayout(new FlowLayout());
		add(new Label("��ӭ�������ϵͳ!"));
		//����һ����ǩΪ����ӭ����ѡ��ϵͳ��

		
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
		//���ü����� �ﵽ�����ť���ɽ�����һ�����Ŀ��
	}
	public void actionPerformedb1(ActionEvent b1)
	{
		// TODO Auto-generated method stub
		JFrame newf1 = new JFrame("ѧ��ע��");
		newf1.setSize(200,400);
		newf1.setVisible(true);
		
		newf1.setLayout(new FlowLayout());
		newf1.add(new Label("����ѧ�ţ�"));
		newf1.setBounds(27,20,400,400);
		
		JTextField text0 = new JTextField(20);
		newf1.add(text0);
		text0.addActionListener(this);
		//JTextArea txt1 = new JTextArea()
		//����ı���
		
	}
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) 
		// TODO Auto-generated method stub
	{
		JFrame newf = new JFrame("ѡ��ҳ��");
		newf.setSize(200,400);
		newf.setVisible(true);
		
		newf.setLayout(new FlowLayout());
		newf.add(new Label ("������"));
		newf.setBounds(27, 20, 400, 400);
		//����һ������򣬱�ǩΪ��������
		
		JTextField text = new JTextField(20);
		newf.add(text);
		text.addActionListener(this);
		//JTextArea txt1 = new JTextArea()
		//����ı���
	
		

		
		
		Label a = new Label("ѧ�ţ�");
		newf.add(a);
		newf.setBounds(27, 80, 300, 400);
		JTextField text1 = new JTextField(20);
		newf.add(text1);
		newf.setResizable(false);
		
		Label c = new Label("�Ա�");
		newf.add(c);
		newf.setBounds(27, 80, 300, 400);
		JRadioButton r1 = new JRadioButton("��");
		JRadioButton r2 = new JRadioButton("Ů");
		JRadioButton r3 = new JRadioButton("δ֪");
		ButtonGroup group = new ButtonGroup();
		
		group.add(r1);
		group.add(r2);
		group.add(r3);
		newf.add(r1);
		newf.add(r2);
		newf.add(r3);
		
		JButton btn1 = new JButton("ȷ ��");
		newf.add(btn1);
		
		
		
		
		
		
		Label b = new Label("ѡ�Σ�");
		newf.add(b);
		newf.setBounds(27, 80, 300, 400);
		JCheckBox box1 = new JCheckBox("����");
		JCheckBox box2 = new JCheckBox("����");
		JCheckBox box3 = new JCheckBox("Ӣ��");
		
		newf.add(box1);
		newf.add(box2);
		newf.add(box3);
		
		JButton btn2 = new JButton("ȷ ��");
		newf.add(btn2);
		
		
		JTextArea area = new JTextArea(5,20);
		JScrollPane pane = new JScrollPane(area);
		newf.add(pane);
		
		JButton btn3 = new JButton("��ӡ");
		newf.add(btn3);
		
		
		JButton btn4 = new JButton("ѡ�����");
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