package control;

import model.Contraseña;

public class Login implements Command {
    private Contraseña contraseña;

    public Login(Contraseña contraseña){
        this.contraseña = contraseña;
        this.contraseña.setContraseña(contraseña.toString());
    }

    @Override
    public void execute(String contraseña) {
        if (this.contraseña.toString().equals(contraseña.toString())) System.out.println("Login correcto");
        else System.out.println("Login incorrecto");
    }
}
