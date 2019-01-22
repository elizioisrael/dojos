package me.fsn.filipe.refactoring;

public class ContaAteMeioHora extends Conta {

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		return getVeiculo().tarifaAteMeiaHora();
	}

}
