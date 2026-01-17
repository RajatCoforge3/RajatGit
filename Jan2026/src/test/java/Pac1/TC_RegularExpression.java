package Pac1;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class TC_RegularExpression {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input ="123456789555555555";
				String regex="\\d+";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		boolean result=m.matches();
		if(result==true)
		{
			System.out.println("Valid number");
		}
				
		else
		{
			System.out.println("Invalid Number");
		}
		
		String input1 = "Shop, Mop, Hopping,Chopping";
		Pattern pattern=Pattern.compile("Hop");
		
		Matcher match=pattern.matcher(input1);
		System.out.println(match.matches());
		while(match.find()) {
			System.out.println(match.group()+":"+match.start()+":"+match.end());
			
		}
	
	String phonemnumer ="8612345439";
	String regex1="\\d{10}";

    Pattern p1=Pattern.compile(regex1);
    Matcher m1=p1.matcher(phonemnumer);
    boolean result1=m1.matches();

    if(result1==true)
    {
    System.out.println("Valid phone number");
    }
	
    else
    {
    System.out.println("Invalid phone Number");
     }
	
    
    String input2 ="EXo1";
	String regex2="^[A-z][a-z]+[0-9]$";

Pattern p2=Pattern.compile(regex1);
Matcher m2=p2.matcher(phonemnumer);
boolean result2=m2.matches();
if(result2==true)
{
System.out.println("Matching");
}
	
else
{
System.out.println("Not Matching");
}

String email ="test.user@gmail.com";
String emailregex="^[A-Za-z0-9._%+-@^[A-za-z0-9.%+-]+\\.[A-Za-z][{2,}$";

Pattern emailp2=Pattern.compile(regex1);
Matcher emailm2=emailp2.matcher(phonemnumer);
boolean result3=emailm2.matches();
if(result3==true)
{
System.out.println("Email Matching");
}

else
{
System.out.println("Not Matching");
}
	
	
}

	
   }

 

 