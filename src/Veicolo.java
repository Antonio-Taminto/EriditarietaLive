public class Veicolo {
    private int velocita;

    public Veicolo(int velocita){
        this.velocita = velocita;
    }

    public int getVelocita() {
        return velocita;
    }
    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }


    public void accelerare(int accelerare){
        velocita += accelerare;
    }
    public void decelerare(int decelerare){
        velocita -= decelerare;
    }
    public void fermarsi(){
        velocita -= velocita;
    }

}
