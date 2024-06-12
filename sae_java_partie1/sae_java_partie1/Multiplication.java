public class Multiplication extends Operation{

  // constructeur par défault
  public Multiplication(){
    super();
  }
  
  // constructeur champ à champ 
  public Multiplication(Nombre n1, Nombre n2){
    super(n1,n2);
  }

  // constructeur par copie
  public Multiplication(Multiplication m){
    super(m);
  }
  
  public int valeur(){
    return this.getOperande1().valeur() * this.getOperande2().valeur();
  }

  public String toString(){
    return "Multiplication : " + this.getOperande1().valeur() + " x " + this.getOperande2().valeur();
  }
}
