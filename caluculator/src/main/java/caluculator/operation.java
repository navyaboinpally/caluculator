package caluculator;

public class operation 
{
	int i;
	int j;
    public void add(int n,int m)
    {
    	i=n;
    	j=m;
        
        int k=i+j;
        System.out.println("addition of two numbers is:"+k);
    }
    public void sub(int n,int m)
    {
    	i=n;
    	j=m;
        int k=i-j;
        System.out.print("substraction of two numbers is:"+k);
    }
    public void mul(int n,int m)
    {
    	i=n;
    	j=m;
       
        int k=i*j;
        System.out.println("multipilication of two numbers is"+k);
    }
    public void div(int n,int m)
    {
    	i=n;
    	j=m;
        int k=i/j;
        System.out.println("division of two numbers"+k);
    }
    

}
