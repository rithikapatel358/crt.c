write a program using functions to print armstrong upto 'n'

//source code
#include<stdio.h>
#include<math.h>
int amg(int);
int amg(int n)
{
int sum,temp,r,d,p;
sum=0;
temp=n;
d=(int)log10(n)+1;
while(n!=0)
{
r=n%10;
p=(int)(pow(r,d)+0.5);
sum=sum+p;
n=n/10;
}
if(temp==sum)
return 1;
else
return 0;
}
void main()
{
int i,n;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
if(amg(i))
printf("%d ",i);
}
}
