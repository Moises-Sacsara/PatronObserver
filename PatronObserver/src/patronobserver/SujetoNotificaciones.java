package patronobserver;

public interface SujetoNotificaciones {
    void suscribir(Observador o);
    void desuscribir(Observador o);
    void notificar(String mensaje);
}
