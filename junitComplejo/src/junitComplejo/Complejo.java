package junitComplejo;

public class Complejo{
    private float _parteReal;
    private float _parteImaginaria;

    public Complejo (float parteReal, float parteImaginaria){
     this._parteReal = parteReal; this._parteImaginaria = parteImaginaria;                
    }
    public float getParteReal(){
            return _parteReal;
    }

    public float getParteImaginaria(){
            return _parteImaginaria;
    }
    
    public Complejo sumar(Complejo c){
            return new Complejo( this.getParteReal() +  c.getParteReal(),
                                 this.getParteImaginaria() + c.getParteImaginaria()  );
    }
    public Complejo restar(Complejo c){
        return new Complejo( this.getParteReal() -  c.getParteReal(),
                             this.getParteImaginaria() - c.getParteImaginaria()  );
}

} 