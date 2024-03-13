package Exception_Handling_Concept;

public class Shadidotcom {
  static void submit() throws MarriageException
  {
	  int age=18;
	  if(age>=21)
	  {
		  System.out.println("happy life");
	  }
	  else
	  {
		  throw new MarriageException("inavlid age");
	  }
  }
  public static void main(String[] args)
  {
	  try
	  {
		  submit();
	  }
	  catch(MarriageException e)
	  {
		  System.out.println(e.getmsg());
	  }
  }
}
class MarriageException extends Exception
{
	String msg;
	MarriageException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
