public class CalculatriceSimple {

    public static void main(String[] args){

        // test de la soustraction
        Nombre six = new Nombre(6) ;
        Nombre dix = new Nombre(10) ;
        Operation s = new Soustraction(dix,six) ;
        System.out.println(s + " = " + s.valeur()) ;

        // test de l'addition
        Nombre deux = new Nombre(2) ;
        Nombre sept = new Nombre(7) ;
        Operation a = new Addition(deux,sept) ;
        System.out.println(a + " = " + a.valeur()) ;

        // test de la multiplication
        Operation m = new Multiplication(deux,dix) ;
        System.out.println(m + " = " + m.valeur()) ;

        // test de la division
        Nombre huit = new Nombre(8) ;
        Nombre zero = new Nombre() ;

        try{
            Operation d1 = new Division(huit,deux) ;
            System.out.println(d1 + " = " + d1.valeur()) ;

            Operation d2 = new Division(sept,zero) ;
            System.out.println(d2 + " = " + d2.valeur());
        }

        catch(ArithmeticException e){
            System.out.println("Division par zéro impossible");
        }
        
    }
}
