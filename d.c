#include<stdio.h>
void main()
{
int a,b[100],i,d,c;
printf("enter the no of elements");
scanf("%d",&a);
printf("enter the elements");for(i=0;i<a;i++)
{
    scanf("%d",&b[i]);
    }d=0;c=0;
    printf("no of even no");
for(i=0;i<a;i++)
{
if(b[i]%2==0)
{d++;
}
}
printf("no of odd no");
for(i=0;i<a;i++)
    {
        if(b[i]%2!=0)
{c++;}
}printf("%d",d);
printf("%d",c);
}
