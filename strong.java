import java.util.Scanner;

class strong 
{
	public static int calfact(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact*=i;

		}
		
		return fact;
	}
	public static void strongInrange(int num){
		int sum=0;
		int n=num;
		while(num!=0){
			int d=num%10;
            sum+=calfact(d);
			num/=10;
			}
			if(sum==n)
			System.out.println("strong");
			else
			System.out.println("not a strong");

			}

	public static void main(String[] args) 
	{   Scanner s1=new Scanner(System.in);
	    
		System.out.println("Enter the number:");
		int n=s1.nextInt();
        
		strongInrange(n);
	}
}
