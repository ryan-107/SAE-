public class Nombre extends Expression {
    private double valeurNombre;

    // constructeur par défault
    public Nombre(){
        this.valeurNombre = 0;
    } // fin constructeur

    // constructeur champ à champ
    public Nombre(double n){
        this.valeurNombre = n;
    } // fin constructeur

    // constructeur par copie
    public Nombre(Nombre nb){
        this.valeurNombre = nb.valeur();
    } // fin constructeur

    // renvoie la valeur du nombre
    public double valeur(){
        return this.valeurNombre;
    } // fin methode valeur

    public String toString(){
        return "" + this.valeur();
    } // fin methode toString
} // fin classe Nombre
