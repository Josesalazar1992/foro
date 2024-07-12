package foro.alura.demo.topico;

public record DatosListadoTopico(String titulo, String mensaje, String autor,String curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getCurso());
    }


}

