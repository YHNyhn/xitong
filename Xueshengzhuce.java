package ѧ��ϵͳ;
import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.Area;
//���� �ô������Swing
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt. FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import java.awt.*;
//�������


class BtnIcon extends JFrame implements ActionListener
{
	ImageIcon icon = new ImageIcon("ע��ҳ��");
	JButton jbtn = new JButton(" ѧ �� ע �� ");
	JButton jbtn1 = new JButton(" �� �� �� ��");
	JButton jbtn2 = new JButton(" ѧ �� ѡ �� ");
	JButton jbtn3 = new JButton(" ѧ �� �� �� ");
	JButton jbtn4 = new JButton(" �� ӡ ѡ �� �� �� ");
	protected JTextArea area1;

	
	//����һ������ �ǽ���ϵͳ���� ��һ����ťΪ��ѧ��ע�ᡱ
	
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
			JFrame newx = new JFrame("ѧ��ѡ��");
			newx.setSize(200,400);
			newx.setVisible(true);
			
			newx.setLayout(new FlowLayout());
			newx.add(new Label ("������"));
			newx.setBounds(27, 20, 400, 400);
			//����һ������򣬱�ǩΪ��������
			
			JTextField text = new JTextField(20);
			newx.add(text);
			text.addActionListener(this);
			//JTextArea txt1 = new JTextArea()
			//����ı���
			
			Label a = new Label("ѧ�ţ�");
			newx.add(a);
			newx.setBounds(27, 80, 300, 400);
			JTextField text1 = new JTextField(20);
			newx.add(text1);
			newx.setResizable(false);
			
			Label c = new Label("�Ա�");
			newx.add(c);
			newx.setBounds(27, 80, 300, 400);
			JRadioButton r1 = new JRadioButton("��");
			JRadioButton r2 = new JRadioButton("Ů");
			JRadioButton r3 = new JRadioButton("δ֪");
			ButtonGroup group = new ButtonGroup();
			
			group.add(r1);
			group.add(r2);
			group.add(r3);
			newx.add(r1);
			newx.add(r2);
			newx.add(r3);
			
			JButton btn1 = new JButton("ȷ ��");
			newx.add(btn1);
			
			
			
			
			
			
			Label b = new Label("ѡ�Σ�");
			newx.add(b);
			newx.setBounds(27, 80, 300, 400);
			JCheckBox box1 = new JCheckBox("����");
			JCheckBox box2 = new JCheckBox("����");
			JCheckBox box3 = new JCheckBox("Ӣ��");
			
			newx.add(box1);
			newx.add(box2);
			newx.add(box3);
			
			JButton btn2 = new JButton("ȷ ��");
			newx.add(btn2);
			
			
			JTextArea area = new JTextArea(5,20);
			JScrollPane pane = new JScrollPane(area);
			newx.add(pane);
			
			JButton btn3 = new JButton("��ӡ");
			newx.add(btn3);
			
			
			JButton btn4 = new JButton("ѡ�����");
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
		//���ü����� �ﵽ�����ť���ɽ�����һ�����Ŀ��
		
	}

	
	

	private ActionListener ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void actionPerformed(ActionEvent e) 
		// TODO Auto-generated method stub
	{
		JFrame newf = new JFrame("ѧ��ע��");
		newf.setSize(200,400);
		newf.setVisible(true);
		
		
		Label b = new Label("��ݣ�");
		newf.add(b);
		newf.setBounds(27, 80, 300, 400);
		JRadioButton box1 = new JRadioButton("��ʦ");
		JRadioButton box2 = new JRadioButton("ѧ��");
		ButtonGroup group1 = new ButtonGroup();
		
		newf.add(box1);
		newf.add(box2);
		
		JButton btn2 = new JButton("ȷ ��");
		newf.add(btn2);
		
		newf.setLayout(new FlowLayout());
		newf.add(new Label ("����������"));
		newf.setBounds(27, 20, 400, 400);
		//����һ������򣬱�ǩΪ��������
		
		
		
		JTextField text0 = new JTextField(20);
		newf.add(text0);
		JTextArea area1 = new JTextArea(5,20);
		JScrollPane pane = new JScrollPane(area1);
		newf.add(pane);
		text0.addActionListener(new ActionListener()
		//JTextArea txt0 = new JTextArea()
		//����ı���
		{
		public void actionPerformed(ActionEvent e)
		{
			String s = text0.getText();
		    area1.append("\n"+s);
		}
		});
	
		Label a = new Label("����ѧ�ţ�");
		newf.add(a);
		newf.setBounds(27, 80, 300, 400);
		JTextField text1 = new JTextField(20);
		newf.add(text1);
		
		newf.setResizable(false);
		
		Label c = new Label("ѡ���Ա�");
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
		
		
		
		
		JButton btn4 = new JButton("ע�����");
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