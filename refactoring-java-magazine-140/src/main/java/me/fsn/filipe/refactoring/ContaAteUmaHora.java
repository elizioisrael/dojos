package me.fsn.filipe.refactoring;

public class ContaAteUmaHora extends Conta {

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		return getVeiculo().tarifaAteUmaHora();
	}

}
