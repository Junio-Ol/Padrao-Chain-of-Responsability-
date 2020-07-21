public class Teste {
	
	public static void main(String[] args) {
		final Compra compra = new Compra(7500);
		calcula(compra);
		
	}
	 public static void calcula(Compra compra) {
	        final LimiteDeDebito deb = new LimiteDeDebito();
	        final LimiteDeCredito cred = new LimiteDeCredito();
	        final LimiteSaldo sal = new LimiteSaldo();
	 
	        deb.setProximo(cred);
	        cred.setProximo(sal);
	 
	         deb.calcular(compra);
	   }

}
		