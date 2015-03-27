package com.bayviewglen.daytwo;

public class one {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int[] numbers2 = {1,4,5,6,7,8,4,3,3,44};
		int[] numbers3 = new int[100];
		int size = 0;
		
		copyArray(numbers2, numbers);
		
		printEven(numbers);
		
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 0);
		size = removeNoOrder(numbers3, size, 0);
		
		size = add(numbers3, size, 10);
		size = add(numbers3, size, 20);
		size = add(numbers3, size, 30);
		size = add(numbers3, size, 40);
		size = add(numbers3, size, 50);
		size = add(numbers3, size, 60);
		size = add(numbers3, size, 70);
		size = add(numbers3, size, 80);
		size = add(numbers3, size, 90);
		
		size = removeWithOrder(numbers3, size, 3);
		
		display(numbers3, size);
	}
	
	private static int removeWithOrder(int[] arr, int size, int index) {
		for (int i=index; i<size-1; ++i){
			arr[i] = arr[i+1];
		}
		
		return --size;
	}

	private static int removeNoOrder(int[] arr, int size, int index) {
		if (index<0 || index> size-1)
			return size;
		
		arr[index] = arr[--size];
		
		return size;
	}

	private static int add(int[] arr, int size, int el) {
		
		if(arr.length == size)
			return size;
			
		arr[size++] = el;
		
		return size;
	}

	public static void copyArray(int[] src, int[] destination){
		for (int i = 0; i< src.length; i++){
			destination[i] = src[i];
		}
	}
	
	public static void printEven(int[] arr){
		System.out.println("---");
		System.out.println("Print Even Starting");
		for (int i = 0; i< arr.length; i++){
			if (arr[i] % 2 == 0){
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println("Print Even Ending");
		System.out.println("---\n");
	}
	
	public static void display(int[] arr, int size){
		System.out.println("---");
		System.out.println("Display Starting");
		for (int i = 0; i<size; i++){
				System.out.println(arr[i] + " ");
		}
		System.out.println("Display Ending");
		System.out.println("---\n");
	}
}