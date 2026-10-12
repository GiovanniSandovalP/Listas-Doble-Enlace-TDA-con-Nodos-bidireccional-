public class Nodo {

    private Persona dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Persona dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Persona dato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
