package view;

import model.Contraseña;

public interface Display extends Contraseña.Observer {
    public void display(Contraseña contraseña);
}
