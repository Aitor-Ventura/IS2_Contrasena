package model;

import java.util.ArrayList;
import java.util.List;

public class Contraseña {
    private String contraseña;
    private List<Observer> observers = new ArrayList<>();

    public Contraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        notificar();
    }

    public interface Observer {
        public void update(Contraseña contraseña);
    }

    private void notificar(){
        for (Observer observer:
             observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "" + contraseña;
    }
}
