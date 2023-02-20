import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Model>();
        Model a = new Model("duy binh", 19, "hue", "0982038250");
        Model b = new Model("van manh", 17, "hue", "03298398");
        list.add(a);
        list.add(b);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
