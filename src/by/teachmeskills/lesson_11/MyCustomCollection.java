package by.teachmeskills.lesson_11;

import java.util.Arrays;

public class MyCustomCollection<T> {
    private Object[] myArr;
    private int size = 0; //или в констр?????

    public MyCustomCollection() {
        this.myArr = new Object[0]; //0 по умол
    }

    public MyCustomCollection(int length) {
        this.myArr = new Object[length];
    }

    public boolean hasElement(T t) {
        for (int i = 0; i < myArr.length; i++) {
            if (t.equals(myArr[i])) {
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
            grow(1); // решила увеличивать на 1
        }
        myArr[getSize()] = t;
        size++;
        return true;
    }

    public int getSize() { //исправлено - расчет в addElement() и removeElement()
//        if (myArr.length == 0 || myArr[myArr.length - 1] != null) { //так как null не может быть между двумя не-null объектами
//            return size=myArr.length;
//        } else {
//            int index = 0;
//            while (myArr[index] != null && index < myArr.length) {
//                index++;
//            }
//            return index;
//        }
        return size;
    }

    public T getElement(int index) { // теперь возвр T а не Object...
        try {
            return (T) myArr[index]; // 0 =  1st elem, if (length >= index > size) method returns null
        } catch (ArrayIndexOutOfBoundsException e) {
            return null; // возврат null при отсут/отриц index
//            (T) ("Impossible to get element: " + e.getMessage());
        }

    }

    public void clearAll() {
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
                    size--;
                    return true;
                }
            }
        } catch (NullPointerException e) { // возможно при size < length (есть null)
            for (int i = 0; i < myArr.length; i++) {
                if (myArr[i] == null){
                    while (i < myArr.length - 1) {
                        myArr[i] = myArr[i + 1];
                        i++;
                    }
                    grow(-1);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return Arrays.toString(myArr);
    }


}

