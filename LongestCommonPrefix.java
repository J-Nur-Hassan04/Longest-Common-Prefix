import java.util.*;
import java.io.*;
class str
{
  private List < String > list = new ArrayList < String > ();
  void addString (String str)
  {
    list.add (str);
  }

  String findPrefix (String s1, String s2)
  {
    if (s1.length() < 1 || s2.length() < 1)
      {
	    return "";
      }
    String prefix = "";
    if (s1.length () <= s2.length())
      {
	    for (int i = 0; i < s1.length (); i++)
	    {
	        if (s1.charAt (i) == s2.charAt (i))
	        {
        		prefix += s1.charAt (i);
        		continue;
	         }
	            break;
	    }
      }
    else
      {
	        for (int i = 0; i < s2.length (); i++)
	        {
		        if (s2.charAt (i) == s1.charAt (i))
		        {
        		    prefix += s2.charAt (i);
        		    continue;
		        }
		            break;
	        }
      }
      return prefix;
  }

  void printPrefix ()
  {
    String prefix = list.get(0);
    for(String str : list)
    {
        prefix = findPrefix(prefix,str);
    }
    if(prefix.length()>0)
    {
        System.out.println(prefix);
    }
    System.out.println("There is no common prefix");
  }


}

public class LongestCommonPrefix
{
  public static void main (String[]args) throws Exception
  {
    BufferedReader br =
      new BufferedReader (new InputStreamReader (System.in));

    int n;
      System.out.println ("Enter number of string : ");
      n = Integer.parseInt (br.readLine ());
    str s = new str ();
    for (int i = 0; i < n; i++)
      {
	s.addString (br.readLine ());
      }
    s.printPrefix ();
      br.close ();
  }
}