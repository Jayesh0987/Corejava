package in.co.rays;

public class Practicelargest {

	public static void main(String[] args) {
		int n = 456123;
		int r = 0;
		while (r<n){
			r = n%10;
			System.out.println(r);
			n = n/10;
		}

	}

}
