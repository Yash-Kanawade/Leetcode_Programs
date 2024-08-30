import java.util.Arrays;

public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "www";
        String t = "b";
        char[] b = s.toCharArray(), a = t.toCharArray();
        int j = 0;
        if (a.length == 0 && b.length == 0)
            System.out.println(true);
        else if (a.length == 0)
            System.out.println(false);
        else if (b.length == 0)
            System.out.println(true);
        if (a.length == 0 || b.length == 0)
            System.out.println(false);
        for (int i = 0; i < a.length; i++)
            if (b[j] == a[i]) {
                j++;
                if (j == b.length)
                    break;
            }
        if (j == b.length)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
