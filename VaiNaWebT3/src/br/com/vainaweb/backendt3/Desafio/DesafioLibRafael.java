package br.com.vainaweb.backendt3.Desafio;

public class DesafioLibRafael {

	
	public static void adicao(double[] v)
	{
		double soma = 0;
		for(int i = 0; i < v.length; i++) {
			
			soma = soma + v[i];
			
			}
		System.out.println("Resultado da soma " + soma);
		
		}
	public static void divisor(double[] d) { 
		double di = d[0]; 
		
		for (int j = 1; j<d.length; j++) { 
			
			di = di/d[j];
		} 

		System.out.println("Resultado da divisão " + di);
	}
	
	public static void subtracao(double[] s) 
	{
		double sub = s[0];
		for(int i = 1; i < s.length; i++) {
			
			sub = sub - s[i];
			
			}
		System.out.println("Resultado da subtração " + sub);
	}
	
	public static void mutiplicacao(double [] m)
	{
		double multi = m[0]; 
		for(int j = 1; j<m.length; j++ )
		{
			
		  multi = multi * m[j];	
		}
		System.out.println("Resultado da subtração " + multi);
	
	}
	
	public static void perimetro(double[] p) // calcula o perimetor de um qualquer figura geometrica
	{
		double per = 0;
		for(int i = 0; i < p.length; i++) {
			
			per = per + p[i];
			
			}
		System.out.println("Resultado da Perimetro " + per);
		
		}
	
	public static void areaQuadrado(double a) // calcula a area de um quadrado
	{
		
		double aquad = Math.pow(a,2);
		System.out.println("Resultado da Area do Quadrado " + aquad);
			
		}
	
	public static void areaRetangulo(double b, double h) {
		 double aret = b*h; 
		 System.out.println("Resultado da Area do Retangulo " + aret);
		
	}
	
	public static void areaLosangulo(double D, double d) {
		 double alos = D*d/2; 
		 System.out.println("Resultado da Area do Losangulo " + alos);
		
	}
	
	public static void areaCirculo(double r) {
		double pi = 3.14;
		double acir = 2*pi*r; 
		 System.out.println("Resultado da Area do Circulo " + acir);
		
	}
	
	public static void areaTriangulo(double b, double h) {
		double atri = b*h/2; 
		 System.out.println("Resultado da Area do Triangulo " + atri);
	}
	
	
		
	public static void jurosCompostos(double c, double i, int t) {
		
		double monte = c * (1+ Math.pow(i, t));
		System.out.printf("Resultado Juro compostos " + "%.2f\n",  monte);
		System.out.printf("Resultado Juro compostos somado ao Capital " + "%.2f\n",  monte + c);
	}
	
public static void jurosSimples(double c, double i, int t) {
		
		double mont = c * i * t;
		System.out.printf("Resultado Juro Simples " + "%.2f\n",  mont);
		System.out.printf("Resultado Juro Simples somado ao Capital " + "%.2f\n",  mont + c);
	}
  	
   public static void calcDisjuntor(int e[]) {
	   
	   double dis = 0;
	   double poteletrica = 0;
		for(int i = 0; i < e.length; i++) {
			
			poteletrica = poteletrica + e[i];
			 if(poteletrica <= 1000) {
				 
				 poteletrica = poteletrica * 0.86; 
			 }
             if(poteletrica >= 1001 && poteletrica <= 2000) {
				 
				 poteletrica = poteletrica * 0.75; 
			 }
            if(poteletrica >= 2001 && poteletrica <= 3000) {
				 
				 poteletrica = poteletrica * 0.66; 
			 }
            if(poteletrica >= 3001 && poteletrica <= 4000) {
				 
				 poteletrica = poteletrica * 0.59; 
			 }
            if(poteletrica >= 4001 && poteletrica <= 5000) {
				 
				 poteletrica = poteletrica * 0.52; 
			 }
            if(poteletrica >= 5001 && poteletrica <= 6000) {
				 
				 poteletrica = poteletrica * 0.45; 
			 }
            if(poteletrica >= 6001 && poteletrica <= 7000) {
				 
				 poteletrica = poteletrica * 0.40; 
			 }
            if(poteletrica >= 7001 && poteletrica <= 8000) {
				 
				 poteletrica = poteletrica * 0.35; 
			 }
            if(poteletrica >= 8001 && poteletrica <= 9000) {
				 
				 poteletrica = poteletrica * 0.31; 
			 }
            if(poteletrica >= 9001 && poteletrica <= 10000) {
				 
				 poteletrica = poteletrica * 0.27; 
			 }
            if(poteletrica >= 10001) {
				 
				 poteletrica = poteletrica * 0.24; 
			 }
               dis = poteletrica/127;
			}
		
		
		
		System.out.printf("Sua pontencia eletrica " + "%.2f\n", poteletrica);
		System.out.printf("Seu disjuntor deve ser de no minimo " + "%.2fA\n", dis);
		// obs: esse calculo so deve ser usado para tomada de uso comum mais iluminção, não deve ser usado caso haja 
		// tomada tomadas especias
   }

}
	
	
	

	

