package by.teachmeskills.lesson_11;

import java.util.Arrays;

public class MyCustomCollection<T> {
    private Object[] myArr;

    public MyCustomCollection() {
    }

    public MyCustomCollection(int length) {
        this.myArr = new Object[length];
    }

    public boolean hasElement(T t) { //
        for (int i = 0; i < myArr.length; i++) {
            if (t.equals(myArr[i])) { //equals переопр при необходимости для класса
                return true;
            }
        }
        return false;
    }

    private Object[] grow(int increaseOn) { // /Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home/lib/src.zip!/java.base/java/util/ArrayList.java:231
        int newLength = myArr.length + increaseOn;
        return myArr = Arrays.copyOf(myArr, newLength);
    }


    public boolean addElement(T t) {
        if (getSize() == myArr.length) {
//            grow(10);
            grow(1); // решила увелич на 1 кажд раз
        }
        myArr[getSize()] = t;
        return true;
    }

    public int getSize() { //ПОДУМАТЬ!!!
        int countElements = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] != null) {
                countElements++;
            } else {
                return countElements;
            }
        }
        return countElements;
    }

    public Object getElement(int index) {
        try {
            Object o = myArr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Impossible to get element: " + e.getMessage();
        }
        return myArr[index]; // 0 =  1st elem, if (length >= index > size) method returns null
    }

    //    public void clearAll(){
//        for (int i = 0; i < myArr.length; i++) {
//            if (myArr[i]==null) {
//               return;
//            }
//            myArr[i] = null;
//        }
//    }
    public void clearAll() { //решила этот вариант использ
        grow(-myArr.length);
    }

    public boolean removeElement(T t) { //по элем, а не индексу - так в задании
        try {
            for (int i = 0; i < myArr.length; i++) {
                if (myArr[i].equals(t)) { //  первое совпадение перемещаем в конец и отрезаем
                    while (i < myArr.length - 1) {
                        myArr[i] = myArr[i + 1];
                        i++;
                    }
                    grow(-1);
                    return true;
                }
            }
        } catch (NullPointerException e) { // если нет совпадений, а остальные в массиве null
            // возможно при size < length
//             System.out.println("No matches found");
        }
        System.out.println("No matches found"); // сообщ о несовпадинии должно быть и без NullPointerException
        return false;
    }

    public String toString() {
        return Arrays.toString(myArr);
    }


}

class Test {
    public static void main(String[] args) {
        MyCustomCollection<Integer> intColl = new MyCustomCollection<Integer>(4);
        MyCustomCollection<Integer> intColl1 = new MyCustomCollection<Integer>(3);
        intColl.addElement(12);
        intColl.addElement(113);
//        intColl.addElement(6);
//        intColl.addElement(933);
//        intColl.addElement(156);
//        intColl.addElement(5551);
//        intColl.addElement(72424);
        System.out.println(intColl);
        System.out.println(intColl.removeElement(1));
//        System.out.println(intColl.hasElement(113));

    }
}

