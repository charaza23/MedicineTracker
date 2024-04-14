package beans;

import java.io.Serializable;

public class Medicine implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String time;
    private boolean taken;

    // Costruttore vuoto
    public Medicine() {
    }

    // Costruttore con argomenti
    public Medicine(String name, String time, boolean taken) {
        this.name = name;
        this.time = time;
        this.taken = taken;
    }

    // Getter e setter per il nome
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e setter per l'orario
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Getter e setter per lo stato di assunzione
    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
