package DesafioNunbank;

public class Aplicação {

	
	public static void main(String[] args) {
	
    ContaPoupanca contaPoupança = new ContaPoupanca(23450, 656, 1000.00, "Rafael", "138", 9898);
    ContaCorrente contaCorrente = new ContaCorrente(23450, 656, 1000.00, "Rafael", "138", 9898, 0, 0);
    
       
       contaPoupança.sacar(200);
       System.out.println(contaPoupança);
       contaCorrente.sacar(200);
       System.out.println(contaCorrente);
      
	
	}
}