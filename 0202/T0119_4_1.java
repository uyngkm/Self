package com.ssafy.self0119;

public class T0119_4_1 {
	public static void main(String[] args) {

		int N = 6;

		int[] Array = new int[5];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * N) + 1;
		}

		for (int x : Array) {
			System.out.print(x + " ");
		}

	}
}
