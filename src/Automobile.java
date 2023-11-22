public class Automobile extends Veicolo{
    public Automobile(int velocita) {
        super(velocita);
    }
    public int velocitaAttuale(){
        return getVelocita();
    }
}
