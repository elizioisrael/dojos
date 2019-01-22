package me.fsn.filipe.refactoring;

public abstract class Conta {

    private long entrada;

    private long saida;

    private Veiculo veiculo;

	public Double gerarConta() {
        long periodoEmMinutos = obtemPeriodoDeUtilizacaoEmMinutos();
        return calcularContaDeUtilizacao(periodoEmMinutos);
    }

	protected abstract double calcularContaDeUtilizacao(long periodoEmMinutos);

	private long obtemPeriodoDeUtilizacaoEmMinutos() {
		return (saida - entrada) / 1000 / 60;
	}
	
    public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
