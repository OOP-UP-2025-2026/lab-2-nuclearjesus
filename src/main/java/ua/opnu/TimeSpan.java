package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;

    // Конструктор для ініціалізації об'єкта TimeSpan
    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    // Геттер для годин
    int getHours() {
        return hours;
    }

    // Геттер для хвилин
    int getMinutes() {
        return minutes;
    }

    // Метод для додавання годин і хвилин до поточного TimeSpan
    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            return;
        }
        int totalMinutes = getTotalMinutes() + (hours * 60 + minutes);
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    // Метод для додавання іншого TimeSpan
    void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    // Перетворення в години (як число з плаваючою точкою)
    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    // Перетворення в загальні хвилини
    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    // Метод для віднімання одного TimeSpan від іншого
    void subtract(TimeSpan span) {
        int totalCurrent = getTotalMinutes();
        int totalOther = span.getTotalMinutes();

        if (totalOther > totalCurrent) {
            return;
        }

        int result = totalCurrent - totalOther;
        this.hours = result / 60;
        this.minutes = result % 60;
    }

    // Метод для масштабування часу
    void scale(int factor) {
        if (factor <= 0) {
            return;
        }
        int total = getTotalMinutes() * factor;
        this.hours = total / 60;
        this.minutes = total % 60;
    }
}
