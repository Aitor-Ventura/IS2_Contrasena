package view;

import model.Contraseña;

public class MockDisplay implements Display {
    private Contraseña contraseña;

    @Override
    public void display(Contraseña contraseña) {
        this.contraseña = contraseña;
        System.out.println(this.contraseña.toString());
    }

    @Override
    public void update(Contraseña contraseña){
        this.contraseña = contraseña;
    }
}
