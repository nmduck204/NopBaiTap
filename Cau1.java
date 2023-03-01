import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        int a [];
        int number = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("độ dài mảng" + number);
        a = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhập giá trị phần tử");
            a[i]=sc.nextInt();
        }
    }
}
