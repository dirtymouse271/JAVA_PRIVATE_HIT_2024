import java.util.Scanner;

public class Bai1 {
    public static int search(int[] nums, int k){
        int left = 0;
        int right = nums.length -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid] == k){
                return mid;
            }
            else if(nums[mid]<k){
                left=mid+1;
            }
            else if(nums[mid]>k){
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums, k));
        sc.close();
    }
}
