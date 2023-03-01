import java.util.Scanner;
public class Cau2 {
    public static void main(String[] args) {
        int a[];
        int number = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Độ dài của mảng"+number+"phan tu");
        a= new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap gia tri phan tu");
            a [i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 1; i < number; i+=2) {
            sum+=a[i];
        }
            System.out.println(sum);
        }
    }

