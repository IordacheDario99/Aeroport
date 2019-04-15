package zbor;

public class Zbor {

    int altitudine;
    protected int azimut;
    int viteza;
    float latitudine;
    float longitudine;

    void RotesteAvion(int unghi) {
        azimut = (azimut + unghi) % 360;
        if (azimut < 0) {
            azimut = azimut + 360;
        }
        System.out.println("Rotire avion:" + azimut + "\n");
    }

    void SetAzimut(int unghi) {
        azimut = unghi % 360;
        if (azimut < 0) {
            azimut = azimut + 360;
        }
        System.out.println("Azimut =" + azimut);
    }

    int GetAzimut() {
        return azimut;
    }

    void AfiseazaZbor() {
        System.out.println(altitudine + " m " + azimut + " grade " + viteza 
                + " km/ora " + "Coordonate zbor: LAT. " 
                + latitudine + " LONG. " + longitudine + " ");
    }

    int Aterizare() {
        if (azimut <= 15) {

            while (viteza != 0 || altitudine !=0) {
               
                if (viteza > 0) {
                    viteza -= 50;
                }
                if (altitudine > 0) {
                    altitudine -= 500 ;
                }

                System.out.println("Viteza: " + viteza + " Altitudine: " + altitudine);
            }

            System.out.println("Aterizare resusita \n");
        } else {
            System.out.println("Unghi de rotatie prea mare! Aterizare nesigura! \n");
        }

        return 0;

    }
}
