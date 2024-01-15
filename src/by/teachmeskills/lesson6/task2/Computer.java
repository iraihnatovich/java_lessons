package by.teachmeskills.lesson6.task2;

// Создать класс для описания компьютера с полями: стоимость, модель(строковый тип), RАМ и HDD
//Для полей RАМ и НDD следует создать свои собственные классы. Классы для RАМ и HDD должны иметь
// конструктор по умолчанию и конструктор со всеми параметрами
//Класс RАМ имеет поля "название" и "объем". Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
//Класс Computer должен иметь два конструктора: первый - с параметрами стоимость и модель, второй - со всеми полями.
//При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RАМ и HDD с помощью конструкторов по умолчанию.
//В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
//Тестовый сценарий для проверки:
//--- создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
//--- создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.
public class Computer {
    double pcPrice;
    String pcName;
    RamPC ram; // рам и хдд как св-ва экземпляров класса компьютер
    HddPC hdd;

    class RamPC {
        String ramName;
        int ramVolume;

        RamPC() { // для дефолтных т е 0 и null при отсут парам
        }

        RamPC(String ramName, int ramVolume) {
            this.ramName = ramName;
            this.ramVolume = ramVolume;
        }

        String getDetailRam() {
            return "RAM " + ramName + " volume = " + ramVolume;
        }

    }

    class HddPC {
        String hddName;
        int hddVolume;
        boolean isHddInternal;

        HddPC() {
        }

        HddPC(String hddName, int hddVolume, boolean isHddInternal) {
            this.hddName = hddName;
            this.hddVolume = hddVolume;
            this.isHddInternal = isHddInternal;
        }

        String getDetailHdd() {
            String hddPlace;
            if (isHddInternal) {
                hddPlace = "internal";
            } else hddPlace = "external";
            return "HDD " + hddName + " and volume = " + hddVolume + ". This HDD is " + hddPlace;
        }
    }

    Computer(double pcPrice, String pcName) { //внутренний класс имеет доступ ко всем членам окружающего его класса, но обратное неверно
        this.pcName = pcName;
        this.pcPrice = pcPrice;
        ram = new RamPC(); // используем деф конструктор рам и хдд для иниц
        hdd = new HddPC();
    }

    Computer(double pcPrice, String pcName, String ramName, int ramVolume, String hddName, int hddVolume, boolean isHddInternal) {
        this.pcName = pcName;
        this.pcPrice = pcPrice;
        ram = new RamPC(ramName, ramVolume); //используем параметр из конструктор
        hdd = new HddPC(hddName, hddVolume, isHddInternal);
    }

    String getGeneralInfo() {
        return pcName + " price = " + pcPrice;
    }
}

class DemoPC {
    public static void main(String[] args) {
        Computer pc1 = new Computer(1354.89, "Dell ABC1213");
        System.out.println(pc1.getGeneralInfo());
        System.out.println(pc1.ram.getDetailRam());
        Computer pc2 = new Computer(1530, "Mac", "testRAM",
                12222, "newHdd", 5445, false);
        System.out.println(pc2.getGeneralInfo());
        System.out.println(pc2.ram.getDetailRam());
        System.out.println(pc2.hdd.getDetailHdd());
    }
}
