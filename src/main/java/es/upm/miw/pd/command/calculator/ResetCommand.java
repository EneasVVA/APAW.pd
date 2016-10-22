package es.upm.miw.pd.command.calculator;

public class ResetCommand extends ComandoConcreto {
	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Reiniciar";
	}

	@Override
	public void execute() {
		getCalculator().reset();
	}
}
