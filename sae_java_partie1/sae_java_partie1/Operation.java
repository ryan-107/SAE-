public abstract class Operation {
    private Nombre operande1;
    private Nombre operande2;

    // constructeur par défault
    public Operation(){
        this.operande1 = new Nombre();
        this.operande2 = new Nombre();
    }

    // constructeur champ à champ
    public Operation(Nombre n1,Nombre n2){
        this.operande1 = n1;
        this.operande2 = n2;
    }

    // constructeur par copie
    public Operation(Operation o) {
        this.operande1 = o.getOperande1();
        this.operande2 = o.getOperande2();
    }

    // c'est une méhode abstraite donc elle n'a pas de corps
    public abstract int valeur();

    public Nombre getOperande1(){
        return this.operande1;
    }

    public Nombre getOperande2(){
        return this.operande2;
    }
}
