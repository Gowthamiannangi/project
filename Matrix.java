import java.util.Scanner;
class Matrix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows of firstmatrix");
int r1=sc.nextInt();
System.out.println("enter number of columns of firstmatrix");
int c1=sc.nextInt();
System.out.println("enter number of rows of secondmatrix");
int r2=sc.nextInt();
System.out.println("enter number of columns of secondmatrix");
int c2=sc.nextInt();
System.out.println("enter elements of firstmatrix");
int [][]a=new int[r1][c1];
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("enter elements of secondmatrix");
int [][]b=new int[r2][c2];
for(int i=0;i<r2;i++)
{
for(int j=0;j<c2;j++)
{
b[i][j]=sc.nextInt();
}}

if(c1==r2)
{
for(int i=0;i<r1;i++)
{
for(int j=0;j<c2;j++)
{
int sum=0;
for(int k=0;k<r2;k++)
{
sum=sum+a[i][k]*b[k][j];
}
System.out.print(sum+" ");
}
System.out.println();
}
}
else
{
System.out.print("matrixmultiplication is not possible");
}
}
}


