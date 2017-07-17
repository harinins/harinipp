package overriding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,temp=1;
System.out.println("enter a number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++) {
	temp=temp*i;
}
System.out.println("Facorial of a number "+n+" is"+temp);
	}

}
