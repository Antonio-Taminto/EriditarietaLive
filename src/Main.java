// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Automobile bmw = new Automobile(50);
        Moto ktm = new Moto(55);

        System.out.println("la moto è a : " + ktm.velocitaAttuale() + "km/h");
        ktm.accelerare(50);
        System.out.println("la moto è a : " + ktm.velocitaAttuale() + "km/h");
        ktm.decelerare(30);
        System.out.println("la moto è a : " + ktm.velocitaAttuale() + "km/h");
        ktm.fermarsi();
        System.out.println("la moto è a : " + ktm.velocitaAttuale() + "km/h");
        System.out.println("---------------------");
        System.out.println("l' auto è a : " + bmw.velocitaAttuale() + "km/h");
        bmw.accelerare(10);
        System.out.println("l' auto è a : " + bmw.velocitaAttuale() + "km/h");
        bmw.decelerare(5);
        System.out.println("l' auto è a : " + bmw.velocitaAttuale() + "km/h");
        bmw.fermarsi();
        System.out.println("l' auto è a : " + bmw.velocitaAttuale() + "km/h");
    }
}