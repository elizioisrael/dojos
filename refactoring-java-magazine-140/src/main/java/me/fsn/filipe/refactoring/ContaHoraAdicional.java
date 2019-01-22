package me.fsn.filipe.refactoring;

public class ContaHoraAdicional extends Conta {

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		long horas = (periodoEmMinutos - 1) / 60;
		return horas * getVeiculo().tarifaHoraAdicional() + getVeiculo().tarifaAteUmaHora();
	}

}
