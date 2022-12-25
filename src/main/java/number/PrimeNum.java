package number;

public class PrimeNum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int i,j,prime, n;
		System.out.println("Prime numbers between 1 to 100 are:");
		for(i=2;i<=100;i++) {
			prime=0;
		
		for(j=2;j<=i/2;j++)// to check whether number divides
		{
			if(i%j==0)
			{
				prime=1;
				break;
			}
		}
		if(prime==0)
			System.out.print(i+ "  ");
		
	}
}

}
