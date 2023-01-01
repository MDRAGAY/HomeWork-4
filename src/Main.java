public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();




    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int manYearsOld = 30;
        if (manYearsOld >=2 && manYearsOld <=6){
            System.out.println("Если возраст человека равен " + manYearsOld + " годам, то ему нужно ходить в садик");
        }
        else if (manYearsOld >=7 && manYearsOld <18) {
            System.out.println("Если возраст человека равен " + manYearsOld + " годам, то ему нужно ходить в школу");
        }
        else if (manYearsOld >=18 && manYearsOld <24) {
            System.out.println("Если возраст человека равен " + manYearsOld + " годам, то ему нужно ходить в университет");
        }
        else if (manYearsOld >=24) {
            System.out.println("Если возраст человека равен " + manYearsOld + " годам, то ему нужно работать");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 7;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " годам, то он не может кататься на аттракционе");
        }
        boolean youngMan = childAge >= 5 && childAge < 14;
        if (youngMan) {
            System.out.println("Если возраст ребенка равен " + childAge + " годам, то он может кататься на аттракционе в сопровождении взрослого");
        }
        int adult = 0;
        if (youngMan && adult == 0) {
            System.out.println("Если взрослого нет, то кататься нельзя!");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " годам, то он может кататься на аттракционе без сопровождения взрослого");
        }
    }

}