import java.util.ArrayList;
import java.util.HashSet;

public class Destination_City {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> paths = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        city.add("London");
        city.add("New York");
        paths.add(city2);
        city2.add("New York");
        city2.add("Lima");
        city3.add("Lima");
        city3.add("Sao Paulo");
        paths.add(city3);
        paths.add(city);
        System.out.println(paths);
        ArrayList<String> str2 = new ArrayList<>();
        str2.add(paths.get(0).get(0));
        str2.add(paths.get(0).get(1));
        paths.remove(0);
        while (paths.size() != 0) {
            int j = 0;
            while (j < paths.size()) {
                if (str2.contains(paths.get(j).get(0))) {
                    str2.add(paths.get(j).get(1));
                    paths.remove(j);
                } else if (str2.contains(paths.get(j).get(1))) {
                    int index = str2.indexOf(paths.get(j).get(1));
                    str2.add(index, paths.get(j).get(0));
                    paths.remove(j);
                }
                j++;
            }
        }

        System.out.println(str2.get(str2.size() - 1));
    }
}
