package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            jeZapnuty = false;
            System.out.println("Pocitac se neda zapnout: nejsou veskere nutne soucasti");
        } else if (jeZapnuty == true) {
            System.out.println("Pozor! Pocitac je jiz zapnuty");
        } else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul");
        }
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul");
        }
    }
    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac: cpu: " + cpu + ", ram: " + ram + ", pevny disk: " + pevnyDisk;
    }
}
