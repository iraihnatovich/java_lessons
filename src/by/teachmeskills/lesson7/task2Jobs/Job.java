package by.teachmeskills.lesson7;

 class Job implements Print {
    String jobName;
    Job (String jobName){
        this.jobName = jobName;
    }
     public void printJob(){ //interface method
         System.out.println(jobName);
     }
}
class Ceo extends Job{
    Ceo (String jobName){
        super(jobName);
    }
    public String occupation (){ //добавила, чтобы классы отличались
        return "management";
    }

}

class Worker extends Job{
    Worker (String jobName){
        super(jobName);
    }
    public String occupation (){
        return "task exe";
    }
}

class Accountant extends Job{
    Accountant (String jobName){
        super(jobName);
    }
    public String occupation (){
        return "budgeting";
    }
}

class TestJob {
    public static void main(String[] args) {
        Job chief = new Ceo("ceo name");
        chief.printJob();
        System.out.println(chief.occupation());
        Worker secretary = new Worker("office worker");
        secretary.printJob();
        Job undefJob = new Job("any job on earth");
        undefJob.printJob();
        System.out.println(undefJob.occupation());
    }
}

