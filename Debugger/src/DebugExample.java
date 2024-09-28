import java.util.ArrayList;
import java.util.List;

public class DebugExample {
    public static void main(String[] args) {
        List sampleNames = createNames();
        printNames(sampleNames);
        addName(sampleNames, "Will Smith");
        printNames(sampleNames);
    }
    private static List createNames() {
        ArrayList listNames = new ArrayList<String>();
        listNames.add("Martin Yanev");
        listNames.add("Martin Yanev");
        return listNames;
    }

    private static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static void addName(List<String> l, String name) {
        l.add(name);
    }

    private static void removeNames(List l, String name) {
        int position = l.indexOf(name);
        if (position == -1) {

        }
        else {
            l.remove(position);
            printNames(l);
        }
    }
}
