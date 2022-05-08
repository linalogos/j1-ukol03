package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.*;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        // cast 1

        Pocitac novyPocitac = new Pocitac();
        System.out.println(novyPocitac.toString());
        novyPocitac.zapniSe(); // chybova hlaska

        Procesor novyProcesor = new Procesor();
        novyProcesor.setRychlost(4_000_000_000_000L);
        novyProcesor.setVyrobce("AMD");


        Pamet novaPamet = new Pamet();
        novaPamet.setKapacita(32_000_000_000L);

        Disk novyDisk = new Disk();
        novyDisk.setKapacita(400_000_000_000L);
        novyDisk.setVyuziteMisto(500_000_000L);

        novyPocitac.setCpu(novyProcesor);
        novyPocitac.setRam(novaPamet);
        novyPocitac.setPevnyDisk(novyDisk);

        novyPocitac.zapniSe(); // uspesne zapnuti

        System.out.println(novyPocitac.toString());

        novyPocitac.vypniSe(); // ok - pocitac je vypnuty

        novyPocitac.zapniSe(); // ok - pocitac je vypnuty

        novyPocitac.zapniSe(); //chybova hlaska - pocitac jiz je zapnuty

        novyPocitac.vypniSe(); // ok - pocitac je vypnuty

        novyPocitac.vypniSe(); // ok - zadna zmena

        // cast 2 a 3

        Disk novyDruhyDisk = new Disk();
        novyDruhyDisk.setKapacita(300_000_000_000L);
        novyDruhyDisk.setVyuziteMisto(0L);

        novyPocitac.setDruhyDisk(novyDruhyDisk);
        novyPocitac.zapniSe();
        novyPocitac.vytvorSouborOVelikosti(200_000_000_000L); // 1. soubor na 1. disku
        novyPocitac.vytvorSouborOVelikosti(199_500_000_000L); // 2. soubor na 1. disk
        novyPocitac.vytvorSouborOVelikosti(150_000_000_000L); // 3. soubor na 2. disk
        novyPocitac.vytvorSouborOVelikosti(200_000_000_000L); // chybova hlaska
        novyPocitac.vymazSouboryOVelikosti(150_000_000_000L); // smazani 3. souboru z 2. disku
        novyPocitac.vymazSouboryOVelikosti(200_000_000_000L); // smazani souboru z 1. disku
    }
}
