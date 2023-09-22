package Pack1;

public class ClassB implements Runnable
{ 
	public void run()
	{
	String name=Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name);
		}
	}

	public static void main(String[] args)
	{
		ClassB obj=new ClassB();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		t1.setName("First_Thread");
		t2.setName("Second_Thread");
		
	}
}
