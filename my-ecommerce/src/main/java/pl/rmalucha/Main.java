package pl.rmalucha;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rafal", "Anton", "Bartek", "Marcinek", "Kuba", "Ania", "Ewa");

        Greeter greeter = new Greeter();
        greeter.greet("Rafal");

        List<String> ladies = new ArrayList<String>();
        for (String name : names) {
            if (name.endsWith("a") && name != "Kuba") {
                ladies.add(name);
            }
        }

        //for (String ladyName : ladies) {
            //greeter.greet(ladyName);
        //}

        names.stream()
                .filter(name -> name.endsWith("a"))
                .filter(name -> name.startsWith("K"))
                .map(String::toUpperCase)
                .forEach(greeter::greet);
    }
}
