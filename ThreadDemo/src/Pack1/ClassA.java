package Pack1;

public class ClassA extends Thread 
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
		ClassA obj=new ClassA();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		
		
	}

}
