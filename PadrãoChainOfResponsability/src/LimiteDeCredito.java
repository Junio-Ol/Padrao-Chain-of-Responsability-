public class LimiteDeCredito implements Cartao {
	
	private Cartao proximo;
	
	@Override
	public void calcular(Compra compra) {
		if(compra.getValor()<0||compra.getValor()==0||compra.getValor()>1000) {
			System.out.println("N�o aprovado:"+"\n"+"Limite de Cr�dito de 1000 ou requesi��o negativa"+"\n");
			proximo.calcular(compra);
		}else {
			
			System.out.println("Aprovado, Dentro do limite de Cr�dito"+"\n");
			proximo.calcular(compra);
		}
	}
	@Override
	public	void setProximo(Cartao proximo) {
		this.proximo = proximo;
	}

}
