public class first {

	public static void main(String[] args) {
		System.out.println(fibonacci(10)); 
	}
	
	static void firstMethod() {
		secondMethod();
		System.out.println("First");
	}
	static void secondMethod() {
		thirdMethod();
		System.out.println("Second");
	}
	static void thirdMethod() {
		fourthMethod();
		System.out.println("Third");
	}
	static void fourthMethod() {
		System.out.println("Fourth");
	}

	static void recur(int n) {
		if (n<1) {
			System.out.println("n is less than 1");
		} else {
			recur(n-1);
			System.out.println(n);
		}
	}
	 
	static int factorial(int n) {
		if (n<1) {
			return -1;
		}
		else if (n==0 || n==1) {
			return 1;
		} else {
			var result = n*factorial(n-1); 
			return result;
		}
	}
	
	static int fibonacci(int n) {
		if (n==1 || n==0) {
			return n;
		}
		else if (n < 0) {
			return n;
		} else {
			var result =  fibonacci(n-1) + fibonacci(n-2); 
			return result;
		}
		
	}
	
	static int digitSum(int n) {
		if (n==0 || n < 0) {
			return 0;
		} else {
			var result = n%10 + digitSum(n/10);
			return result;
		}
	}
	
	static int powerOfNumber(int x, int n) {
		if (n==0 || n==1) {
			return x;
		} else if (n<0) {
			return -1;
		} else {
			var result = x * powerOfNumber(x, n-1);
			return result;
		}
	}
	
	static int gcd(int a, int b) {
		if (b==0 || b<0 || a<0) {
			return a;
		} else {
			var result = gcd(b, a%b);
			return result;
		}
	}

	static int decimalToBinary(int n) {
		if (n==0 || n==1 || n<0) {
			return n;
		} else {
			var result = 10*(decimalToBinary(n/2)) + n%2;
			return result;
		}
	}
}
	