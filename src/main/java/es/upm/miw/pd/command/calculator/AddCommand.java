package es.upm.miw.pd.command.calculator;

public class AddCommand extends ComandoConcreto{
    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        getCalculator().add(getValue());
    }
}
