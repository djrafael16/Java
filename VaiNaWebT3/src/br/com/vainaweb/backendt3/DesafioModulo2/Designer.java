package br.com.vainaweb.backendt3.DesafioModulo2;

public class Designer extends Colaborador{
	
	private String stackDesigner; 
	private String sanguineo; 
	
	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Designer(String nome, String cpf, double salario, int tempo, String stackDesigner, String sanguineo) {
		super(nome, cpf, salario, tempo);
		this.sanguineo = sanguineo;
		this.stackDesigner = stackDesigner;
		
	
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.20);
		
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
		return super.visualizar() + "\n Stack do Designer" + this.stackDesigner
				+ "\n Tipo sanguíneo" + this.sanguineo;
		
	}
     
}
