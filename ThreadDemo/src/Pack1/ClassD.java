package Pack1;

public class ClassD extends Thread 
{
	  
      public void run()
      {
    	  meth1();
      }
        synchronized void meth1()
      {
        	String name=Thread.currentThread().getName();
    	  for(int i=1;i<=5;i++)
    	  {
    		  System.out.println(name);
    	  }
      }
	public static void main(String[] args) 
	{
		ClassD obj=new ClassD();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		t1.setPriority(1);
		t2.setPriority(5);
	}

}
