package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

//        users.forEach(System.out::println);
//        users.forEach(user -> System.out.println(user.name()));

//        List<User> malesSortedByAge = users.stream()
//                .filter(user -> !user.name().endsWith("a"))
//                .sorted(Comparator.comparing(User::age))
//                .toList()
//        System.out.println(malesSortedByAge.size());
//        malesSortedByAge.forEach(System.out::println);

        //.takeWhile(user-> user.age() < 35)
                //.dropWhile(user -> user.age() < 35)
                //.forEach(user -> System.out.println(user.name() + ", " + user.age()));
        //mapping
        List<String> names = users.stream()
                .filter(user -> !user.name().endsWith("a"))
                .sorted(Comparator.comparing(User::age))
                //.map(User::name)
                .map(user -> user.name() + ", " + user.age())
                .toList();

        names.forEach(System.out::println);

    }

    private static List<User> prepareData() {
        List<User> users = new ArrayList<>();
        users.add(new User("Kamil",35,List.of("Java","Python","JavaScript"),true));
        users.add(new User("Jakub",32,List.of("Java","Python","Bash","SQL"),true));
        users.add(new User("Dominik",20,List.of("Java","Go","Python"),false));
        users.add(new User("Rafał",40,List.of("JavaScript","C","C++"),true));
        users.add(new User("Paulina",31,List.of("Python","JavaScript","Rust"),true));
        users.add(new User("Kasia",30,List.of("PHP","SQL"),false));
        users.add(new User("Asia",25,List.of("Java","JavaScript","PHP","C","C++"),true));

        return users;
    }
}