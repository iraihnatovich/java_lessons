package by.teachmeskills.lesson8.task2;

public enum TreatmentPlan {
    SURGEON(1) {
        void cure() {
            System.out.println("Patient's doctor is surgeon -- need surgery");
        }
    },
    DENTIST(2) {
        void cure() {
            System.out.println("Patient's doctor is dentist -- need tooth treatment");
        }
    },
    THERAPIST(3) {
        void cure() {
            System.out.println("Please, do healthcheck (therapist)");
        }

    };

    private final int code;

    TreatmentPlan(int code) {
        this.code = code;

    }

    abstract void cure();

    int getCode() {
        return code;

    }

    static TreatmentPlan selectDoctor(int treatmentCode) {
        for (TreatmentPlan doctor : TreatmentPlan.values()) {
            if (doctor.getCode() == treatmentCode) {
                return doctor;
            }
        }

        return TreatmentPlan.THERAPIST;
    }

}
