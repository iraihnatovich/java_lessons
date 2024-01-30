package by.teachmeskills.lesson_11;

import java.util.Arrays;

public class MyCustomCollection <T>{
    private Object [] myArr; //final?

    public MyCustomCollection() {
    }

    public MyCustomCollection(int length) {
       this.myArr =  new Object [length];
    }


    // методы с <T>
    public boolean  haveElement(T t){ //indexOf in Arraylist ???????? equiv of  contains()
        for (int i = 0; i < myArr.length; i++) {
            if (t.equals(myArr[i])){
                return true;
            }
        }
        return false;
    }

    //ДОБАВИТЬ РАСШИРЕНИЕ!!!
    public boolean  addElement(T t){ //???????? в конец
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == null){
                myArr[i] = t;
                return true;
            }
        }
        return false;
    }
    public int getSize (){
        int countElements = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] != null){
                countElements++;
            }
        }
        return countElements;
    }
    public Object getElement (int index){ //Exceptions!!!!! if index >= myArr.length
        return myArr[index]; // 0 = first elem
    }
    public void clearAll(){
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] != null){
                myArr[i] = null;
            }
            else{ return;
            }
        }
    }

    public boolean removeElement (int index){ // ДОБАВИТЬ смещение!!!!!
        if(index<= getSize()){ // OR <= myArr.length()?????
            myArr[index] = null;
            return true;
        }
        else {
            return false;
        }

    }

    public String toString (){
        return Arrays.toString(myArr);
    }


}
class Test{
    public static void main(String[] args) {
        MyCustomCollection <Integer> intColl = new MyCustomCollection<Integer>(10);
        intColl.addElement(12);
        intColl.addElement(113);
        intColl.addElement(48);
        intColl.addElement(91);
        intColl.addElement(32);
        intColl.addElement(61);
//        System.out.println(intColl.haveElement(12));
//        System.out.println(intColl.haveElement(113));
        System.out.println(intColl);
        System.out.println(intColl.getElement(2));
        System.out.println(intColl.getSize());
        intColl.clearAll();
        System.out.println(intColl);


    }
}

