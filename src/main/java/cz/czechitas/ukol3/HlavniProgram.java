package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.*;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac novyPocitac = new Pocitac();
        System.out.println(novyPocitac.toString());
        novyPocitac.zapniSe(); // chybova hlaska

        Procesor novyProcesor = new Procesor();
        novyProcesor.setRychlost(4_000_000_000_000L);
        novyProcesor.setVyrobce("AMD");


        Pamet novaPamet = new Pamet();
        novaPamet.setKapacita(32_000_000_000L);

        Disk novyDisk = new Disk();
        novyDisk.setKapacita(384_600_000_000L);
        novyDisk.setVyuziteMisto(450_500_000L);

        novyPocitac.setCpu(novyProcesor);
        novyPocitac.setRam(novaPamet);
        novyPocitac.setPevnyDisk(novyDisk);

        novyPocitac.zapniSe(); // uspesne zapnuti

        System.out.println(novyPocitac.toString());

        novyPocitac.vypniSe();

        novyPocitac.zapniSe();

        novyPocitac.zapniSe();



    }

}
