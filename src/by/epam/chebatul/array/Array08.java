package by.epam.chebatul.array;

import java.util.Arrays;

/*
 Дана последовательность целых чисел a a an/ Образовать новую последовательность, выбросив из
исходной те члены, которые равны  min(a1 a2  an)
 */

public class Array08 {

	public static void main(String[] args) {

		int[] arrA = { 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9 };

		int min;

		min = arrA[0];

		for (int i = 0; i < arrA.length; i++) {
			min = Math.min(min, arrA[i]);
		}
		
		int a = 0;


		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i]!=min) {
				
				a+=1;
			} 

		}
		
		int[] newArray = new int[a];
		
		for (int i = arrA.length-1; i >=0; i--) {
			if (arrA[i]!=min) {
				a-=1;
				newArray[a]=arrA[i];
			}
		}
		
		
		System.out.println(Arrays.toString(newArray));

	}

}
