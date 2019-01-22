package me.fsn.filipe.refactoring;

public class ContaDiaria extends Conta {

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		return getVeiculo().tarifaDiaria();
	}

}
