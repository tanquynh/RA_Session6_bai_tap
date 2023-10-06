package BT3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];

        // Khởi tạo mảng với các số ngẫu nhiên
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000);
        }

        // Bắt đầu đo thời gian
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // Sắp xếp mảng bằng thuật toán sắp xếp chọn (selection sort)
        selectionSort(arr);

        // Kết thúc đo thời gian
        stopwatch.stop();

        // In ra thời gian thực thi
        System.out.println("Thời gian thực thi của selection sort cho " + n + " số là: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
