package ua.opnu;

public class Student {

    String name;
    int year;
    String[] courses;
    int courseCount = 0;

    // Конструктор з трьома параметрами
    public Student(String name, int year, String[] courses) {
        this.name = name;
        this.year = year;
        this.courses = courses;  // Ініціалізуємо масив курсів
    }

    // Метод для додавання курсу
    void addCourse(String courseName) {
        if (courseCount < 10 && courseName != null && !courseName.isEmpty()) {
            courses[courseCount] = courseName;
            courseCount++;  // Збільшуємо лічильник курсів
        }
    }

    // Метод для видалення всіх курсів
    void dropAll() {
        for (int i = 0; i < courseCount; i++) {
            courses[i] = null;  // Очищаємо курс
        }
        courseCount = 0;  // Скидаємо лічильник курсів
    }

    // Метод для отримання кількості курсів
    int getCourseCount() {
        return courseCount;  // Повертаємо кількість курсів
    }

    // Метод для отримання імені студента
    String getName() {
        return this.name;  // Повертаємо ім'я студента
    }

    // Метод для отримання року навчання
    int getYear() {
        return this.year;  // Повертаємо рік навчання
    }

    // Метод для обчислення вартості навчання
    int getTuition() {
        return year * 20000;  // Вартість навчання залежить від року
    }
}
