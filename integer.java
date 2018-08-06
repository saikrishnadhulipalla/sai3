
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n,i,sum=0,k;
	              int a[] = new int[10];
	              Scanner s = new Scanner (System.in);
	              n = s.nextInt();
	              k = s.nextInt();
	              for (i=0;i<n;i++)
	              {
	            	a[i] = s.nextInt();
	              }
	              for ( i =0;i<k;i++)
	              {
	              	 sum = sum + a[i];
	              }
	              System.out.println(sum);
	  	}
      }
