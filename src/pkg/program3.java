package pkg;
import java.util.ArrayList;
class Student {
	int id;
	String name;
	double marks;
	Student(int id, String name, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	void Display()
	{
		System.out.println("ID : " + id + "Name : " + name + "marks : " + marks);
	}
}
public class program3 {
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Vikas", 99.99));
		list.add(new Student(2, "Vikas 2", 98.99));
		list.add(new Student(3, "Vikas 3", 97.99));
		System.out.println("The Students details are ");
		for(Student s : list)
		{
			s.Display();
		}
	}
}
