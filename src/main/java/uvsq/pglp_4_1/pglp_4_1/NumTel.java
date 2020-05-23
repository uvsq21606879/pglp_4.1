package uvsq.pglp_4_1.pglp_4_1;

public class NumTel {
	
	private final String numero;
	private final String informations;
	
	public NumTel(final String informations, final String numero) {
		this.numero=numero;
		this.informations=" "+informations;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public String getInformations(){
		return this.informations;
	}
	
}
