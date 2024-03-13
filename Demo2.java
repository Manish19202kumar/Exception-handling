package Exception_Handling_Concept;

public class Demo2
{
	public static void main(String[] args) 
		{
		  System.out.println("main start");
		 try{
	    	int i= 1/0;
	    }
	   catch(ArrayIndexOutOfBoundsException e)
	    {
		    System.out.println("caught");
		   }
		 finally
		   {
			   System.out.println("i am finally block");
		   }
		   System.out.println("main endsa");

		}
	}


