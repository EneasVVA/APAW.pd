package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.AddCommand;
import es.upm.miw.pd.command.calculator.CommandManager;
import es.upm.miw.pd.command.calculator.PrintCommand;
import es.upm.miw.pd.command.calculator.ResetCommand;
import es.upm.miw.pd.command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainMementoCalculator {
	private CommandManager commandManager;

	public MainMementoCalculator() {
		MementableCalculator calculator = new MementableCalculator();
		MementoManager<MementoCalculator> mementoManager = new MementoManager<MementoCalculator>();
		this.commandManager = new CommandManager();
		this.commandManager.add(new AddCommand(calculator));
		this.commandManager.add(new SubtractCommand(calculator));
		this.commandManager.add(new ResetCommand(calculator));
		this.commandManager.add(new PrintCommand(calculator));
		this.commandManager.add(new RestoreCommand(calculator, mementoManager));
		this.commandManager.add(new SaveCommand(calculator, mementoManager));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainMementoCalculator());
	}
}
