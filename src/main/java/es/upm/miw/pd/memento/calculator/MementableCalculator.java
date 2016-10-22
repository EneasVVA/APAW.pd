package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.Calculator;

public class MementableCalculator extends Calculator implements Mementable<MementoCalculator> {
    @Override
    public MementoCalculator createMemento() {
        return new MementoCalculator(getTotal());
    }

    @Override
    public void restoreMemento(MementoCalculator memento) {
        setTotal(memento.getValue());
    }
}