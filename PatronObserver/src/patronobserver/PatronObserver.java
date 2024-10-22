package patronobserver;

public class PatronObserver {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Moises");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.suscribir(usuario1);
        biblioteca.suscribir(usuario2);

        biblioteca.notificar("Nuevo libro disponible: 'Java Intermedio'.");
        biblioteca.notificar("Tu prestamo vence en 4 dias.");

        biblioteca.desuscribir(usuario1);
        biblioteca.notificar("Nuevos descuentos en libros.");
    }
    
}
