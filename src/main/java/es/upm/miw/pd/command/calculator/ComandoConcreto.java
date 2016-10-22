package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public abstract class ComandoConcreto implements Comando {
	private Calculator calculator;

	public ComandoConcreto(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	protected Calculator getCalculator() {
		return calculator;
	}

	protected int getValue() {
		return IO.getIO().readInt();
	}
}
