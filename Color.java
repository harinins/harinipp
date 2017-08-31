package guvi;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter the input");
		  Scanner in=new Scanner(System.in);
		  String s=in.nextLine();
			int m=s.length();
			int j=0;
			int g,n,k;
				for(int i=0;i<m;i++){
				g=s.charAt(i)-'0';
				if(g==s.charAt(m-1)-'0')
		{
					n=s.charAt(0)-'0';
			
					k=pow(g,n);
				}
				else{
			        n=s.charAt(i+1)-'0';
			        k=pow(g,n);
		                }j=j+k;}
				System.out.println(j);
			 }
			 static  int pow(int g,int n){
			    int total=1;
			    for(int i=1;i<=n;i++){
			        total*=g;
		            }return total;
			 }
	
}
