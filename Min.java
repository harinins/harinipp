import java.io.*;
import java.util.Scanner;
class Minutes{
public static void main(String[] args){
int front;
int end;
int min=0;
Scanner s=new Scanner(System.in);
front=s.nextInt();
end=s.nextInt();
if((front>0) && (end<=24)){
for(int i=front;i<=end;i++){
min=min+60;}
System.out.println(min);}
}}
