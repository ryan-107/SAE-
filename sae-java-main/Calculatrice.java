public class Calculatrice {
    
    public static void main(String[] args)  {
        
        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(s, a) ;
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3

        Expression e = new Multiplication(new Division(new Nombre(21),new Nombre(3)),new Division(new Nombre(50),new Nombre(10))) ;
        System.out.println(e + " = " + e.valeur()) ; // affiche ((21 / 3) x (50 / 10)) = 35
        
    } // fin methode main
} // fin classe Calculatrice
