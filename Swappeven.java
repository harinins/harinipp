import java.io.*;
import java.util.Scanner;
class Swap{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String a=s.next();
char c[]=a.tocharArray();
System.out.println(Arrays.toString(c));
for(int i=0;i<c.length;i+=2){
System.out.println(c[i]);
}
}
}
