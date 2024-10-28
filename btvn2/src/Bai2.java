import java.util.Scanner;
//Bài 2 này full chatgpt ạ
public class Bai2 {
    public static int maxSumSubarray(int[] arr, int n, int k) {
        // Bước 1: Tính tổng của dãy con đầu tiên có k phần tử
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        // Bước 2: Duyệt qua các phần tử từ k đến n - 1
        for (int i = k; i < n; i++) {
            // Cập nhật tổng cho cửa sổ trượt bằng cách thêm arr[i] và loại bỏ arr[i - k]
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);

            // Bước 3: Mở rộng dãy con hiện tại và cập nhật maxSum nếu cần
            int tempSum = currentSum;
            for (int j = i + 1; j < n; j++) {
                tempSum += arr[j];
                maxSum = Math.max(maxSum, tempSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {-4, -2, 1, -3};
        int n1 = 4;
        int k1 = 2;
        System.out.println(maxSumSubarray(arr1, n1, k1)); // Kết quả mong đợi: -1

        int[] arr2 = {1, 1, 1, 1, 1, 1};
        int n2 = 6;
        int k2 = 2;
        System.out.println(maxSumSubarray(arr2, n2, k2)); // Kết quả mong đợi: 6
    }
}
