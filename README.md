# Array

### Hey Techies :man_technologist: , I am making this repository to help you out to go through your placements and revision of Array Data Structures. 

<br/>

> #### An Array is used to call a person who is at a distance far away from us and is visible to our naked eye.

### Actually an Array is lot more than this :rofl: , So let's go through some of the very basics questions which you can encounter in your placements and in interviews too.

### Table of Contents:
* [Implement and Add Elements](#implement-and-add-elements)
* [Print Elements of an Array](#print-elements-of-an-array)
* [Remove all the Even Integers](#remove-all-the-even-integers)
* [Find the minimum value in an Array](#find-the-minimum-value-in-an-array)
* [Find the maximum value in an Array](#find-the-maximum-value-in-an-array)
* [Reverse an Array](#reverse-an-array)
* [Check is a string is palindrome or not](#check-if-a-string-is-palindrome-or-not)
* [Kth Largest or Kth Smallest number in an Array](#kth-largest-or-kth-smallest-number-in-an-array)
* [Two Sum Problem](#two-sum-problem)
* [Rotation of an Array by one](#rotation-of-an-array-by-one)

<a name="implement-and-add-elements"></a>
## Implement and Add Elements

```java
public class ArrayUtil {
 
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    public void arrayDemo() {
        int[] myArray = new int[5]; // default values // 0 1 2 3 4
        // printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);
 
        int[] arr = {5,1,8,10};
        printArray(arr);
    }
 
    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
 
}
```
  
<a name="print-elements-of-an-array"></a>
## Print Elements of an Array

```java
public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	} 
```
  
<a name="remove-all-the-even-integers"></a>
## Remove all the Even Integers

```java
public int[] removeEven(int[] arr) {
		int oddElements = 0;
 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddElements++;
			}
		}
 
		int[] result = new int[oddElements];
		int index = 0;
 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i];
				index++;
			}
		}
		return result;
	} 
```

<a name="find-the-minimum-value-in-an-array"></a>
## Find the minimum value in an Array

```java
public int findMinimum(int[] arr) {
		// edge case
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0]; // min will hold the minimum of array
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
```

<a name="find-the-maximum-value-in-an-array"></a>
## Find the maximum value in an Array

```java
public int findMaximum(int[] arr) {
		// edge case
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int max = arr[0]; // min will hold the minimum of array
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > min) {
				max = arr[i];
			}
		}
		return max;
	}
```

<a name="reverse-an-array"></a>
## Reverse an Array

```java
public static void reverse(int[] numbers, int start, int end) {
		while(start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}
```

<a name="check-if-a-string-is-palindrome-or-not"></a> <>
## Check is a string is palindrome or not

```

```

<a name="kth-largest-or-kth-smallest-number-in-an-array"></a>
## Kth Largest or Kth Smallest number in an Array

```

```

<a name="two-sum-problem"></a>
## Two Sum Problem

```

```

<a name="rotation-of-an-array-by-one"></a>
## Rotation of an Array by one

```

```
