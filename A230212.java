package a12;

import java.util.Scanner;

public class A230212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int count = 0;
		int f = 0;
		System.out.println("숫자를 입력하시오: ");
		i = sc.nextInt();

		if (i >= 0 && i <= 99) {

			int k = i;

			for (;;) {
				if (k < 10) {
					f = 0;
				} else {
					f = (k / 10);
				}
				int s = (k % 10);
				k = s * 10 + (f + s) % 10;

				count++;
				if (k == i) {
					break;
				}
			}
			System.out.println(count);
		}
	}
}
