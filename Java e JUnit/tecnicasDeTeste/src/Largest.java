public class Largest {
	public static int largest(int[] list) {
		int index, max = Integer.MIN_VALUE; // max = MAX_VALUE
		for (index = 0; index < list.length; index++){ // index < list.length-1
			if (list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}
}
