public class FiguraGeometrica {
    private int numeroLati;

    public FiguraGeometrica(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public int getNumeroLati() {
        return this.numeroLati;
    }

    public void setNumeroLati(int n) {
        numeroLati = n;
    }

    @Override
    public String toString(){
        //return this.getClass().getName() + "{numeroLati: "+this.numeroLati+"}";
        return "FiguraGeometrica {numeroLati:"+this.numeroLati+"}";
    }

    @Override
    public boolean equals(Object x){
        int n=((FiguraGeometrica)x).getNumeroLati();
        return(n==this.numeroLati);
    }

}
