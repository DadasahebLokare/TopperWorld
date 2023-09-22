package Pack1;

public class ClassC extends Thread
{
	public void run()
	 {
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is my "+i+"interview");
		}
		System.out.println("Hello");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("my sleep got disrubed ");
		}
		System.out.println("i am ready to office");
	 }
	public static void main(String[] args) 
	{
		ClassC obj=new ClassC();
		Thread t1=new Thread(obj);
	   
	    t1.start();
	   t1.interrupt();
	    
	}

}
