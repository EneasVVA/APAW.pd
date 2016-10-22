package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.ComandoConcreto;

public abstract class MementoCommand extends ComandoConcreto {
    private MementoManager<MementoCalculator> mementoManager;
    
    public MementoCommand(MementableCalculator calculator, MementoManager<MementoCalculator> mementoManager) {
        super(calculator);
        this.mementoManager = mementoManager;
    }

    protected MementoManager<MementoCalculator> getMementoManager() {
        return mementoManager;
    }
}