package ua.opnu;

public class Main {
    public static void main(String[] args) {

        // Створюємо масив предметів для Данііла
        String[] subjects = new String[3];
        subjects[0] = "ООП";
        subjects[1] = "Теорія алгоритмів";
        subjects[2] = "Засоби ШІ";

        // Створюємо об'єкт студента
        Student daniil = new Student("Данііл Іванов", 2, subjects);

        // Додаємо предмети (хоча вони вже є в масиві, це може бути корисно для майбутнього розширення)
        daniil.addCourse("ООП");
        daniil.addCourse("Теорія алгоритмів");
        daniil.addCourse("Засоби ШІ");

        // Виводимо інформацію про студента
        System.out.println(daniil.getName() + ": кількість вивчаємих дисциплін - " + daniil.getCourseCount());
        System.out.println(daniil.getName() + ": рік навчання - " + daniil.getYear());
        System.out.println(daniil.getName() + ": заплатив за навчання - " + daniil.getTuition());
    }
}
