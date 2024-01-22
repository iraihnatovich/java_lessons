package by.teachmeskills.lesson7;

public interface Print {
      void printJob();

      default String occupation() {
            return "no occupation needed"; // сделано default, чтобы попробовать не указыв в родителе Job
      }
}