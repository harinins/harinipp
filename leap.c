#include<stdio.h>
int main()
{
int n;
printf("\n enter the value");
scanf("%d",&n);
if(n%4==0)
{
if(n%100==0)
{
if(n%400==0)
printf("\nit isn a leap year");
else
printf("\nit is not a leap year")
}
printf("it is a leap year");
}
printf("it is not a leap year");
}
