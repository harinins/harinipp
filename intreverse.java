import java.io.*;
import java.util.Scanner;
class Reverse{
public static void main(String[] args){
int num=5698,reverse=0,r;
while(num!=0){
r=num%10;
reverse=reverse*10+r;
num=num/10;}
System.out.println(reverse);
}
}
