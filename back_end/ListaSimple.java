public class ListaSimple {

    private Nodo primero;
    private Nodo ultimo;

    public ListaSimple() {
        this.primero = null;
        this.ultimo = null;
    }

    public void insertarAlInicio(Persona persona) {
        Nodo nuevo = new Nodo(persona);
        nuevo.setAnterior(null);
        nuevo.setSiguiente(primero);
        if (primero == null) {
            ultimo = nuevo;
        } else {
            primero.setAnterior(nuevo);
        }
        primero = nuevo;
    }

    public void insertarAlFinal(Persona persona) {
        Nodo nuevo = new Nodo(persona);
        nuevo.setSiguiente(null);
        nuevo.setAnterior(ultimo);
        if (ultimo == null) {
            primero = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
    }

    public void insertarEnPosicion(Persona persona, int posicion) {
        if (posicion <= 0) {
            insertarAlInicio(persona);
            return;
        }
        if (posicion >= tamano()) {
            insertarAlFinal(persona);
            return;
        }
        Nodo siguiente = nodeAt(posicion);
        Nodo anterior = siguiente.getAnterior();
        Nodo nuevo = new Nodo(persona);
        nuevo.setAnterior(anterior);
        nuevo.setSiguiente(siguiente);
        anterior.setSiguiente(nuevo);
        siguiente.setAnterior(nuevo);
    }

    public Persona removerAlInicio() {
        if (primero == null) {
            return null;
        }
        Persona persona = primero.dato();
        primero = primero.getSiguiente();
        if (primero == null) {
            ultimo = null;
        } else {
            primero.setAnterior(null);
        }
        return persona;
    }

    public Persona removerAlFinal() {
        if (ultimo == null) {
            return null;
        }
        Persona persona = ultimo.dato();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) {
            primero = null;
        } else {
            ultimo.setSiguiente(null);
        }
        return persona;
    }

    public Persona removerPorPosicion(int posicion) {
        if (primero == null || posicion < 0 || posicion >= tamano()) {
            return null;
        }
        if (posicion == 0) {
            return removerAlInicio();
        }
        if (posicion == tamano() - 1) {
            return removerAlFinal();
        }
        Nodo objetivo = nodeAt(posicion);
        Nodo anterior = objetivo.getAnterior();
        Nodo siguiente = objetivo.getSiguiente();
        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);
        objetivo.setAnterior(null);
        objetivo.setSiguiente(null);
        return objetivo.dato();
    }

    public Persona mostrarAlInicio() {
        if (primero == null) {
            return null;
        }
        return primero.dato();
    }

    public Persona mostrarAlFinal() {
        if (ultimo == null) {
            return null;
        }
        return ultimo.dato();
    }

    public Persona mostrarPorPosicion(int posicion) {
        Nodo nodo = nodeAt(posicion);
        return nodo == null ? null : nodo.dato();
    }

    public int buscarPosicionPorValor(int id) {
        Nodo actual = primero;
        int indice = 0;
        while (actual != null) {
            if (actual.dato().id() == id) {
                return indice;
            }
            actual = actual.getSiguiente();
            indice++;
        }
        return -1;
    }

    public Persona buscarPorId(int id) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.dato().id() == id) {
                return actual.dato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public Persona buscarPorPosicion(int posicion) {
        Nodo nodo = nodeAt(posicion);
        return nodo == null ? null : nodo.dato();
    }

    public String recorrerAdelante() {
        StringBuilder texto = new StringBuilder();
        Nodo actual = primero;
        int indice = 0;
        while (actual != null) {
            texto.append("[").append(indice).append("] ").append(actual.dato()).append("\n");
            actual = actual.getSiguiente();
            indice++;
        }
        return texto.toString();
    }

    public String recorrerAtras() {
        StringBuilder texto = new StringBuilder();
        Nodo actual = ultimo;
        int indice = tamano() - 1;
        while (actual != null) {
            texto.append("[").append(indice).append("] ").append(actual.dato()).append("\n");
            actual = actual.getAnterior();
            indice--;
        }
        return texto.toString();
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int tamano() {
        int contador = 0;
        Nodo actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public void vaciar() {
        primero = null;
        ultimo = null;
    }

    private Nodo nodeAt(int posicion) {
        int tamano = tamano();
        if (primero == null || posicion < 0 || posicion >= tamano) {
            return null;
        }
        if (posicion < tamano / 2) {
            Nodo actual = primero;
            for (int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }
            return actual;
        }
        Nodo actual = ultimo;
        for (int i = tamano - 1; i > posicion; i--) {
            actual = actual.getAnterior();
        }
        return actual;
    }
}
