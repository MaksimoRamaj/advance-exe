package UshtrimeBazike;

public class Makina {
    private String ngjyra;
    private String targa;
    private int numriDyereve;

    public Makina(String ngjyra,String targa,int numriDyereve){
        this.ngjyra = ngjyra;
        this.targa = targa;
        this.numriDyereve = numriDyereve;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getNumriDyereve() {
        return numriDyereve;
    }

    public void setNumriDyereve(int numriDyereve) {
        this.numriDyereve = numriDyereve;
    }
}
