package me.fsn.filipe.refactoring;

public class ContaAteHoraAdicional extends Conta{

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		return getVeiculo().tarifaAteUmaHora();
	}
	
}
