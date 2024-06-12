public class Division extends Operation{
  
  // constructeur par default
  public Division(){
    super();
  }

  // constructeur champ à champ
  public Division(Nombre n1, Nombre n2){
    super(n1,n2);
  }

  // constructeur par copie
  public Division(Division d){
    super(d);
  }
  
  public int valeur() throws ArithmeticException{
    if (this.getOperande2().valeur() != 0) // on vérifie qu'on ne divise pas par zéro
      return this.getOperande1().valeur() / this.getOperande2().valeur();
    else{
      throw new ArithmeticException(); // on lance l'exception
    }
  }

  public String toString(){
    return "Division : "+ this.getOperande1().valeur() + " / " + this.getOperande2().valeur();
  }
}
