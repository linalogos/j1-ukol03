package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty==true) {
            if ((velikost + pevnyDisk.getVyuziteMisto()) > pevnyDisk.getKapacita()) {
                if ((velikost + druhyDisk.getVyuziteMisto()) > druhyDisk.getKapacita()) {
                    System.err.println("Dalsi soubor se nevejde na zadny z disku");
                } else {
                    druhyDisk.setVyuziteMisto(velikost + druhyDisk.getVyuziteMisto());
                    System.out.println("Novy soubor je nahran na 2. disk, aktualni kapacita: " + druhyDisk.getVyuziteMisto());
                }
            } else {
                    pevnyDisk.setVyuziteMisto(velikost + pevnyDisk.getVyuziteMisto());
                    System.out.println("Novy soubor je nahran na 1. disk, aktualni kapacita: " + pevnyDisk.getVyuziteMisto());
                }
            }
        }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty == true) {
            if (velikost > pevnyDisk.getVyuziteMisto() && velikost > druhyDisk.getVyuziteMisto()) {
                System.err.println("Pozor! Nepovolena velikost souboru, neda se smazat");
            } else if (velikost <= druhyDisk.getVyuziteMisto()) {
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto()-velikost);
                System.out.println("Soubor je vymazan z 2. disku, aktualni vyuzite misto: " + druhyDisk.getVyuziteMisto());
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()-velikost);
                System.out.println("Soubor je vymazan z 1. disku, aktualni vyuzite misto: " + pevnyDisk.getVyuziteMisto());
            }
        }
    }


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            jeZapnuty = false;
            System.err.println("Pocitac se neda zapnout: nejsou veskere nutne soucasti");
        } else if (jeZapnuty == true) {
            System.err.println("Pozor! Pocitac je jiz zapnuty");
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

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac: cpu: " + cpu + ", ram: " + ram + ", pevny disk: " + pevnyDisk;
    }
}
