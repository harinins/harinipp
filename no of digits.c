#include<stdio.h>
int main()
{
int num,i,count=0;
printf("\nenter the number:");
scanf("%d",&num);
while(num)
{
num=num/10;
count++;
}
printf("digitd is %d",count);
}
