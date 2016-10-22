package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class SaveCommand extends MementoCommand {
	public SaveCommand(MementableCalculator calculator, MementoManager<MementoCalculator> mementoManager) {
		super(calculator, mementoManager);
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		MementoCalculator memento = ((MementableCalculator) getCalculator()).createMemento();
		String key = IO.getIO().readString("Nombre del punto de guardado");
		getMementoManager().addMemento(key, memento);
	}
}
