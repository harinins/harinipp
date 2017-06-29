package harini;

import java.util.Scanner;

public class Primeinterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int low,high,i,j,flag;
System.out.println("Enter the two numbers:");
Scanner sc=new Scanner(System.in);
low=sc.nextInt();
high=sc.nextInt();
for( i=low;i<high;i++){
	boolean isPrime=true;
for(j=2;j<i;j++){
	if(i%j==0){
		isPrime=false;
		break;
	}
}
if(isPrime)
	System.out.println(i+" ");}}}