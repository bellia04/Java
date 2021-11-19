public class Rettangolo {
        private int base;
        private int altezza;

        public Rettangolo(int b,int h){
            this.base=b;
            this.altezza=h;
        }
        public void setBase(int x){this.base=x;}
        public void setAltezza(int y){this.altezza=y;}
        public int getBase(){return this.base;}
        public int getAltezza(){return this.altezza;}
        public int calcolaArea(){
            int area;
            area=this.base*this.altezza;
            return area;
        }
        public int calcolaPerimetro(){
            int perimetro;
            perimetro=(this.base+this.altezza)*2;
            return perimetro;
        }
}
