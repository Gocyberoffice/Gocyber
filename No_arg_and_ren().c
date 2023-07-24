//function with no  argument and return value
#include<stdio.h>
#include <conio.h>

void main()
{ 
int s;
s= sum();
printf("%d",s);
s=diff();
printf("%d",s);
s=prod();
printf("%d",s);
}
int sum()
{
int a,b,c;
printf("enter two value:");
scanf("%d%d",&a,&b);
c=a+b;
return c;
}
int diff(int a,int b)
{
int c;
printf("enter two value:");
scanf("%d%d",&a,&b);
c=a-b;
return c;
}
int prod(int a,int b)
{
int c;
printf("enter two value:");
scanf("%d%d",&a,&b);
c=a*b;
return c;
}











    
