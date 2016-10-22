package es.upm.miw.pd.command.calculator;

public class SubtractCommand extends ComandoConcreto {
	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		getCalculator().subtract(getValue());
	}
}
