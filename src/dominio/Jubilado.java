package dominio;

public abstract class  Jubilado {
   private  String n;
    private String c;
    private int s=400;

    public Jubilado(String n, String c) {
        this.n = n;
        this.c = c;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public abstract String pension();
}
