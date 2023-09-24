package entidades;

public class PessoaJuridica extends Pessoa{

	private Integer numeroFun;

	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFun) {
		super(nome, rendaAnual);
		this.numeroFun = numeroFun;
	}

	public Integer getNumeroFun() {
		return numeroFun;
	}

	public void setNumeroFun(Integer numeroFun) {
		this.numeroFun = numeroFun;
	}
	
	@Override
	public double tax() {
		if(numeroFun > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual() * 0.16;
		}
	}
	
}
