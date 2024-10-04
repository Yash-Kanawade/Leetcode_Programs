public class Minimum_Changes_To_Make_Alternating_Binary_String {
    public static void main(String[] args) {
        String s = "01001";
        int operations_0 = 0;
        int operations_1 = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '1' && s.charAt(i + 1) != '0') {
                operations_1 = operations_1 + 2;
                i++;
            } else if (s.charAt(i) != '1' || s.charAt(i + 1) != '0') {
                operations_1++;
                i++;
            } else
                i++;
        }
        if (s.length() % 2 != 0)
            if (s.charAt(s.length() - 1) != '1')
                operations_1++;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '0' && s.charAt(i + 1) != '1') {
                operations_0 = operations_0 + 2;
                i++;
            } else if (s.charAt(i) != '0' || s.charAt(i + 1) != '1') {
                operations_0++;
                i++;
            } else
                i++;
        }
        if (s.length() % 2 != 0)
            if (s.charAt(s.length() - 1) != '0')
                operations_0++;
        if (operations_0 < operations_1)
            System.out.println(operations_0);
        else
            System.out.println(operations_1);

    }
}
