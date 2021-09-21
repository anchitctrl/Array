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
