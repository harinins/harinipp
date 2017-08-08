import java.util.Scanner;

public class Romantoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String Romanno = "";
			int DecimalNo =0;
			System.out.println("Enter a roman number = ");
			Scanner input = new Scanner(System.in);
			Romanno = input.next();
			int length=  Romanno.length();
	    int num=0;
	    int previousnum = 0;
	    for (int i=length-1;i>=0;i--)
	        { 
	        char c =Romanno.charAt(i);
	        c = Character.toUpperCase(c);
	        switch(c)
	                {  
	                        case 'I':
	                        previousnum = num;
	                        num = 1;
	                        break;
	                        case 'V':
	                             previousnum = num;
	                        num = 5;
	                        break;
	                        case 'X':
	                                previousnum = num;
	                        num = 10;
	                        break;
	                        case 'L':
	                                previousnum = num;
	                        num = 50;
	                        break;
	                        case 'C':
	                                previousnum = num;
	                        num = 100;
	                        break;
	                        case 'D':
	                                previousnum = num;
	                        num = 500;
	                        break;
	                        case 'M':
	                                previousnum = num;
	                        num = 1000;
	                        break;
			           	}
	                if (num<previousnum)
	                {DecimalNo= DecimalNo-num;}
	                 else
	                DecimalNo = DecimalNo +num;
	        }
	        System.out.println("The Equilvalent Roman number is " + DecimalNo);
	}
	    
	
	}


