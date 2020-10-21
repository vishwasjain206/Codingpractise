package vishwas;
class Student
{
	int roll;
	
}

public class Stack {
	
	public Student num[];
	int top;
	Stack(int size)
	{
		num = new Student[size];
		top=-1;
		
	}
	
	

	


	public void setTop(int top) {
		this.top = top;
	}

	void pushdata(Student s)
	{
		top++;
		System.out.println(top);
		num[top] = s;
		
		
	}
	void popdata()
	{
		if (top!= -1)
			top--;
	}
	int getdata()
	{
	//	if (top != -1)
		try
		{
			return num[top].roll;
		}
		catch(Exception e)
		{
			System.out.println("oopsie");
		}
		//else
			//return -90909;
		return -999;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s1= new Stack(10);
		Student s = new Student();
		//s.roll= 5;
		//s1.pushdata(s);
		System.out.println(s1.getdata());
		
		
		
	}

}
