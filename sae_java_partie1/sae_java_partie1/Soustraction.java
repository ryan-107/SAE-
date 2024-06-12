public class Soustraction extends Operation{

  // constructeur par défault
  public Soustraction(){
    super();
  }

  // constructeur champ à champ
  public Soustraction(Nombre n1, Nombre n2){
    super(n1,n2);
  }

  // constructeur par copie
  public Soustraction(Soustraction s){
    super(s);
  }
  
  public int valeur(){
    return this.getOperande1().valeur() - this.getOperande2().valeur();
  }

  public String toString(){
    return "Soustraction : " + this.getOperande1().valeur() + " - " + this.getOperande2().valeur();
  }
}
