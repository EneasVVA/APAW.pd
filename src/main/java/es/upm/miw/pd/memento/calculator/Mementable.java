package es.upm.miw.pd.memento.calculator;

public interface Mementable<T> {
	T createMemento();

	void restoreMemento(T memento);
}