package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.RandomNumber;
import main.java.SortAlgos;
import java.util.Arrays;
public class AlgoTest {
	
	private int size = 200;
	static SortAlgos sortalgo = new SortAlgos();
	
	
	@Test (expected = NullPointerException.class) 
	public void bubbleSortWithInputIsNullThrowsNullPointerExceptionAsRequired() {
		SortAlgos.bubbleSort(getInput(0));
	}
	
	@Test (expected = NullPointerException.class) 
	public void selectionSortWithInputIsNullThrowsNullPointerExceptionAsRequired() {
		SortAlgos.selectionSort(getInput(0));
	}

	@Test (expected = NullPointerException.class) 
	public void insertionSortWithInputIsNullThrowsNullPointerExceptionAsRequired() {
		SortAlgos.insertionSort(getInput(0));
	}

	@Test (expected = NullPointerException.class) 
	public void mergeSortWithInputIsNullThrowsNullPointerExceptionAsRequired() {
		SortAlgos.mergeSort(getInput(0));
	}

	@Test (expected = NullPointerException.class) 
	public void quickSortWithInputIsNullThrowsNullPointerExceptionAsRequired() {
		SortAlgos.quickSort(getInput(0));
	}

	/*Manually taking the inputs*/
	@Test (expected = NullPointerException.class) 
	public void BubbleSortCoverageWhenInputIsNull() {
		Item arr3[] = new Item[10];
		Item arr4[] = new Item[10];
		int num[]=new int[10];
		//num = new int[] {10,90,70,30,11,50,45,32,56,88};
		num = new int[] {};

		for(int i =0;i<num.length;i++)
		{
		arr3[i]=new Item(num[i]);
		arr4[i] = new Item(num[i]);
		}
		
		sortalgo.bubbleSort(arr3);
		for(int k =0;k<10;k++)
		{
		System.out.println(arr3[k].key);
		System.out.println(arr4[k].key+"\n");
		}
		for(int j =0;j<num.length;j++)
		{
			assert(arr3[j].key== arr4[j].key);
		}
		}
	
	@Test
	public void BubbleSortCoverageWhenInputIsOneElement() {
		Item arr3[] = new Item[1];
		Item arr4[] = new Item[1];
		int num[]=new int[1];
		//num = new int[] {10,90,70,30,11,50,45,32,56,88};
		num = new int[] {10};

		for(int i =0;i<num.length;i++)
		{
		arr3[i]=new Item(num[i]);
		arr4[i] = new Item(num[i]);
		}
		
		sortalgo.bubbleSort(arr3);
		for(int k =0;k<num.length;k++)
		{
		System.out.println(arr3[k].key);
		System.out.println(arr4[k].key+"\n");
		}
		for(int j =0;j<num.length;j++)
		{
			assert(arr3[j].key== arr4[j].key);
		}
		
		
		}
	
	@Test
	public void BubbleSortCoverageRandomInput() {
		Item arr3[] = new Item[5];
		Item arr4[] = new Item[5];
		int num[]=new int[1];
		num = new int[] {10,4,51,2,23};
		for(int i =0;i<num.length;i++)
		{
		arr3[i]=new Item(num[i]);
		arr4[i] = new Item(num[i]);
		}
		Arrays.sort(num);
		SortAlgos.bubbleSort(arr3);
		for(int k =0;k<num.length;k++)
		{
			assert(num[k] == arr3[k].key);
		}
	}
	
	@Test
	public void MethodForCoverageAscendingInputs()
	{
		Item arr3[] = new Item[5];
		Item arr4[] = new Item[5];
		int num[]=new int[1];
		num = new int[] {10,20,30,40,50};
		for(int i =0;i<num.length;i++)
		{
		arr3[i]=new Item(num[i]);
		arr4[i] = new Item(num[i]);
		}
		Arrays.sort(num);
		SortAlgos.bubbleSort(arr3);
		for(int k =0;k<num.length;k++)
		{
			assert(num[k] == arr3[k].key);
		}
	}
	
	@Test
	public void MethodForCoverageDescendingInputs()
	{
		Item arr3[] = new Item[5];
		Item arr4[] = new Item[5];
		int num[]=new int[1];
		num = new int[] {60,50,46,23,14};
		for(int i =0;i<num.length;i++)
		{
		arr3[i]=new Item(num[i]);
		arr4[i] = new Item(num[i]);
		}
		Arrays.sort(num);
		SortAlgos.bubbleSort(arr3);
		for(int k =0;k<num.length;k++)
		{
			assert(num[k] == arr3[k].key);
		}
	}

	/*Comparing Bubble sort with all other sorting algorithms*/
	@Test
	public void comparingBubbleSortWithAllSort() {	
		Item[] arr = getInput(size);
		Item[] arr2 = new Item[arr.length];
		Item[] arr3 = new Item[arr.length];
		Item[] arr4 = new Item[arr.length];
		Item[] arr5 = new Item[arr.length];	
		Item[] arr6 = new Item[arr.length];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.arraycopy(arr, 0, arr4, 0, arr.length);
		System.arraycopy(arr, 0, arr5, 0, arr.length);
		System.arraycopy(arr, 0, arr6, 0, arr.length);
		sortalgo.bubbleSort(arr);
		sortalgo.insertionSort(arr2);
		for(int j =0;j<10;j++)
		{
			assert(arr[j].key== arr2[j].key);
		}
		sortalgo.heapSort(arr3);
		for(int j =0;j<10;j++)
		{
			assert(arr[j].key== arr3[j].key);
		}
		sortalgo.quickSort(arr4);
		for(int j =0;j<10;j++)
		{
			assert(arr[j].key== arr4[j].key);
		}
		sortalgo.selectionSort(arr5);
		for(int j =0;j<10;j++)
		{
			assert(arr[j].key== arr5[j].key);
		}
		sortalgo.mergeSort(arr6);
		for(int j =0;j<10;j++)
		{
			assert(arr[j].key== arr6[j].key);
		}
		}
	
	private int printSortedArray(Item[] array) {
		for (int i =0 ; i<array.length;i++) {
			System.out.println(array[i].key);
		}
		return 0;
	}
	
	
	private Item[] getInput(int size) {
		Item[] items = null;
		if (size > 0) {
			items =  new Item[size];
			RandomNumber randomGenerator = new RandomNumber();
			for (int i = 0; i< size; i++) {
				items[i] = new Item(randomGenerator.nextIntRand(0, size));
			}
		}
		return items;
	}
}
