import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] sa = new String[5];


        ArrayList<String> sal = new ArrayList<>();
        sal.add("microwave");
        sal.add("table");
        sal.set(1,"chair");
        System.out.println(sal.get(1));
        System.out.println(sal.contains("table"));
        System.out.println(sal.size());

    }
}
