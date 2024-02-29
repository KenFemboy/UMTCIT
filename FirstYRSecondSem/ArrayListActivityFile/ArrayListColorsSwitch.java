
import java.util.ArrayList;

public class ArrayListColorsSwitch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Green");

        colors.set(1, "Yellow");

        System.out.println(colors);

    }
}
