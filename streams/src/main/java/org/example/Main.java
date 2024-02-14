package org.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
//        List<String> names = users.stream()
//                .filter(user -> !user.name().endsWith("a"))
//                .sorted(Comparator.comparing(User::age))
//                //.map(User::name)
//                .map(user -> user.name() + ", " + user.age())
//                .toList();
//
//        names.forEach(System.out::println);
     //remove duplicate
//        List<String> skills = users.stream()
//                .map(User::skills)
//                .flatMap(Collection::stream)
//                .distinct()
//                //.sorted()
//                .sorted(Comparator.reverseOrder())
//                .toList();
//        skills.forEach(System.out::println);

        //write to list, set, map
//        Set<String> skills = users.stream()
//                .map(User::skills)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toSet());
//        skills.forEach(System.out::println);

        Country country = new Country("Poland", "Warsaw");
        Country country1 = new Country("Germany", "Berlin");
        Country country2 = new Country("France", "Paris");
        Country country3 = new Country("Poland", "Krakow");


        List<Country> countries = List.of(country, country1, country2,country3);

        Map<String, String> countriesAndCapitals = countries.stream()
                .collect(Collectors.toMap(Country::country,Country::capital,(oldValue,newValue)->newValue));
                //.collect(Collectors.toMap(Country::country, Country::capital));


        System.out.println(countriesAndCapitals.get("Poland"));
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