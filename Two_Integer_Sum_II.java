import java.util.Arrays;

public class Two_Integer_Sum_II {
    public static void main(String[] args) {
        int[] numbers = { -10, -8, -2, 1, 2, 5, 6 };
        int target = 0;
        int result[] = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    System.out.println(Arrays.toString(result));
                    System.exit(0);
                } else if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
        }
    }
}
