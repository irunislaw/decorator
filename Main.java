package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Komputer komputer = new PamiecRAM("Crucial 16GB (2x8GB) 3600MHz CL16 Ballistix Black", 429,
                                new Obudowa("SilentiumPC Ventum VT4 TG", 240,
                                                new Plytaglowna("Asus TUF Z590-plus", 900,
                                                                new KartaGraficzna("RTX3060", 3500,
                                                                                new Zasilacz("SilentiumPC Supremo FM2 750W 80 Plus Gold",
                                                                                                399,
                                                                                                new Dysk("Samsung 1TB M.2 PCIe Gen4 NVMe 980 PRO",
                                                                                                                849,
                                                                                                                new Procesor("Intel core i5-11600KF",
                                                                                                                                1100,
                                                                                                                                new Komputer())))))));
                Komputer komputer1 = new PamiecRAM("Crucial 8GB (1x8GB) 3300MHz CL16 Ballistix Black", 350,
                                new Obudowa("SilentiumPC Ventum VT4 TG", 240,
                                                new Plytaglowna("Asus TUF LGA1200", 700,
                                                                new KartaGraficzna("RX5500", 3100,
                                                                                new Zasilacz("Fajna obudowa",
                                                                                                399,
                                                                                                new Dysk("Samsung 4TB M.2 PCIe Gen4 NVMe 980 PRO",
                                                                                                                1200,
                                                                                                                new Procesor("AMD Ryzen 3600",
                                                                                                                                1100,
                                                                                                                                new Komputer())))))));
                System.out.println("Co chcesz zrobic ? 1-Lista Produktów | 2-Wyjscie z programu");

                Scanner scanner = new Scanner(System.in);
                try {
                        int wybor = scanner.nextInt();
                        if (wybor == 1) {
                                List<Komputer> lista = new ArrayList<Komputer>();
                                lista.add(komputer);
                                lista.add(komputer1);
                                for (int i = 0; i < lista.size(); i++) {
                                        System.out.println(lista.get(i).decorate());
                                        System.out.println();
                                }
                        }
                } catch (Exception e) {
                        System.out.println("blad wpisz liczbe");
                }

        }
}