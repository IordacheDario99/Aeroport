package zbor;

public class ZborComercial extends Zbor {
    int NumarZbor;
    int NumarPasageri;
    
    @Override
    void AfiseazaZbor(){
        System.out.println(""+ " Zborul " + NumarZbor + " Pasageri " +NumarPasageri);
        super.AfiseazaZbor();
    }

    void Aterizare(int viteza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
