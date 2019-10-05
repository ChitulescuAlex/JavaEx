package Java;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(8);
        System.out.println(Numar(list));
    }
    public static StringBuilder Numar (List<Integer> list) {
        StringBuilder Nr = new StringBuilder();
        for (Integer str: list) {
            if (str % 2==0) {
                Nr.append("e" + str + " " );
            } else {
                Nr.append("o" + str + " ");
            }
        }
        return Nr;
    }
}
   /* Write a method that returns a comma separated string
        based on a given list of integers.
        Each element should be preceded by the letter 'e' if
        the number is even, and preceded by the letter 'o' if
        the number is odd.
        For example, if the input list is (3,44,5,10),
        the output should be 'o3 e44 o5 e10'.*/
