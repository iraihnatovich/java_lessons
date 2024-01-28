package by.teachmeskills.lesson8.task2;

class Patient {
    final private int planCode;

    Patient(int planCode) {
        this.planCode = planCode;
    }

    void selectDoctor() {
        TreatmentPlan selectedDoctor = TreatmentPlan.selectDoctor(planCode);
        selectedDoctor.cure();
    }

}
