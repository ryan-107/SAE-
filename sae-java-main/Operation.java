public abstract class Operation extends Expression {
    private Expression operande1;
    private Expression operande2;

    // constructeur par défault
    public Operation(){
        this.operande1 = new Nombre();
        this.operande2 = new Nombre();
    } // fin constructeur

    // constructeur champ à champ
    public Operation(Expression op1,Expression op2){
        this.operande1 = op1;
        this.operande2 = op2;
    } // fin constructeur

    // constructeur par copie
    public Operation(Operation o) {
        this.operande1 = o.getOperande1();
        this.operande2 = o.getOperande2();
    } // fin constructeur

    public Expression getOperande1(){
        return this.operande1;
    } // fin methode getOperande1

    public Expression getOperande2(){
        return this.operande2;
    } // fin methode getOperande2
} // fin classe Operation