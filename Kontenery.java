import java.util.ArrayList;

public class Kontenery {

    protected int masaLadunku;
    protected int wysokosc;
    protected int wagaWlasna;
    protected int glebokosc;
    protected String numerSeryjny;
    protected int maksymalnaPojemnosc;

    public void OproznienieZaladunku(){
        masaLadunku=0;
    }

    class OverfillException extends Exception {
        public OverfillException(String message) {
            super(message);
        }
    }
    public void Zaladuj(int masaLadunku) throws OverfillException{
        this.masaLadunku = masaLadunku;

        if(masaLadunku > this.maksymalnaPojemnosc) {
            throw new OverfillException("Brak miejsca" + numerSeryjny);
        }
    }

}
