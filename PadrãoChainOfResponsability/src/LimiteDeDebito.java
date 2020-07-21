
public class LimiteDeDebito implements Cartao {

	private Cartao proximo;
	
	@Override
	public void calcular(Compra compra) {
		if(compra.getValor()>7000||compra.getValor()==0||compra.getValor()<0) {
			System.out.println("N�o aprovado:"+"\n"+"Saldo negativo,Requisi��o negativa ou Limite de D�bito de 7.000"+"\n");
			proximo.calcular(compra);		
		}else {
			System.out.println("Aprovado,Dentro do limite de D�bito"+"\n");
			proximo.calcular(compra);
		}
	}
	
	@Override
	public	void setProximo(Cartao proximo) {
		this.proximo=proximo;
	}
	
	
}
