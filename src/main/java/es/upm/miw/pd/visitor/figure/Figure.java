package es.upm.miw.pd.visitor.figure;

public interface Figure {
    void accept(AreaManager area);
    
    void accept(SidesManager sides);
}
