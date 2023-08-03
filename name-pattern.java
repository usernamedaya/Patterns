package array;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class Copy
{
	 public static void main(String[]args)
	{ 
		System.out.println(" ");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3&&i>=3 ||i==j&&i<=3 ||i+j==6&&i<=3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			for(int k=1;k<=5;k++)
			{
				if(i==1||k==1||k==5||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int l=1;l<=5;l++)
			{
				if(l==1&&i!=4 ||i==1||i==3||l==5&&i!=2||i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print("  ");
			for(int m=1;m<=5;m++)
			{
				if(m==1||m==5||i+m==6&&i>=3||m==5||i+m==8&&i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			for(int n=1;n<=5;n++)
			{
				if(i==1||n==1||n==5||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int o=1;o<=5;o++)
			{
				if(o==1||o==5||i==o)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print("  ");
			for(int p=1;p<=5;p++)
			{
				if(i==1||p==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print("  ");
			for(int q=1;q<=5;q++)
			{
				if(q==1||i==3||q==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
		System.out.println(" ");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||i==3||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print(" ");
			for(int k=1;k<=5;k++)
			{

				if(i==1||k==1||k==5||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int m=1;m<=5;m++)
			{
				if(m==1||i==1||m==5&i!=4||i==3||i+m==8&&i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int n=1;n<=5;n++)
			{
				if(i==1||i==3||i==5||n==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int o=1;o<=5;o++)
			{
				if(i==1||i==3||i==5||o==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int p=1;p<=5;p++)
			{
				if(p==1&&i!=4 ||i==1||i==3||p==5&&i!=2||i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print(" ");
			for(int q=1;q<=5;q++)
			{
				if(q==1||i==3||q==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||i==3||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print(" ");
			for(int k=1;k<=5;k++)
			{

				if(i==1||k==1||k==5||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int m=1;m<=5;m++)
			{
				if(m==1||i==1||m==5&i!=4||i==3||i+m==8&&i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int n=1;n<=5;n++)
			{
				if(n==1&&i!=4 ||i==1||i==3||n==5&&i!=2||i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print(" ");
			for(int o=1;o<=5;o++)
			{
				if(o==1||i==3||o==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.print(" ");
			for(int p=1;p<=5;p++)
			{
				if(i==1||p==1||p==5||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("-----------------------------------");
	}
}
