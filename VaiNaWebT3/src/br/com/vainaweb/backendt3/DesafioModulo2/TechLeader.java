package br.com.vainaweb.backendt3.DesafioModulo2;

public class TechLeader extends Colaborador {

	; 
	private String sanguineo; 
	public TechLeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechLeader(String nome, String cpf, double salario,int tempo, String sanguineo) {
		super(nome, cpf, salario, tempo);
		this.sanguineo = sanguineo;
		
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.8);
	}
	
	
	public void ferias()
	{
		setTempo(getTempo());  

		
	    	if(getTempo() > 12 && getTempo() < 23) {
	    		System.out.println(" Habilitado para ferias");
	    		}
	    	    if(getTempo() > 24) {
	    			System.out.println(" Ferias vencida, sai logo para descansar ");
	    		}if(getTempo() < 12)
	    		{
	    			System.out.println(" Calma rapaz, ja ja as ferias chegam  ");
	    		}
		
		
	}
	
	public String visualizar()
	{
		return super.visualizar() + 
				"\n Tipo sanguíneo" + this.sanguineo;
		
	}
    
}
