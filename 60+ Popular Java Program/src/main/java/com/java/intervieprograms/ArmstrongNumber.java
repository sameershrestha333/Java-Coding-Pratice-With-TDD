package com.java.intervieprograms;

import java.util.ArrayList;

public class ArmstrongNumber {

	public boolean isArmstrongNumber(int n) {
		int num = n;
		int countN = 0;
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (n != 0) {
			int remainder = n % 10;
			list.add(remainder);
			countN++;
			n = n / 10;
		}
		for (Integer in : list) {
			int temp = in;
			for (int i = 2; i <= countN; i++) {
				temp = temp * in;
			}
			sum = sum + temp;
		}

		return (sum == num);
	}

	public boolean checkArmstrongNumber(int num) {
		int copyOfNum = num;
		int noOfDigits = String.valueOf(num).length();
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			int temp = 1;
			for (int i = 1; i <= noOfDigits; i++) {
				temp = temp * remainder;
			}
			sum = sum + temp;
			num = num / 10;
		}

		return (sum == copyOfNum);
	}
}
