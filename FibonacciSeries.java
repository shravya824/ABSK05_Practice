package Assignment1;

public class FibonacciSeries {
	
	static void fibonacci(int n)
	{
		int a=0,b=1;
		for(int i=0;i<=n;i++)
		{
			if(a<10)
			{
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
			
		}
		}
		
	}

	public static void main(String[] args) {
		
		int n=10;
		fibonacci(n);

		
	}

}
