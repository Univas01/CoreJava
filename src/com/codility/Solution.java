package com.codility;

public class Solution {

	public static void main(String[] args) {
		
		// Finding duplicate values between two arrays

		int[] b = { 1, 13, 3, 5, 4 };
		int[] c = { 5, 2, 4, 7, 8 };
		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < c.length; k++) {
				if(b[i]==c[k]){
					System.out.println(b[i]);
				}
			}
		}
	}
}
