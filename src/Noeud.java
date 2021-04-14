import java.util.ArrayList;

public class Noeud {
    private int valeur;
    private ArrayList<Noeud> listeFils = new ArrayList<>();

    public Noeud(int valeur, ArrayList<Noeud> listeFils) {
        this.valeur = valeur;
        this.listeFils = listeFils;
    }

    @Override
    public String toString() {
        return "Noeud{" +
                "valeur=" + valeur +
                '}';
    }

    public Noeud() {
    }

    public int getValeur() {
        return valeur;
    }

    public ArrayList<Noeud> getListeFils() {
        return listeFils;
    }
}
