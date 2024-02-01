package by.teachmeskills.lesson_11;

import java.util.Arrays;

public class MyCustomCollection<T> {
    private Object[] myArr;
    private int size = 0;

    public MyCustomCollection() {
        this.myArr = new Object[0]; //0 по умол
    }

    public MyCustomCollection(int length) {
        this.myArr = new Object[length];
    }

    public boolean hasElement(T t) { // работает с null при наличии/отсут в массиве
        for (Object o : myArr) {
            if (t != null) { //проверка null чтобы не отлавливать ошибку
                if (t.equals(o)) {
                    return true;
                }
            } else if (o == null) {
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
            grow(1);
        }
        myArr[getSize()] = t;
        size++;
        return true;
    }

    public int getSize() { //инкр/декр в addElement() / removeElement() соответственно
        return size;
    }

    public T getElement(int index) { // теперь возвр T а не Object
        try {
            return (T) myArr[index]; // 0 =  1st elem, if (length >= index > size) method returns null
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new OutOfBoundException();
//            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public void clearAll() {
        grow(-myArr.length);
        size = 0;
    }

    public boolean removeElement(T t) { //по элем, а не индексу - так в задании
        for (int i = 0; i < getSize(); i++) { // добавлена проверка знач null для t и элемента массива
            if (t != null && myArr[i] != null && myArr[i].equals(t) || (t == null && myArr[i] == null)) { //  первое совпадение перемещаем в конец и отрезаем
                while (i < getSize() - 1) {
                    myArr[i] = myArr[i + 1];
                    i++;
                }
                grow(-1);
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean removeElement(int index) { // дополн сделала удаление по индексу
        if (index < getSize() - 1 && index >= 0) {
            while (index < getSize() - 1) {
                myArr[index] = myArr[index + 1];
                index++;
            }
            grow(-1);
            size--;
            return true;
        }
        return false;
    }


    public String toString() {
        return Arrays.toString(myArr);
    }


}

