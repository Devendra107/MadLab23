public class Main
{
  public static void main (String[]args)
  {
    int times = Integer.parseInt (args[0]);
      System.out.println ("Multiplication table of :" + times);
    for (int i = 1; i <= 10; i++)
      {
	System.out.println (times + " X " + i + " = " + times * i);

      }
  }

}
