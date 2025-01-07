import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Optimal_Partition_of_String {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int partition = 1;
        for (char i : s.toCharArray()) {
            if (set.contains(i)) {
                partition++;
                set.clear();
            }
            set.add(i);
        }
        return partition;
    }

    public static void main(String[] args) {
        String s = "ababca";
        Optimal_Partition_of_String obj = new Optimal_Partition_of_String();
        System.out.println(obj.partitionString(s));
    }
}