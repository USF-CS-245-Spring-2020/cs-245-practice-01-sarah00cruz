public class Practice01MathRecursive implements Practice01Math{
	
	public int fib (int n) throws ArithmeticException{
		if (n<0) //base case, if negative, it will throw exception
			throw new ArithmeticException();
		if(n <= 1) 
			return n;
		return fib(n-1) + fib(n-2); // this adds the previous 2 elements together
	}

	public int fact (int n) throws ArithmeticException{
		if (n<0) //base case
			throw new ArithmeticException();
		if (n==0)
			return 1;
		return n*fact(n-1); 
	}
}


