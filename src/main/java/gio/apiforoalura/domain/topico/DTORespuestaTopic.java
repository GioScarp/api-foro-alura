package gio.apiforoalura.domain.topico;

public record DTORespuestaTopic(String title, String message, String user, String course) {

    public DTORespuestaTopic(Topic topico){
        this(topico.getTitle(),topico.getMessage(),topico.getUser().getUserName(),topico.getCourse().getName());
    }
}
