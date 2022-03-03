public class Fracion{
    private int numerador;
    private int denominador;
    public Fracion(){
        this.numerador = 0;
        this.denominador = 0;
    }
    public Fracion(int numerador, int denominador){
        setDenominador(denominador);
        setNumerador(numerador);
    }
    public void invierte(){
        int aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador = aux;
    }
    public void simplifica(){
        boolean auxn;
        boolean auxd;
        int minimo = 0;
        if (this.numerador < this.denominador) {
            minimo = this.numerador;
        } else {
            if (this.numerador > this.denominador) {
                minimo = this.denominador; 
            } else {
                minimo = this.denominador;
            }
        }
        for (int i = minimo; i > 1; i--) {
            auxd = false;
            auxn = false;
            while (auxd == false && auxn == false) {
                if (this.denominador % i == 0) {
                    this.denominador = this.denominador /i;
                    System.out.println(denominador);
                }else{
                    auxd = true;
                }
                if (this.numerador % i == 0) {
                    this.numerador = this.numerador /i;
                    System.out.println(numerador);
                }else{
                    auxn = true;
                }
            }
        }
    }
    public int multiplica(){
        int result = this.numerador * this.denominador;
        return result;
    }
    public int divide(){
        int result = this.numerador / this.denominador;
        return result;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        if (numerador != 0) {
            this.numerador = numerador; 
        }
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;    
        }
    }
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        
        String auxtoString = "Hola, buenas tardes";
        
        return auxtoString;
    }
}
