public class LimiteDeCredito implements Cartao {
	
	private Cartao proximo;
	
	@Override
	public void calcular(Compra compra) {
		if(compra.getValor()<0||compra.getValor()==0||compra.getValor()>1000) {
			System.out.println("Não aprovado:"+"\n"+"Limite de Crédito de 1000 ou requesição negativa"+"\n");
			proximo.calcular(compra);
		}else {
			
			System.out.println("Aprovado, Dentro do limite de Crédito"+"\n");
			proximo.calcular(compra);
		}
	}
	@Override
	public	void setProximo(Cartao proximo) {
		this.proximo = proximo;
	}

}
