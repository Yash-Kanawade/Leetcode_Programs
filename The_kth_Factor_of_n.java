public class The_kth_Factor_of_n {
    public int kthFactor(int n, int k) {
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        The_kth_Factor_of_n obj = new The_kth_Factor_of_n();

        System.out.println(obj.kthFactor(7, 2));
    }
}
