import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/*
 * Name: Mofopefoluwa Omdiji
 * Overview: This program creates a sorting program that provides the user with a large assortment of sorting methods and options
 * Input: User selects a sort from the list
 * Output: Produces the user's sort of choice
 * Variables: endTime, startTime, elapsedTime, 
 */

public class MOsort {
	private static final int[] ARRAY_SIZES = {20, 100, 500, 1000};
    private static final int MAX_VALUE = 999;
    
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(MAX_VALUE + 1);
        }
        return array;
    }   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] array20 = generateRandomArray(20);
        int[] array100 =generateRandomArray(100);
        int[] array500 =generateRandomArray(500);
        int[] array1000 = generateRandomArray(1000);

        System.out.println("Choose a sorting algorithm to use:");
        System.out.println("1 - Bogo Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Bubble Sort");
        System.out.println("5 - Quick Sort");
        System.out.println("6 - Merge Sort");
        System.out.println("7 - Shell Sort");
        System.out.println("8 - Gnome Sort");
        System.out.println("9 - Cocktail Sort");
        System.out.println("10 - Counting Sort");
         
        int sort = scan.nextInt();
        
        switch(sort)

        {
            case 1:
                System.out.println("\nBogo Sort");
                System.out.println("Select array size (1-4):");
                int arrayChoice = scan.nextInt();
                switch (arrayChoice) {
                    case 1:
                        long startTime = System.nanoTime();
                        System.out.println("1");
                        bogoSort(array20.clone());
                        long endTime = System.nanoTime();
                        long elapsedTime = endTime - startTime;
                        System.out.println(Arrays.toString(array20.clone()));
                        System.out.println("Time taken to sort array: " + elapsedTime + " nanoseconds.");
                        break;
                    case 2:
                        long startTime1 = System.nanoTime();
                        bogoSort(array100.clone());
                        long endTime2 = System.nanoTime();
                        long elapsedTime1 = endTime2 - startTime1;
                        System.out.println(Arrays.toString(array100.clone()));
                        System.out.println("Time taken to sort array: " + elapsedTime1 + " nanoseconds.");

                        break;
                    case 3:
                        long startTime2 = System.nanoTime();
                        bogoSort(array500.clone());
                        long endTime3 = System.nanoTime();
                        long elapsedTime2 = endTime3 - startTime2;
                        System.out.println(Arrays.toString(array500.clone()));
                        System.out.println("Time taken to sort array: " + elapsedTime2 + " nanoseconds.");
                        break;
                    case 4:
                        long startTime3 = System.nanoTime();
                        bogoSort(array1000.clone());
                        long endTime4 = System.nanoTime();
                        long elapsedTime3 = endTime4 - startTime3;
                        System.out.println(Arrays.toString(array1000.clone()));
                        System.out.println("Time taken to sort array: " + elapsedTime3 + " nanoseconds.");
                        break;
                    default:
                        System.out.println("Invalid array size choice");
                        break;
                }
                break;

            case 2:
                System.out.println("\nSelection Sort");
                long startTime = System.nanoTime();
                selectionSort(array20.clone());
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime + " nanoseconds.");
                long startTime1 = System.nanoTime();
                selectionSort(array100.clone());
                long endTime1 = System.nanoTime();
                long elapsedTime1 = endTime1 - startTime1;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime1 + " nanoseconds.");
                long startTime2 = System.nanoTime();
                selectionSort(array500.clone());
                long endTime2 = System.nanoTime();
                long elapsedTime2 = endTime2 - startTime2;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime2 + " nanoseconds.");
                long startTime3 = System.nanoTime();
                selectionSort(array1000.clone());
                long endTime3 = System.nanoTime();
                long elapsedTime3 = endTime3 - startTime3;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime3 + " nanoseconds.");
                break;
            case 3:
                System.out.println("\nInsertion Sort");
                long startTime4 = System.nanoTime();
                insertionSort(array20.clone());
                long endTime4 = System.nanoTime();
                long elapsedTime4 = endTime4 - startTime4;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime4 + " nanoseconds.");
                long startTime5 = System.nanoTime();
                insertionSort(array100.clone());
                long endTime5 = System.nanoTime();
                long elapsedTime5 = endTime5 - startTime5;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime5 + " nanoseconds.");
                long startTime6 = System.nanoTime();
                insertionSort(array500.clone());
                long endTime6 = System.nanoTime();
                long elapsedTime6 = endTime6 - startTime6;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime6 + " nanoseconds.");
                long startTime7 = System.nanoTime();
                insertionSort(array1000.clone());
                long endTime7 = System.nanoTime();
                long elapsedTime7 = endTime7 - startTime7;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime7 + " nanoseconds.");


                break;
            case 4:
                System.out.println("\nBubble Sort");
                long startTime8 = System.nanoTime();
                bubbleSort(array20.clone());
                long endTime8 = System.nanoTime();
                long elapsedTime8 = endTime8 - startTime8;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8 + " nanoseconds.");
                long startTime9 = System.nanoTime();
                bubbleSort(array100.clone());
                long endTime9 = System.nanoTime();
                long elapsedTime9 = endTime9 - startTime9;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime9 + " nanoseconds.");
                long startTime0 = System.nanoTime();
                bubbleSort(array500.clone());
                long endTime0 = System.nanoTime();
                long elapsedTime0 = endTime0 - startTime0;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime0 + " nanoseconds.");
                long startTime10 = System.nanoTime();
                bubbleSort(array1000.clone());
                long endTime10 = System.nanoTime();
                long elapsedTime10 = endTime10 - startTime10;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime10 + " nanoseconds.");
                break;
            case 5:
                System.out.println("\nQuick Sort");
                long startTimeqqz = System.nanoTime();
                quickSort(array20.clone(), 0, array20.length - 1);
                long endTime8qqz = System.nanoTime();
                long elapsedTime8qqz = endTime8qqz - startTimeqqz;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qqz + " nanoseconds.");
                long startTimeqwx = System.nanoTime();
                quickSort(array100.clone(), 0, array100.length - 1);
                long endTime8qwx = System.nanoTime();
                long elapsedTime8qwx = endTime8qwx - startTimeqwx;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qwx + " nanoseconds.");
                long startTimeqac = System.nanoTime();
                quickSort(array500.clone(), 0, array500.length - 1);
                long endTime8qac = System.nanoTime();
                long elapsedTime8qac = endTime8qac - startTimeqac;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qac + " nanoseconds.");
                long startTimeqsv = System.nanoTime();
                quickSort(array1000.clone(), 0, array1000.length - 1);
                long endTime8qsv = System.nanoTime();
                long elapsedTime8qsv = endTime8qsv - startTimeqsv;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qsv + " nanoseconds.");
                break;
            case 6:
                System.out.println("\n Merge Sort");
                long startTimeqq = System.nanoTime();
                mergeSort(array20.clone(), 0, array20.length - 1);
                long endTime8qq = System.nanoTime();
                long elapsedTime8qq = endTime8qq - startTimeqq;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qq + " nanoseconds.");
                long startTimeqw = System.nanoTime();
                mergeSort(array100.clone(), 0, array100.length - 1);
                long endTime8qw = System.nanoTime();
                long elapsedTime8qw = endTime8qw - startTimeqw;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qw + " nanoseconds.");
                long startTimeqa = System.nanoTime();
                mergeSort(array500.clone(), 0, array500.length - 1);
                long endTime8qa = System.nanoTime();
                long elapsedTime8qa = endTime8qa - startTimeqa;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qa + " nanoseconds.");
                long startTimeqs = System.nanoTime();
                mergeSort(array1000.clone(), 0, array1000.length - 1);
                long endTime8qs = System.nanoTime();
                long elapsedTime8qs = endTime8qs - startTimeqs;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qs + " nanoseconds.");
                break;
            case 7:
                System.out.println("\nShell Sort");
                long startTimeq = System.nanoTime();
                shellSort(array20.clone());
                long endTime8q = System.nanoTime();
                long elapsedTime8q = endTime8q - startTimeq;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8q + " nanoseconds.");
                long startTime9q = System.nanoTime();
                shellSort(array100.clone());
                long endTime9q = System.nanoTime();
                long elapsedTime9q = endTime9q - startTime9q;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime9q + " nanoseconds.");
                long startTime0q = System.nanoTime();
                shellSort(array500.clone());
                long endTime0q = System.nanoTime();
                long elapsedTime0q = endTime0q - startTime0q;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime0q + " nanoseconds.");
                long startTime10q = System.nanoTime();
                shellSort(array1000.clone());
                long endTime10q = System.nanoTime();
                long elapsedTime10q = endTime10q - startTime10q;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime10q + " nanoseconds.");
                break;
            case 8:
                System.out.println("\nGnome Sort");
                long startTimeqwz = System.nanoTime();
                gnomeSort(array20.clone());
                long endTime8qwz = System.nanoTime();
                long elapsedTime8qwz = endTime8qwz - startTimeqwz;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qwz + " nanoseconds.");
                long startTime9qw = System.nanoTime();
                gnomeSort(array100.clone());
                long endTime9qw = System.nanoTime();
                long elapsedTime9qw = endTime9qw - startTime9qw;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime9qw + " nanoseconds.");
                long startTime0qw = System.nanoTime();
                gnomeSort(array500.clone());
                long endTime0qw = System.nanoTime();
                long elapsedTime0qw = endTime0qw - startTime0qw;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime0qw + " nanoseconds.");
                long startTime10qw = System.nanoTime();
                gnomeSort(array1000.clone());
                long endTime10qw = System.nanoTime();
                long elapsedTime10qw = endTime10qw - startTime10qw;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime10qw + " nanoseconds.");

                break;
            case 9:
                System.out.println("\nCocktail Sort");

                long startTimeqe = System.nanoTime();
                cocktailSort(array20.clone());
                long endTime8qe = System.nanoTime();
                long elapsedTime8qe = endTime8qe - startTimeqe;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qe + " nanoseconds.");
                long startTime9qe = System.nanoTime();
                cocktailSort(array100.clone());
                long endTime9qe = System.nanoTime();
                long elapsedTime9qe = endTime9qe - startTime9qe;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime9qe + " nanoseconds.");
                long startTime0qe = System.nanoTime();
                cocktailSort(array500.clone());
                long endTime0qe = System.nanoTime();
                long elapsedTime0qe = endTime0qe - startTime0qe;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime0qe + " nanoseconds.");
                long startTime10qe = System.nanoTime();
                cocktailSort(array1000.clone());
                long endTime10qe = System.nanoTime();
                long elapsedTime10qe = endTime10qe - startTime10qe;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime10qe + " nanoseconds.");

                break;
            case 10:
                System.out.println("\nCounting Sort");

                long startTimeqr = System.nanoTime();
                heapSort(array20.clone());
                long endTime8qr = System.nanoTime();
                long elapsedTime8qr = endTime8qr - startTimeqr;
                System.out.println(Arrays.toString(array20.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime8qr + " nanoseconds.");
                long startTime9qr = System.nanoTime();
                heapSort(array100.clone());
                long endTime9qr = System.nanoTime();
                long elapsedTime9qr = endTime9qr - startTime9qr;
                System.out.println(Arrays.toString(array100.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime9qr + " nanoseconds.");
                long startTime0qr = System.nanoTime();
                heapSort(array500.clone());
                long endTime0qr = System.nanoTime();
                long elapsedTime0qr = endTime0qr - startTime0qr;
                System.out.println(Arrays.toString(array500.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime0qr + " nanoseconds.");
                long startTime10qr = System.nanoTime();
                heapSort(array1000.clone());
                long endTime10qr = System.nanoTime();
                long elapsedTime10qr = endTime10qr - startTime10qr;
                System.out.println(Arrays.toString(array1000.clone()));
                System.out.println("Time taken to sort array: " + elapsedTime10qr + " nanoseconds.");

                break;
            default:
                System.out.println("Invalid option selected.");
                return;
        }



    }

    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }//Bogo Sort: This is a randomized sorting algorithm that works by generating random permutations of the input array until it happens to produce a sorted array. Bogo Sort has an average time complexity of O(n!) because of its random nature, making it very inefficient and impractical for large inputs.

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }//Selection Sort: This algorithm works by repeatedly finding the minimum element from the unsorted part of the array and swapping it with the first element of the unsorted part. Selection Sort has a time complexity of O(n^2), making it inefficient for large inputs.

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }//Insertion Sort: This algorithm works by iteratively inserting each element of the array into its proper position in a sorted subarray. Insertion Sort has a time complexity of O(n^2), but it can perform better than other quadratic algorithms for small inputs.

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }//Bubble Sort: This algorithm works by repeatedly swapping adjacent elements if they are in the wrong order. Bubble Sort has a time complexity of O(n^2), making it inefficient for large inputs.

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }//Quick Sort: This algorithm works by partitioning the array into two parts, recursively sorting each part, and then combining them. Quick Sort has an average time complexity of O(n*log(n)), but its worst-case time complexity can be O(n^2) if the pivot is chosen poorly.

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }//Merge Sort: This algorithm works by recursively dividing the array into halves, sorting each half, and then merging the sorted halves. Merge Sort has a time complexity of O(n*log(n)), making it efficient for large inputs.

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }// Shell Sort: This algorithm is a variation of Insertion Sort that works by sorting elements that are far apart first and gradually reducing the gap between elements. Shell Sort has a time complexity of O(n*log(n)^2) in the worst case, but its actual performance can vary depending on the gap sequence used.

    public static void gnomeSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0 || arr[i] >= arr[i - 1]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }//Gnome Sort: This algorithm works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order, but it also backtracks to the previous position to check if the previous elements are in the correct order. Gnome Sort has a time complexity of O(n^2), making it inefficient for large inputs.

    public static void cocktailSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            end--;
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            start++;
        }
    }//Cocktail Sort: This algorithm is a variation of Bubble Sort that works by repeatedly traversing the array in both directions, swapping adjacent elements if they are in the wrong order. Cocktail Sort has a time complexity of O(n^2), making it inefficient for large inputs.

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private static int[] createRandomArray(int size) {
        int[] array = new int[size];
        Random num = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = num.nextInt(1000);
        }
        return array;
    }



	}

	


