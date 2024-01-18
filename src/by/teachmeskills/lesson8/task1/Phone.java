package by.teachmeskills.lesson8.task1;

class Phone {
    private int number;
    private String model;
    private double weight;

    Phone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }
    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone() {
    }

    String receiveCall (String contactName){
        return contactName+" is calling";
    }
    void receiveCall (String contactName, int contactNumber){ //выводит на консоль
        System.out.println(contactNumber+" "+contactName+" is calling");
    }
    int getNumber (){
        return number;
    }
//    double getWeight (){
//        return weight;
//    }
//    String getModel (){
//        return model;
//    }
    void getInfo(){
        System.out.println(getNumber ()+" "+weight+" "+model);
    }
    void updateNumber(int number){ // для себя попробовать
        this.number = number;
    }

    //В 0 задании: аргументы переменной длины ... - это массив номеров телефона и сообщение (массовая рассылка)
    void sendMessage (Phone [] phoneBook, String text){
        for (Phone phone: phoneBook) {
            System.out.println(text+" sent to: "+phone.getNumber());
        }

    }

}
