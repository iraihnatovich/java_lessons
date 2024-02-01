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

//    public boolean hasElement(T t) {
//        for (int i = 0; i < myArr.length; i++) {
//        try {
//            if (t.equals(myArr[i])) {
//                return true;
//            }
//        }
//        catch (NullPointerException e){
//                if (myArr[i] == t){
//                    return true;
//                }
//            }
//
//        }
//        return false;
//    }
public boolean hasElement(T t) {
    if (t != null) {
        for (Object o:  myArr) {
            if (t.equals(o)) {
                return true;
            }
        }
    }
    else {
        for (Object o:  myArr) {
            if (o == null) {
                return true;
            }
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

    public int getSize() { //инкр/декр в addElement() / removeElement() соответственно
        return size;
    }

    public T getElement(int index) { // теперь возвр T а не Object...
        try {
            return (T) myArr[index]; // 0 =  1st elem, if (length >= index > size) method returns null
        } catch (ArrayIndexOutOfBoundsException e) {
            return null; // возврат null при отсут/отриц index?????
        }

    }

    public void clearAll() {
        grow(-myArr.length);
    }

    public boolean removeElement(T t) { //по элем, а не индексу - так в задании
        for (int i = 0; i < myArr.length; i++) {
        try {
                if (myArr[i].equals(t)) { //  первое совпадение перемещаем в конец и отрезаем
                    while (i < myArr.length - 1) {
                        myArr[i] = myArr[i + 1];
                        i++;
                    }
                    grow(-1);
                    size--;
                    return true;
                }}
                catch (NullPointerException e) { // возможно при size < length (есть null)
                    if (myArr[i] == t){
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
//    public boolean removeElement(T t) { //по элем, а не индексу - так в задании
//            for (int i = 0; i < myArr.length; i++) {
//                if (myArr[i].equals(t) || (myArr[i] == t && t == null)) { //  первое совпадение перемещаем в конец и отрезаем
//                    while (i < myArr.length - 1) {
//                        myArr[i] = myArr[i + 1];
//                        i++;
//                    }
//                    grow(-1);
//                    size--;
//                    return true;
//                }
//            }
//        return false;
//    }

    public String toString() {
        return Arrays.toString(myArr);
    }


}

