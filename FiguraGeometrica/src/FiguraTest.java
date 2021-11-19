public class FiguraTest {
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica(3);
        int numLati = figura.getNumeroLati();
        System.out.println("Numero lati: " + numLati);
        figura.setNumeroLati(4);
        numLati = figura.getNumeroLati();
        System.out.println("Nuovo numero lati: " + numLati);
        System.out.println(figura);

        System.out.println("nuovo numero lati: " + figura.getNumeroLati());

        for (int i = figura.getNumeroLati(); i < 9; i++) {
            figura.setNumeroLati(i);
            System.out.println(figura.getNumeroLati());
            //System.out.println(figura);
        }

        System.out.println(figura);

        FiguraGeometrica figura2=new FiguraGeometrica(5);
        if(figura2.equals(figura)){
            System.out.println("Figure uguali");
        }else{
            System.out.println("Figure diverse");
        }
    }
}
