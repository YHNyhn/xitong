一.实验目的

分析学生选课系统

使用GUI窗体及其组件设计窗体界面

完成学生选课过程业务逻辑编程

基于文件保存并读取数据

处理异常

二.实验要求

（一）、系统角色分析及类设计

学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。

定义每种角色人员的属性，及其操作方法。

属性示例：	人员（编号、姓名、性别）

教师（编号、姓名、性别、所授课程）

学生（编号、姓名、性别、所选课程）

课程（编号、课程名称、上课地点、时间、授课教师）。

（二）、要求:

1、	设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。

2、	基于事件模型对业务逻辑编程，实现在界面上支持上述操作。

3、	针对操作过程中可能会出现的各种异常，做异常处理

4、	基于输入/输出编程，支持学生、课程、教师等数据的读写操作。

三.实验过程

首先设计GUI窗体，用JFrame，带有标题，边框的顶层窗体。构造JFrame对象设计窗体及利用JFrame子类设计窗体。然后还要创建按钮对象，由于按钮是一个普通的组件，设计时必须
放置到一个容器里。

接着设置监听器，当点击按钮对象时，按钮对象会产生一个事件，事件监听器监听到的这个事件，把它作为ActionListener接口的actionPerformed方法参数，在这个方法中处理动作时间。

接下来设置一个文本框，对单行文本进行编辑，接受用户的输入然后编辑文本。并把文本框设置为可拖动。

再添加单选按钮，复选框，单选按钮和复选框都只有两种状态，选中或未选中。

学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作按钮都设置监听器并且点击之后会跳转至另一个页面然后进行相应的操作。

在学生选课的页面中要进行类设计，通过方法完成对类和对象的属性操作。成员方法只能在类的内部声明并加以实现，一般在类体中声明成员变量后再声明方法。

实例化为对象分配内存空间，然后调用对象。

课程类，它继承于课程类，它拥有课程类的全部属性，他应该拓展的属性为它拥有最大学生人数，同时它应该拓展的功能为确定一个学生在不在当前的选修课里面，把一个学生加入当前选修课。同时因为和抽象类课程不一样，要重写展示函数。

学生退课就是在已生成的文档中将一些课程删除，文档中将没有课程信息。

打印学生选课列表即是连接监听将它文档中的选到的课程信息显示出来。

四.流程图已上传
 
五.核心代码

class BtnIcon extends JFrame implements ActionListener
{
	ImageIcon icon = new ImageIcon("注册页面");
	JButton jbtn = new JButton(" 学 生 注 册 ");
	JButton jbtn1 = new JButton(" 课 程 新 加");
	JButton jbtn2 = new JButton(" 学 生 选 课 ");
	JButton jbtn3 = new JButton(" 学 生 退 课 ");
	JButton jbtn4 = new JButton(" 打 印 选 课 列 表 ");
	protected JTextArea area1;



		validate();
		jbtn2.addActionListener(this);
		
		public void actionPerformed(ActionEvent e)
		{
			JFrame newx = new JFrame("学生选课");
			newx.setSize(200,400);
			newx.setVisible(true);
      
      
      
}



Label c = new Label("性别：");
			newx.add(c);
			newx.setBounds(27, 80, 300, 400);
			JRadioButton r1 = new JRadioButton("男");
			JRadioButton r2 = new JRadioButton("女");
			JRadioButton r3 = new JRadioButton("未知");
			ButtonGroup group = new ButtonGroup();
			
      
      
      
      Label b = new Label("选课：");
			newx.add(b);
			newx.setBounds(27, 80, 300, 400);
			JCheckBox box1 = new JCheckBox("高数");
			JCheckBox box2 = new JCheckBox("物理");
			JCheckBox box3 = new JCheckBox("英语");
			


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





public class Course implements Serializable
{
	private String id;
	private String name;
	
	public Course(String id,String name)
	{
		super();
		this.id = id;
		this.name = name;
		
	}
  
  //增加所选课程
	public void addSelect() {
		System.out.println("输入所选课程的课程号，输入end结束");
		while (true) {
			String id = in.nextLine();
			if (!id.equals("end")) {
				Course cr = map.get(id);
				st.getCourses().add(cr);
				System.out.println("选课成功");
			} else {
				// System.out.println("添加结束");
				break;
			}
		}
    
    核心代码太多啦 我就直接复制粘贴了一部分啦
    
    
     //*添加学生
		AdministratorOp a1=new AdministratorOp();
		a1.add();
		a1.display1();
		 a1.close();
		a1.save1();
		//*添加课程
		AdministratorOp a2=new AdministratorOp();
		a2.add2();
		a2.display2();
		a2.close();			    
	    a2.save2();
	//	测试删除，查找，修改
	    AdministratorOp a3=new AdministratorOp();
		a3.load1();
		a3.createMap1();
		a3.load2();
//		a3.createMap2();
		a3.display1();
		a3.display2();
		a3.del();
		a3.display1();
//		a3.del2();
		a3.display2();
		a3.query1();
		a3.query2();
//		a3.modify1();
		a3.display1();
//		a3.modify2();
		a3.display2();
        a3.close();
        a3.save1();
        a3.save2();
    
    
    
  
  六.程序截图已上传
  
  七,实验感想
  这次实验最大的感受就是爆炸！就害怕之前所有的内容连接起来整一个综合性的实验，然后就像修水管一样，全部崩盘。逻辑思维超级混乱。学习任何一种编程语言都有一定难度，因此，在日后的学习中，要多动手实践，多编写，多练习，熟能生巧，然后从中体会到程序设计的乐趣和成功的喜悦，当然，
  
  现在丝毫体会不到。这两天晚上内心潜在的编程激情被引爆，没有任何人强迫，却能废寝忘食，通宵达旦。感觉这学期对Java的态度端正晚了。
  
  最最重要的是！这次的代码是真的真的写不出来完整的，脑袋都要炸了，老师要酌情三思啊 真的有努力在编程呢！ 说不定过一个星期之后再回头写程序就可以保持清醒的头脑然后将它完整的写出来了。
  程序代码和运行截图单另上传了，
  最后的最后！！！老师看代码辛苦了！！！（鞠躬）

