package dientichchuvihinhchunhat;

import java.util.Scanner;

public class BaiTapHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập chiều dài hình chữ nhật: ");
        int chieudai = new Scanner(System.in).nextInt();
        System.out.println(" Nhập rộng dài hình chữ nhật: ");
        int chieurong = new Scanner(System.in).nextInt();
        int dientich = chieudai * chieurong;
        int chuvi = (chieudai + chieurong) / 2;
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
        System.out.println(" Chu vi hình chữ nhật là " + chuvi);
    }
}
