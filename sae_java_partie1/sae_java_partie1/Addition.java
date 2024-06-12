public class Addition extends Operation{

  // constructeur par défault
  public Addition(){
    super();
  }
  
  // constructeur champ à champ
  public Addition(Nombre n1, Nombre n2){
    super(n1,n2);
  }

  // constructeur par copie
  public Addition(Addition a){
    super(a);
  }
  
  public int valeur(){
    return this.getOperande1().valeur() + this.getOperande2().valeur();
  }

  public String toString(){
    return "Addition : " + this.getOperande1().valeur() + " + " + this.getOperande2().valeur();
  }
}
