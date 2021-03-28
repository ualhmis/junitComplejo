package junitComplejo;

public class Complejo{
	private float parteReal;
	private float parteImaginaria;

	public Complejo (float parteReal, float parteImaginaria){
		this.parteReal = parteReal; 
		this.parteImaginaria = parteImaginaria;                
	}
	public float getParteReal(){
		return this.parteReal;
	}

	public float getParteImaginaria(){
		return this.parteImaginaria;
	}

	public Complejo sumar(Complejo c){
		return new Complejo( this.getParteReal() 		+ c.getParteReal(),
							 this.getParteImaginaria() 	+ c.getParteImaginaria()  );
	}
	public Complejo restar(Complejo c){
		return new Complejo( this.getParteReal() 		- c.getParteReal(),
							 this.getParteImaginaria() 	- c.getParteImaginaria()  );
	}
	@Override
	public String toString() {
		return "(" + this.parteReal + ", " + this.parteImaginaria + ")";
	}

	
} 
