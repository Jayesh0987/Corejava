package in.co.rays;

public class TestReverseSplit {

	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		String[] arr = name.split(" ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length() - 1; j >= 0; j--) {

				System.out.print(arr[i].charAt(j));

			}
			System.out.println((" "));
		}

	}

}
