package gio.apiforoalura.domain.usuario;

public record DatosListadoUsers(String userName, String email) {

    public DatosListadoUsers(User usuario){
        this(usuario.getUserName(),usuario.getEmail());
    }
}
