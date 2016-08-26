package javatest;

public class PaiXu {

	public int[] paixu(int[] arr1) {

		int len = arr1.length;

		for (int i = 0; i < len - 1; i++) {
			int s = i + 1;
			for (int j = s; j < len; j++) {
				if (arr1[i] > arr1[j]) {
					int x = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = x;
				}

			}
		}

		int[] listarr = arr1;

		return listarr;

	}

}
