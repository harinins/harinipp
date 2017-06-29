package harini;

import java.util.Scanner;

public class Eveninterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,low,high;
		System.out.println("enter two values:");
		Scanner sc=new Scanner(System.in);
		low=sc.nextInt();
		high=sc.nextInt();
		for(i=low;i<=high;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
			
	}

}
