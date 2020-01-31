public class Practice01MathIterative implements Practice01Math{
	public int fib (int n) throws ArithmeticException{
		if (n<0) //base case
			throw new ArithmeticException();
		if(n <= 1)  //covers first 2 numbers of sequence
			return n;
		int fib = 0;
		int current = 1; //because it starts 0,1,1
		for(int i=1; i<=n; i++) { 
			int previous = fib;
			fib = current;
			current = previous + fib; //adding previous 2 terms
		}
		return fib;
	}

	public int fact (int n) throws ArithmeticException{
		if (n<0) //base case
			throw new ArithmeticException();
		int i = 0;
		int fact = 1;
		while(i<n){ //adds until i reaches n
			i++;
			fact*=i;
		}
		return fact; 
	}
}

