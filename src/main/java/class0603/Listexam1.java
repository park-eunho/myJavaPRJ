package class0603;

import java.util.ArrayList;
import java.util.List;

public class Listexam1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("3세대 반복문");
        list.forEach(name -> System.out.println("name : " +name));
    }
}
