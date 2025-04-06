package interfaceTask;

import java.util.Scanner;

public class SortAlgorithms {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter sorting algorithm (bubble/quick/merge): ");
        String algorithm = scanner.next();

        try {
            Sortable sorter = SortFactory.getSortAlgorithm(algorithm);
            sorter.sort(array);

            System.out.println("Sorted array:");
            for(int num : array) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
class SortFactory {
    public static Sortable getSortAlgorithm(String type) {
        switch (type.toLowerCase()) {
            case "bubble":
                return new BubbleSort();
            case "quick":
                return new QuickSort();
            case "merge":
                return new MergeSort();
            default:
                throw new IllegalArgumentException("Invalid sorting type: " + type);
        }
    }
}

 interface Sortable {
    void sort(int[] array);
}
class BubbleSort implements Sortable {
	    @Override
	    public void sort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	}
class QuickSort implements Sortable {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
class MergeSort implements Sortable {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
