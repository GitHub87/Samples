package sorts;

public class MergeSort {

	public static <T extends Comparable<T>> void sort(T[] table) {
		if (table.length > 1) {
			int halfSize = table.length / 2;
			T[] leftTable = (T[]) new Comparable[halfSize];
			T[] rightTable = (T[]) new Comparable[table.length - halfSize];
			System.arraycopy(table, 0, leftTable, 0, halfSize);
			System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize);

			sort(leftTable);
			sort(rightTable);

			merge(table, leftTable, rightTable);
		}
	}

	private static <T extends Comparable<T>> void merge(T[] outputSequence, T[] leftTable, T[] rightTable) {
		int i = 0, j = 0, k = 0;
		while (i < leftTable.length && j < rightTable.length) {
			if (leftTable[i].compareTo(rightTable[j]) < 0) {
				outputSequence[k++] = leftTable[i++];
			} else {
				outputSequence[k++] = rightTable[j++];
			}
		}

		while (i < leftTable.length) {
			outputSequence[k++] = leftTable[i++];
		}

		while (j < rightTable.length) {
			outputSequence[k++] = rightTable[j++];
		}

	}

}
