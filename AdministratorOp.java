//�����
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
	//���ļ���ȡList
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
	
	//����Ϣд���ļ�
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
	//����List������Map
	public void createMap1()
	{
		for(int i = 0; i< students.size(); i++)
		{
			map1.put(students.get(i).getId(),students.get(i));
		}
			
	}
	
	//��ɾ���
	//����ѧ��������Ϣ
	public void add()
	{
		System.out.println("����ѧ����Ϣ������0����");
		while (true)
		{
			int id = in.nextInt();
			if(id!=0) {
			String name = in.next();
			Students s = new Students(id, name);
			students.add(s);
			Collections.sort(Student);
			map1.put(id, s);
			System.out.println("��ӳɹ�");
			}
			if (id == 0) {
				break; 
		}
	    }
	
       }
	// ɾ��ѧ����Ϣ
		public void del() {
			while(true) {
				int id = in.nextInt();
				Students s = map1.get(id);
				students.remove(s);
				map1.remove(id);
				System.out.println("�Ƴ��ɹ�");
				if (id == 0) {
					break;
				}
			}
		}
		// ���ӿγ̻�����Ϣ
		public void add2() {
			System.out.println("����γ���Ϣ������end����");
			while (true) {	
				String id = in.nextLine();
				if(!id.equals("end"))
				{
				String name = in.nextLine();
				Course cr = new Course(id, name);
				//((List<Course>) courses).add(cr);
				//map2.put(id, cr);
				System.out.println("��ӳɹ�");
				}
				else{
					//System.out.println("��ӽ���");
					break;
				}
			}
		}
	 
		
		
	 
		// ����ѧ�Ų���ѧ��
		public void query1() {
			System.out.println("������Ҫ��ѯ��ѧ��ѧ�ţ�");
			if (in.hasNext()) {
				int id = in.nextInt();
				System.out.println(map1.get(id));
				map1.get(id).trvese();
			}
		}
	 
		// ���ݿγ̺Ų��ҿγ�
		public void query2() {
			System.out.println("������Ҫ��ѯ�Ŀγ̺ţ�");
			if (in.hasNext()) {
				String id = in.nextLine();
				System.out.println(map2.get(id));
			}
		}
		
		//����list
		void display1()
		{
			System.out.println("���е�ѧ����Ϣ");
			for (Students s : students) {
				System.out.println(s.toString());
				s.trvese();

		}
		}
		
		void display2() {
			System.out.println("���еı�ѡ�γ���Ϣ��");
			for (Course  course:course) {
				System.out.println(course.toString());
			}
		}
	public	void close()
	{
		in.close();
	}
	

	
}
		
	