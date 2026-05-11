import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Yash");
        al.add("Kumar");
        al.add("Ram");
        al.add("David");
        al.add("Tom");

        for (String n : al) {
            System.out.println(n);
        }

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Yash", 50);
        students.put("Ram", 70);
        students.put("Kumar", 68);

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }

        HashSet<String> names = new HashSet<>();

        names.add("Yash");
        names.add("Kumar");
        names.add("Yash");
        names.add("Kumar");
        names.add("Ram");

        for (String person : names) {
            System.out.println(person);
        }
    }
}