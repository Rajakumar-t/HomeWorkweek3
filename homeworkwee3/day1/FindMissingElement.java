package homeworkwee3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(a);
		int lengthOfArray = a.length;
		for (int i = 0; i < a.length; i++) {
			if (a[i + 1] != a[i] + 1) {
				System.out.println("Missing Number" + " " + (a[i] + 1));
				return;
			}

		}

	}

}
