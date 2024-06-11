public class Division extends Operation{
  
  // constructeur par default
  public Division(){
    super();
  } // fin constructeur

  // constructeur champ à champ
  public Division(Expression op1, Expression op2){
    super(op1,op2);
  } // fin constructeur

  // constructeur par copie
  public Division(Division d){
    super(d);
  } // fin constructeur
  
  // renvoie le resultat de la division, lance une exception si le denominateur est nul
  public double valeur() throws ArithmeticException{
    if (this.getOperande2().valeur() != 0) // on vérifie qu'on ne divise pas par zéro
      return this.getOperande1().valeur() / this.getOperande2().valeur();
    else{
      throw new ArithmeticException(); // on lance l'exception
    }
  } // fin methode valeur

  public String toString(){
    return "(" + this.getOperande1().toString() + " / " + this.getOperande2().toString() + ")";
  } // fin methode toString
} // fin classe Division

