import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cislicka = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean aJedemeDal = true;
        float p = 0;

        while (aJedemeDal) {
            System.out.println("""
                    ////////////////////////
                    1. Pridat cislo
                    2. Aritmeticky prumer
                    3. Vyhledat cislo podle indexu
                    4. Ukoncit
                    ////////////////////////
                    """);
            try {
                switch (Integer.parseInt(sc.next())) {
                    case 1:
                        System.out.println("Zadejte cislo ktere chcete pridat: ");
                        try {
                            cislicka.add(Integer.parseInt(sc.next()));
                        } catch (Exception e) {
                            e.getCause();
                        }

                        break;

                    case 2:
                        for (Integer integer : cislicka) {
                            p += integer;
                        }
                        System.out.println("Aritmeticky prumer je: " + p / cislicka.size());
                        p = 0;
                        break;

                    case 3:
                        System.out.println("Zadejte pozici: ");
                        try {
                            System.out.println(cislicka.get(Integer.parseInt(sc.next())));
                        } catch (Exception e) {
                            e.getCause();
                        }
                        break;

                    case 4:
                        aJedemeDal = false;
                        break;

                    default:
                        System.out.println("Zadejte platnou volbu. - Bylo zadano neplatne cislo");
                        break;
                }
            } catch (Exception e) {
                e.getCause();
                System.out.println("Zadejte platnou volbu. - Nebylo zadano cislo");
            }
        }
    }
}
