package app;

import control.Command;
import control.Login;
import model.Contraseña;
import view.Display;
import view.MockDisplay;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private Display display;
    private Command command;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
    }

    public void execute(){
        this.display = new MockDisplay();
        List<Contraseña.Observer> observers = new ArrayList<>();

        Contraseña contraseña = new Contraseña("hola_papito");
        this.command = new Login(contraseña);
        this.display.display(contraseña);
        this.command.execute("hola-papito");
        this.display.display(contraseña);

    }
}
