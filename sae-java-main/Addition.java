public class Addition extends Operation{

  // constructeur par défault
  public Addition(){
    super();
  }
  
  // constructeur champ à champ
  public Addition(Expression op1, Expression op2){
    super(op1,op2);
  }

  // constructeur par copie
  public Addition(Addition a){
    super(a);
  }
  
  // renvoie le resultat de l'addition
  public double valeur(){
    return this.getOperande1().valeur() + this.getOperande2().valeur();
  } // fin methode valeur

  public String toString(){
    return "(" + this.getOperande1().toString() + " + " + this.getOperande2().toString() + ")";
  } // fin methode toString
} // fin classe Addition
