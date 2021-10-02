package main;

import java.util.*;
public class Array{
	static int [] array;  //array
	static int size;      //size increases as elements are filled in the array.	
	
	public Array(){
		array=new int[100]; //length of array = 100
		size=0;
	}

	//function to get values from the user.
	static public boolean getValues(){
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values to insert:");
		int numofElem = input.nextInt(); //number of elements to insert.
		
		if(numofElem < 0) {
			System.out.println("error! size less than zero");
			flag = false;
		}
		else if(numofElem>100) {
			System.out.println("limit exceeded");
			flag = false;
		}
		else {
			for(int i=0;i<numofElem;i++){
				System.out.println("Enter the num"+i+":");
				insert(input.nextInt(),i);
			}
		}
		return flag;
	} 
	
	//function to insert elements in the array.
	static public void insert(int number,int position){
		for(int i=size-1;i>=position;i--){
			array[i+1]=array[i];
		}
		array[position]=number;
		size++;
	}

	//function to delete elements from the array.
	static public void delete(int position){
		for(int i=position;i<size-1;i++){
			array[i]=array[i+1];
		}
		size--;
	}

	//function to display the array.
	static public void display(){
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	//function to do Linear Search on the array.
	static public boolean linearSearch(int[] a1, int number){
		
		for(int i=0;i<a1.length;i++){
			if(number==a1[i]){
				return true;
			}
		}
		return false;
	}

	//fuction to sort the array.
	static public int[] bubbleSort(int[] a1){
		for(int i=0;i<a1.length-1;i++){
			for(int j=0;j<a1.length-i-1;j++){
				if(a1[j]>a1[j+1]){
					int temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
		return a1;
	}
				
	
	//function to to Binary Search on the array.
	static public boolean binarySearch(int[] a1, int number,int low, int high){
		if(low>high){
			return false;
		}
		int mid=low + (high-low)/2;
		if(a1[mid]==number){
			return true;
		}
		if(a1[mid]>number){
			return binarySearch(a1,number,low,mid-1);
		}
		else{
			return binarySearch(a1,number,mid+1,high);
		}
		
	}

	/*
	//main function
	public static void main(String [] args){
		Array array = new Array(); //create an array.
		array.getValues(); //get values from the user.
		array.display();   //display the array.

		array.insert(10,4);//insert num=10 at pos=4
		array.display();   //display the array.

		array.delete(3);   //delete num at pos=3 from the array.
		array.display();   //display the array.

//		System.out.println(array.linearSearch(40)); //check 40 is present in the array using linearSearch.

		array.bubbleSort();//sort the array.
		array.display();   //display the array.

		System.out.println(array.binarySearch(56,0,size)); //search for num=56 using Binary Search.
	}
	*/
}