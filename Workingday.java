import java.util.Scanner;

public class Workingday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		if(a.equals("monday")||a.equals("tuesday")||a.equals("wednesday")||a.equals("thursday")||a.equals("friday")||a.equals("saturday")){
			System.out.println("true");
		}else
		System.out.println("false");
			
	}

}
