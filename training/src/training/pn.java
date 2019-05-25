package training;

import java.util.Scanner;

public class pn {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int p = in.nextInt();
		int s = 0;
		
		for(int i=1;i<p;i++) 
		{
			//System.out.println(i);
			if(p%i == 0) 
			{
				s=s+i;
				System.out.println(s);
			}
		}
		if(s==p) 
		{
			System.out.println(true);
		}
		else 
		{
			System.out.println(false);
		}
	}

}
