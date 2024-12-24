import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i] = n%10;
            n=n/10;
        }
        for(int i =0;i<1;i++){
            if(a[2]==0){
                System.out.print(" ");
            }
            else if(a[2]==1){
                System.out.print("một trăm ");
            }
            else if(a[2]==2){
                System.out.print("hai trăm ");
            }
            else if(a[2]==3){
                System.out.print("ba trăm ");
            }
            else if(a[2]==4){
                System.out.print("bốn trăm ");
            }
            else if(a[2]==5){
                System.out.print("năm trăm ");
            }
            else if(a[2]==6){
                System.out.print("sáu trăm ");
            }
            else if(a[2]==7){
                System.out.print("bảy trăm ");
            }
            else if(a[2]==8){
                System.out.print("tám trăm ");
            }
            else if(a[2]==9){
                System.out.print("chín trăm ");
            }
        }
        for(int i =0;i<1;i++){
            if(a[1]==0){
                System.out.println("linh ");;
            }
            else if(a[1]==1){
                System.out.print("mười ");
            }
            else if(a[1]==2){                System.out.print("hai mươi ");
            }
            else if(a[1]==3){
                System.out.print("ba mươi ");
            }
            else if(a[1]==4){
                System.out.print("bốn mươi ");
            }
            else if(a[1]==5){
                System.out.print("năm mươi ");
            }
            else if(a[1]==6){
                System.out.print("sáu mươi ");
            }
            else if(a[1]==7){
                System.out.print("bảy mươi ");
            }
            else if(a[1]==8){
                System.out.print("tám mươi ");
            }
            else if(a[1]==9){
                System.out.print("chín mươi ");
            }
        }
        for(int i =0;i<1;i++) {
            if (a[0] == 0) {
                System.out.println(" ");
                ;
            } else if (a[0] == 1) {
                System.out.print("mười");
            } else if (a[0] == 2) {
                System.out.print("hai ");
            } else if (a[0] == 3) {
                System.out.print("ba ");
            } else if (a[0] == 4) {
                System.out.print("bốn ");
            } else if (a[0] == 5) {
                System.out.print("năm ");
            } else if (a[0] == 6) {
                System.out.print("sáu ");
            } else if (a[0] == 7) {
                System.out.print("bảy ");
            } else if (a[0] == 8) {
                System.out.print("tám ");
            } else if (a[0] == 9) {
                System.out.print("chín");
            }
        }
    }
}
