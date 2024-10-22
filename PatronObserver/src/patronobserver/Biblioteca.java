package patronobserver;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements SujetoNotificaciones{
    private List<Observador> usuarios = new ArrayList<>();

    @Override
    public void suscribir(Observador o) {
        usuarios.add(o);
    }

    @Override
    public void desuscribir(Observador o) {
        usuarios.remove(o);
    }

    @Override
    public void notificar(String mensaje) {
        usuarios.forEach(usuario -> usuario.actualizar(mensaje));
    }
}
