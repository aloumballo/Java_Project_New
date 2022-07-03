package model;

public class Pavillon {
    private ResponsablePavillion kini;
    private int id;
    private int numero;
    private int nbreEtage;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNbreEtage() {
        return nbreEtage;
    }

    public void setNbreEtage(int nbreEtage) {
        this.nbreEtage = nbreEtage;
    }
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", kini=" + kini + ", nbreEtage=" + nbreEtage + ", numero=" + numero + "]";
    }
    
    
}
