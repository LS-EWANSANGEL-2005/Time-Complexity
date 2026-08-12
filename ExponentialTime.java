package TimeComplexity;

public class ExponentialTime {

	static int Findfib(int n) {
		if(n==0||n==1) {
			return n;
		}
		return Findfib(n-1)+Findfib(n-2);
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(Findfib(n));
		

	}

}
