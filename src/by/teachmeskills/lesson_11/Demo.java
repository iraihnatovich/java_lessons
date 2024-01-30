package by.teachmeskills.lesson_11;


public class Demo {
    public static void main(String[] args) {
        MyCustomCollection<Integer> intColl = new MyCustomCollection<Integer>(0);
//        intColl.addElement(12);
//        intColl.addElement(113);
//        intColl.addElement(933);
//        System.out.println(intColl);
//        System.out.println(intColl.getSize());
//        intColl.addElement(156);
//        System.out.println(intColl.getSize());
//        System.out.println(intColl.removeElement(12));
//        System.out.println(intColl.hasElement(113));
//        System.out.println(intColl.hasElement(12));
//        System.out.println(intColl);
        MyCustomCollection<DocumentDummy> documCollection = new MyCustomCollection<DocumentDummy>(2);
        DocumentDummy test1 = new DocumentDummy(4443, "dummy0");
        documCollection.addElement(new DocumentDummy(4443, "dummy0"));
        System.out.println(documCollection.getSize());
        documCollection.addElement(new DocumentDummy(76437, "dummy1"));
        documCollection.addElement(new DocumentDummy(263746, "dummy2"));
        System.out.println(documCollection.getElement(1));
        System.out.println(documCollection.hasElement(test1)); //для этого класса сравниваю по numDoc
        System.out.println(documCollection.getSize());
        System.out.println(documCollection.removeElement(new DocumentDummy(76437, "dummy232")));
        System.out.println(documCollection);
        documCollection.clearAll();
        System.out.println(documCollection);
        System.out.println(documCollection.getSize());

    }
}
