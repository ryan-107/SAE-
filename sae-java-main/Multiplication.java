public class Multiplication extends Operation{

  // constructeur par défault
  public Multiplication(){
    super();
  } // fin constructeur
  
  // constructeur champ à champ 
  public Multiplication(Expression op1, Expression op2){
    super(op1,op2);
  } // fin constructeur

  // constructeur par copie
  public Multiplication(Multiplication m){
    super(m);
  } // fin constructeur
  
  // renvoie le resultat de la multiplication
  public double valeur(){
    return this.getOperande1().valeur() * this.getOperande2().valeur();
  } // fin methode valeur

  public String toString(){
    return "(" + this.getOperande1().toString() + " x " + this.getOperande2().toString() + ")";
  } // fin methode toString
} // fin classe Multiplication
