import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nr=2*n+1;
		int nst=2*n+1;
		int nsp=0;
		int temp=n;
		int temp1=n;
		int nst2=1;
		int row1=6;
		while(row<=nr)
		{
			
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				System.out.print(" ");
				csp++;
			}
			//work for integers
			int cst=1;
			while(cst<=((nst+1)/2))
			{
				System.out.print(temp);
				System.out.print(" ");
				temp--;
				cst++;
			}
			//work for space
			
			//work for second set of integers
			int cst2=1;
			temp=temp+2;
			while(cst2<((nst+1)/2))
			{
				System.out.print(temp);
				System.out.print(" ");
				temp++;
				
				cst2++;
			}
			if(row<=nr/2)
			{
				nst=nst-2;
				nsp=nsp+1;
				temp=temp-2;
			}
			else
			{
				nst=nst+2;
				nsp=nsp-1;			
			}
			
			row++;
			System.out.println();
		}
    }
}
