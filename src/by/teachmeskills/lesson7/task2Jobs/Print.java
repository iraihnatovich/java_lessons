package by.teachmeskills.lesson7.task2Jobs;

public interface Print {
    void printJob(); //абстрактный метод в интерфейсе
    //Методы интерфейсов, которые не объявлены статическими (оператор static)
    // или методами по умолчанию (оператор default) =  абстрактные.

    default String occupation() {
        return "no occupation needed"; // сделано default, чтобы попробовать не указыв в родителе Job
    }
}