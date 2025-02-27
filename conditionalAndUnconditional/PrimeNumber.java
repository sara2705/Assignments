package conditionalAndUnconditional;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime Numbers between 1 to 30 ");
		for(int i=1;i<=30;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n<2) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        
        for (int i=5;i*i<=n;i+=6) {
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
	}

}
