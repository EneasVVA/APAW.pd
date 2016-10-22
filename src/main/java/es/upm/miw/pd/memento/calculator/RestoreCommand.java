package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class RestoreCommand extends MementoCommand {
	public RestoreCommand(MementableCalculator calculator, MementoManager<MementoCalculator> mementoManager) {
		super(calculator, mementoManager);
	}

	@Override
	public String name() {
		return "Restaurar";
	}

	@Override
	public void execute() {
		String key = (String) IO.getIO().select(getMementoManager().keys());
		MementoCalculator memento = getMementoManager().getMemento(key);
		((MementableCalculator) getCalculator()).restoreMemento(memento);
	}
}
