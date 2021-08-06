package dominio;

public class Discapacidad extends Jubilado {

    private int na;
    private int pd;

    public Discapacidad(String n, String c, int na,int pd) {
        super(n, c);
        this.na = na;
        this.pd=pd;
    }

    public int getNa() {
        return na;
    }

    public void setNa(int na) {
        this.na = na;
    }

    public String pension() {
          return "\nJubilacion por discapacidad\n"+"Nombre: \n" + super.getN() + "\nNumero de cedula: \n" + super.getC() +
                 "\nPorcentaje de discapacitad \n"+ this.pd+"\nPension a recibir:";
    }
    
}
