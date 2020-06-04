package Task_2;

public class Task_2 {
    int lesson = 45;
    int pause1 = 5;
    int pause2 = 15;

    int sum1 = lesson + pause1;
    int sum2 = lesson + pause2;

    int startHour = 9;
    int minuteInHour = 60;

    public void timeLessonEnding(int numberOfLesson) {

        int allTimeInMinutes = (numberOfLesson % 2) * (((numberOfLesson / 2 + 1) * sum1) + (numberOfLesson / 2 * sum2)) + (1 - numberOfLesson % 2) * ((numberOfLesson / 2 * sum1) + (numberOfLesson / 2 * sum2));

        int endHour = startHour + allTimeInMinutes / minuteInHour;

        int endMin = (numberOfLesson % 2) * ((allTimeInMinutes % minuteInHour) - pause1) + (1 - (numberOfLesson % 2)) * ((allTimeInMinutes % minuteInHour) - pause2);

        System.out.println("Lesson will end at " + endHour + " : " + endMin);
        // В решении задачи по-умолчанию условие, что нечетный урок -> true(1), а четный урок -> false(0)
    }
}
