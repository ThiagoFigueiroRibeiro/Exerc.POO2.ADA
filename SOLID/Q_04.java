//Calculadora de Frete

record Endereco() {}

interface FreteCalculadora { 
	double calculaFrete(Endereco endereco);
}

class CorreiosFreteCalculadora implements FreteCalculadora{
	public double calculaFrete(Endereco endereco){
		return 0D;
	};
}
class LoggiFreteCalculadora implements FreteCalculadora{
		public double calculaFrete(Endereco endereco){
		return 0D;
	};
}
