package in.co.rays;

public class TestRandom {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int j=(int)(Math.random()*10000);
			if (j>999) {
				System.out.println(j);
			}
			
		}
			
		}

	}


