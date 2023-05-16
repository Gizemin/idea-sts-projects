package ders2;

import java.util.Random;

public class MyArray {

	public static void main(String[] args) {

		int[][] myArr = new int[4][4];

		myArr[0][0] = 123;
		myArr[2][1] = 33;

		myArr[3][3] = 55;
		// myArr [4][4]=55;

		System.out.println("---2D ARRAY-----------------------");

		int satir = 4;
		int sutun = 5;

		int[][] yourArr = new int[satir][sutun];

		Random randomNumber = new Random();

		for (int i = 0; i < satir; i++) { // SATIR

			for (int j = 0; j < sutun; j++) { // SÜTUN | kolon
				yourArr[i][j] = randomNumber.nextInt(50);

			}

		}

		for (int i = 0; i < satir; i++) { // SATIR

			for (int j = 0; j < sutun; j++) { // SÜTUN | kolon
				yourArr[i][j] = randomNumber.nextInt(50);

				System.out.print(yourArr[i][j] + "\t");
			}
			System.out.println();

		}

		System.out.println("---3D ARRAY-----------------------");

		int[][][] yourArr3d = new int[3][3][3];
		yourArr3d[0][0][0] = 88;
		yourArr3d[0][0][1] = 55;
		yourArr3d[0][0][2] = 77;

		for (int i = 0; i < 3; i++) {  //TABLE - tablo
			for (int j = 0; j < 3; j++) { // ROW - satir
				for (int k = 0; k < 3; k++) { // COLUMN - sutun | kolon
					yourArr3d[i][j][k] = randomNumber.nextInt(2000);

				}

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					yourArr3d[i][j][k] = randomNumber.nextInt(2000);

					System.out.print(yourArr3d[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}


