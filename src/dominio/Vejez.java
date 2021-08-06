package dominio;

public class Vejez extends Jubilado {

    private int na;

    public Vejez(String n, String c, int na) {
        super(n, c);
        this.na = na;
    }

    public int getNa() {
        return na;
    }

    public void setNa(int na) {
        this.na = na;
    }

    public String pension() {
        return "\nJubilacion por vejez\n"+ "Nombre: \n" + super.getN() + "\nNumero de cedula: \n" + super.getC() + "\nPension a recibir:";
    }

}
