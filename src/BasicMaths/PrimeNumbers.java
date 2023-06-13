package BasicMaths;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		boolean ans = prime(n);
		if(n!=1 && ans==true) {
			System.out.println("It is a Prime number");
		}else {
			System.out.println("It is Not a Prime number");
		}
	}
	public static boolean prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	

}
