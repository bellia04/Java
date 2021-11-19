public class RettangoloTest {
    public static void main(String[] args){
        Rettangolo rettangolo= new Rettangolo(5,3);
        int Base= rettangolo.getBase();
        System.out.println("Base: "+Base);
        int Altezza= rettangolo.getAltezza();
        System.out.println("Altezza: "+Altezza);
        int Area= rettangolo.calcolaArea();
        System.out.println("Area: "+Area);
        int Perimetro= rettangolo.calcolaPerimetro();
        System.out.println("Perimetro: "+Perimetro);
    }
}
