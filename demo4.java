package Exception_Handling_Concept;

public class demo4 {
	 
	static void disp3()
	{
    	int i= 1/0;
    }
	static void disp2()
	{
		disp3();
	}
	static void disp1()
	{
		disp2();
	}
	
		public static void main(String[] args) 
			{
			  System.out.println("main start");
			 try
			 {
				 disp1();
			 }
			 catch(ArithmeticException e)
			 {
				 e.printStackTrace();
			   }
			   System.out.println("main ends");

			}
		}

