package javatest;

import java.io.*;
import java.util.Arrays;

import javatest.StrToArr;
import javatest.PaiXu;

public class StringTest1 {

	public static void main(String[] args) throws IOException {

		try {
			String a1;

			System.out.println("input first string:");
			BufferedReader str1 = new BufferedReader(new InputStreamReader(
					System.in));
			a1 = str1.readLine();
			System.out.println("input is " + a1);

			/* 转换字符串为数组 */

			StrToArr strff = new StrToArr();
			int[] list = strff.StrToArr1(a1);
			int len = list.length;
			for (int i = 0; i < len; i++) {
				System.out.println("change to:" + list[i]);
			}

			long starttime = System.currentTimeMillis();
			/* 排序 */
			PaiXu pai = new PaiXu();

			int[] list2 = pai.paixu(list);

			long endtime = System.currentTimeMillis();

			System.out.println("tim1 is :" + (endtime - starttime));

			for (int i = 0; i < list2.length; i++) {
				System.out.println("paixu:" + list2[i]);
			}

			long start2 = System.currentTimeMillis();
			Arrays.sort(list);
			long end2 = System.currentTimeMillis();

			System.out.println("tim2 is :" + (end2 - start2));

			for (int j = 0; j < list.length; j++) {
				System.out.println("paixu2:" + list[j]);
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

	}

}
