public record Persona(
        int id,
        String nombre,
        String apellidoPaterno,
        String apellidoMaterno,
        int edad,
        String curp,
        String telefono) {

    @Override
    public String toString() {
        return id + " - " + nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
