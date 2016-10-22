package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends ComandoConcreto {
	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Imprimir";
	}

	@Override
	public void execute() {
		int total = getCalculator().getTotal();
		IO.getIO().println(total);
	}
}
