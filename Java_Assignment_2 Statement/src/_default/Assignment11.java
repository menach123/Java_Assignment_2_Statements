package _default;

public class Assignment11 {
	public static void main(String[] args) {
		int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(array1[i]* j);
			}
		}
	}

}
