package caluculator;

import java.util.regex.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class caluculator extends operation 
{

	    public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("enter the first number :");
	        int n=sc.nextInt();
	        System.out.print("enter the second number");
	        int m=sc.nextInt();
	        System.out.print("enter the any one from this list(example-add)(1-add        2-sub      3-mul     4-div)");
	        String t=sc.next();
	        operation b=new operation();
	        
	        if(t.equals("add"))
	        {
	            b.add(n,m);
	        }
	        else if(t.equals("sub"))
	        {
	            b.sub(n,m);
	        }
	        else if(t.equals("mul"))
	        {
	            b.mul(n,m);
	        }
	        else if(t.equals("div"))
	        {
	            b.div(n,m);
	        }
	        
	    }
}
