//管理端
package SelectCourse;
import java.io.*;
import java.util.*;

public class AdministratorOp
{
	List<Students> students = new ArrayList<Students>();
	Map<Integer, Students> map1 = new HashMap<Integer, Students>();
	List<Course> course = new ArrayList<Course>();
	Scanner in = new Scanner(System.in);
	private Object courses;
	private List Student;
	private Map<Integer, Students> map2;
	
	public AdministratorOp()
	{
		
	}
	//从文件读取List
	public void load1()
	{
		File file = new File("students.txt");
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			students = (List<Students>) ois.readObject();
			ois.close();
			fis.close();
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public void load2()
	{
		File file = new File("courses.txt");
		if(!file.exists());
		{
			try
			{
				file.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			courses = (List<Course>) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	//将信息写回文件
	public void save1()
	{
		File file = new File("students.txt");
		FileOutputStream fos;
		try
		{
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(students);
			oos.close();
			fos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void save2()
	{
		File file = new File("courses.txt");
		FileOutputStream fos;
		try
		{
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(courses);
		    oos.close();
		    fos.close();
	    }
	     catch (FileNotFoundException e)
	    {
		    e.printStackTrace();
	     }
	      catch (IOException e)
	    {
		    e.printStackTrace();
	    }
	}
	//根据List来创建Map
	public void createMap1()
	{
		for(int i = 0; i< students.size(); i++)
		{
			map1.put(students.get(i).getId(),students.get(i));
		}
			
	}
	
	//增删查改
	//增加学生基本信息
	public void add()
	{
		System.out.println("输入学生信息，输入0结束");
		while (true)
		{
			int id = in.nextInt();
			if(id!=0) {
			String name = in.next();
			Students s = new Students(id, name);
			students.add(s);
			Collections.sort(Student);
			map1.put(id, s);
			System.out.println("添加成功");
			}
			if (id == 0) {
				break; 
		}
	    }
	
       }
	// 删除学生信息
		public void del() {
			while(true) {
				int id = in.nextInt();
				Students s = map1.get(id);
				students.remove(s);
				map1.remove(id);
				System.out.println("移除成功");
				if (id == 0) {
					break;
				}
			}
		}
		// 增加课程基本信息
		public void add2() {
			System.out.println("输入课程信息，输入end结束");
			while (true) {	
				String id = in.nextLine();
				if(!id.equals("end"))
				{
				String name = in.nextLine();
				Course cr = new Course(id, name);
				//((List<Course>) courses).add(cr);
				//map2.put(id, cr);
				System.out.println("添加成功");
				}
				else{
					//System.out.println("添加结束");
					break;
				}
			}
		}
	 
		
		
	 
		// 根据学号查找学生
		public void query1() {
			System.out.println("请输入要查询的学生学号：");
			if (in.hasNext()) {
				int id = in.nextInt();
				System.out.println(map1.get(id));
				map1.get(id).trvese();
			}
		}
	 
		// 根据课程号查找课程
		public void query2() {
			System.out.println("请输入要查询的课程号：");
			if (in.hasNext()) {
				String id = in.nextLine();
				System.out.println(map2.get(id));
			}
		}
		
		//遍历list
		void display1()
		{
			System.out.println("所有的学生信息");
			for (Students s : students) {
				System.out.println(s.toString());
				s.trvese();

		}
		}
		
		void display2() {
			System.out.println("所有的备选课程信息：");
			for (Course  course:course) {
				System.out.println(course.toString());
			}
		}
	public	void close()
	{
		in.close();
	}
	

	
}
		
	