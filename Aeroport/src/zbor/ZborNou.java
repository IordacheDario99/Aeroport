package zbor;

public class ZborNou extends ZborComercial {
    public static void main(String [] args ){
        ZborComercial Avion1 = new ZborComercial();
        ZborComercial Avion2 = new ZborComercial();
        ZborComercial Avion3 = new ZborComercial();
        
        Avion1.NumarZbor = 101;
        Avion1.NumarPasageri = 120;
        Avion1.altitudine = 9000;
        Avion1.viteza = 800;
        Avion1.latitudine = (float) 41.40338;
        Avion1.longitudine = (float) 2.1746;
        Avion1.azimut = 14;
        
        Avion2.NumarZbor = 212;
        Avion2.NumarPasageri = 97;
        Avion2.altitudine = 10500;
        Avion2.viteza = 850;
        Avion2.latitudine = (float) 23.57298;
        Avion2.longitudine = (float) 15.19540;
        Avion2.azimut = 12;
        
        Avion3.NumarZbor = 7;
        Avion3.NumarPasageri = 5;
        Avion3.altitudine = 8000;
        Avion3.viteza = 900;
        Avion3.latitudine = 130;
        Avion3.longitudine = 200;
        Avion3.azimut = 0;
        
        
        Avion1.AfiseazaZbor();
        Avion1.RotesteAvion(15);
        
        Avion2.AfiseazaZbor();
        Avion2.RotesteAvion(32);
        
        Avion3.AfiseazaZbor();
        Avion3.RotesteAvion(17);
        
        //Avion3.SetAzimut(90);
        
       
       /*for (int i = 1;i<100;i++)
        {
            Avion1.SetAzimut(67+i);
            Avion1.AfiseazaZbor();
            Avion2.RotesteAvion(15*i);
            Avion2.AfiseazaZbor();
            Avion3.RotesteAvion(15*i);
            Avion3.AfiseazaZbor();
        }*/
       Avion1.SetAzimut(15);
       Avion1.Aterizare();
       
       Avion2.SetAzimut(15);
       Avion2.Aterizare();
       
       Avion3.SetAzimut(5);
       Avion3.Aterizare();
               
    }
}
