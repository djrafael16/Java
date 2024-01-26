package br.com.vainaweb.backendt3.DesafioModulo2;

public class DevFrontEnd extends Colaborador {

	
	
	private String stack; 
	private String sanguineo; 
	
	public DevFrontEnd() {
		super();
	}

	public DevFrontEnd(String nome, String cpf, double salario,int tempo, String stack, String sanguineo) {
		super(nome, cpf, salario, tempo);
		this.sanguineo = sanguineo;
		this.stack = stack;
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.2);
	}
	
	public void ferias()
	{
		setTempo(getTempo());  

		
	    	if(getTempo() > 12 && getTempo() < 23) {
	    		System.out.println(" Habilitado para ferias");
	    		}
	    	    if(getTempo() >= 24) {
	    			System.out.println(" Ferias vencida, sai logo para descansar ");
	    		}if(getTempo() < 12)
	    		{
	    			System.out.println(" Calma rapaz, ja ja as ferias chegam  ");
	    		}
		
		
	}
	
     
	public String visualizar()
	{
		return super.visualizar() + "\n Stack do Designer" + this.stack
				+ "\n Tipo sanguíneo" + this.sanguineo;
		
	}
}
