public class Soustraction extends Operation{

  // constructeur par défault
  public Soustraction(){
    super();
  }

  // constructeur champ à champ
  public Soustraction(Expression op1, Expression op2){
    super(op1,op2);
  }

  // constructeur par copie
  public Soustraction(Soustraction s){
    super(s);
  }
  
  // renvoie le resultat de la soustraction
  public double valeur(){
    return this.getOperande1().valeur() - this.getOperande2().valeur();
  } // fin methode valeur

  public String toString(){
    return "(" + this.getOperande1().toString() + " - " + this.getOperande2().toString() + ")";
  } // fin methode toString
} // fin classe Soustraction

