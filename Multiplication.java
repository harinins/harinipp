package harini;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("Enter a number");
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(int i=1;i<=num;i++){
	for(int j=1;j<=num;j++){
		System.out.println(" "+i*j+" ");
	}
System.out.println("\n");
	}

}
}