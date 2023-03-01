public class Cau3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] == 5) {
                continue;
            }
            sum = sum + array[i];

        }
        System.out.print("Tong vi tri 1 3 7 9 : " + sum);
    }
}
