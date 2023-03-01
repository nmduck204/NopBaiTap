public class Cau4 {public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int nhan = 1;
    for (int i = 0; i < 10; i++) {
        if (array[i]==2||array[i]==4||array[i]==9) {
            nhan = nhan * array[i];
        }
    }

    System.out.println("Tich so 2 4 9: "+nhan);
}
}
