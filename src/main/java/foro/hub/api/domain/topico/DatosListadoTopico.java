package foro.hub.api.domain.topico;

public record DatosListadoTopico(Long id, String titulo, String mensaje,
                                 String fecha, String estatus, String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getEstatus().toString(), topico.getCurso().toString());
    }
}