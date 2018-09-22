import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DishMain {

    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
            new Dish("Pizza", false, 1500),
            new Dish("Hamburger", false, 700),
            new Dish("Pasta Neapolitana", true, 280),
            new Dish("Hummus", true, 200),
            new Dish("Pierogi Ruskie", true, 450),
            new Dish("Schabowy", false, 695),
            new Dish("Jajecznica", false, 350),
            new Dish("Jablko", true, 50)
        );

//        for (Dish d : sortDishes(dishes)) {
//            System.out.println(d);
//        }

        /*dishes.stream().peek(System.out::println).collect(Collectors.toList());*/

//        List<String> names = Arrays.asList("Ania", "Kasia", "Gosia");
//        System.out.println(names.stream().reduce("", (o1, o2) -> o1 + o2 + ";"));

//        List<Integer> ints = Arrays.asList(-30, -15, -2, -45, -9);
//        System.out.println(ints.stream()
//            .reduce((o1, o2) -> o1 > o2 ? o1 : o2));

//        System.out.println(getNames(dishes));

        //System.out.println(getCalories(dishes));

//        List<Student> students = Arrays.asList(
//            new Student("Bartek", Arrays.asList(2, 3, 3, 2, 1)),
//            new Student("Monika", Arrays.asList(5, 5, 6, 4, 5, 5)));
//
//        System.out.println(students.stream()
//            .map(Student::getGrades)
//            .flatMap(List::stream).collect(toList()));

//        getVegetarianDishes(dishes).forEach(System.out::println);

//        getNMostCaloric(dishes, 4).forEach(System.out::println);
        getDishesWithCaloriesMoreThan(dishes, 1000).forEach(System.out::println);
    }

    public static List<Dish> getDishesWithCaloriesMoreThan(List<Dish> dishes, int kcal) {
        return dishes.stream()
            .filter(d -> d.getCalories() >= kcal)
            .sorted((d1, d2) -> d2.getCalories() - d1.getCalories())
            .collect(Collectors.toList());
    }

    public static List<Dish> getNMostCaloric(List<Dish> dishes, int n) {
        return dishes.stream()
            .sorted((d1, d2) -> d2.getCalories() - d1.getCalories())
            .limit(n)
            .collect(Collectors.toList());
    }

    public static List<Dish> getVegetarianDishes(List<Dish> dishes) {
        return dishes.stream()
            .filter(d -> d.isVegetarian())
            .collect(Collectors.toList());
    }

    public static int getCalories(List<Dish> dishes) {
        //1. reduce()
//        return dishes.stream()
//            .map(Dish::getCalories)
//            .reduce(0, (a, b) -> a + b);


        //2. mapToInt() -> IntStream -> sum()
        return dishes.stream()
            .mapToInt(Dish::getCalories)
            .sum();
    }

    public static List<String> getNames(List<Dish> dishes) {
        return dishes.stream()
            //.map(d -> d.getName())
            .map(Dish::getName)
            .collect(toList());
    }

    public static List<Dish> sortDishes(List<Dish> dishes) {
        return dishes.stream()
            .sorted((o1, o2) -> o1.getCalories() - o2.getCalories())
            .collect(toList());
    }
}

class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
