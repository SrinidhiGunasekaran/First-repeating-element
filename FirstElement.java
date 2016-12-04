import java.io.*;
class FirstElement
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int i,j,n;
System.out.println("Number of elements :");
n=Integer.parseInt(in.readLine());
int[] r=new int[n];
System.out.println("Elements:");
for(i=0;i<n;i++)
{
r[i]=Integer.parseInt(in.readLine());
}
System.out.println("First Repeating element:");
i=0;
while(i<n)
{
for(j=1;j<=n;j++)
{
if(r[i]==r[j])
{
System.out.println(r[j]);
}
}
i++;
}
}
catch(Exception e)
{
}
}
}
