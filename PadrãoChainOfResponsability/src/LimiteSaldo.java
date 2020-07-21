
public class LimiteSaldo implements Cartao {

	
	
	@Override
	public void calcular(Compra compra) {
		if(compra.getValor()<=0) {
			System.out.println("Não aprovado:"+"\n"+"Requisição negativa,Saldo 0 ou negativo");
		}else {
			System.out.println("Aprovado,Dentro do Limite de Saldo");
		}
	}
	@Override
	public void setProximo(Cartao proximo) {
		
	}
}
