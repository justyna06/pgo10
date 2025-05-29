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

    public void Zaladuj(int masaLadunku) throws OverfillException{
        this.masaLadunku = masaLadunku;

        if(masaLadunku > this.maksymalnaPojemnosc) {
            throw new OverfillException("Brak miejsca" + numerSeryjny);
            this.maksymalnaPojemnosc = masaLadunku;
        }

    }
}
