package java_1;

import java.util.Scanner;

public class JavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter any sentence");
		String value=input.nextLine();
		int i=0,x=0;
		while(i<value.length())
		{
			if(value.charAt(i)==' ')
			{
				++x;
			}
			i++;
		}
		
		System.out.println(x);
	}
	

}
