package overriding;

import java.util.Scanner;

public class Index {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int i,j,n,flag=0;
	System.out.println("enter the numbers");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int arr[]=new int[n];

	for( i=0;i<n;i++) {
		arr[i]=s.nextInt();
		for(i=0;i<n;i++)
		  {
			for(j=0;j<n;j++) {
				if(i!=j)
				 	if(arr[i]!=arr[j]) {
		  		flag=1;
		  	}
		  	else {
		  		flag=0;
		  		break;
		  	}}}}
	if(flag==1)
		    System.out.println(arr[i]);
		  
	}
	}
	

