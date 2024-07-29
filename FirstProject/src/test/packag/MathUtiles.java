package test.packag;

public class MathUtiles {
	public int sum( int a, int b) {
		return a+b;
	}
	public boolean isEven(int number) {
		return number%2==0;
	}
	public boolean palidrom(String str) {
		int n= str.length();
		for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
		}
		return false;
	}
}

