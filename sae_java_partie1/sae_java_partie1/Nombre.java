public class Nombre {
    private int valeurNombre;

    // constructeur par défault
    public Nombre(){
        this.valeurNombre = 0;
    }

    // constructeur champ à champ
    public Nombre(int n){
        this.valeurNombre = n;
    }

    // constructeur par copie
    public Nombre(Nombre nb){
        this.valeurNombre = nb.valeur();
    }

    public int valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return "Nombre : " + this.valeur();
    }
}
