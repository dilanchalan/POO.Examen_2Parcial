package dominio;

public class Patronal extends Jubilado {

    private int na;
    private String t;

    public Patronal(String n, String c, int na, String t) {
        super(n, c);
        this.na = na;
        this.t = t;
    }

    public int getNa() {
        return na;
    }

    public void setNa(int na) {
        this.na = na;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String pension() {
          return "\nJubilacion patronal\n"+"Nombre: \n" + super.getN() + "\nNumero de cedula: \n" + super.getC() 
                  +"\nTipo de empresa:\n"+this.t+ "\nPension a recibir:";
    }

}