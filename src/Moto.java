public class Moto extends Veicolo{
    public Moto(int velocita) {
        super(velocita);
    }
    public int velocitaAttuale(){
        return getVelocita();
    }
}
