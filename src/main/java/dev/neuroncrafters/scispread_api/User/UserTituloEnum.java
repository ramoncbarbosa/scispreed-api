package dev.neuroncrafters.scispread_api.User;

public enum UserTituloEnum {
    GRADUANDA("Graduanda"),
    GRADUANDO("Graduando"),
    GRADUADA("Graduada"),
    GRADUADO("Graduado"),
    ESPECIALISTA("Especialista"),
    MESTRANDA("Mestranda"),
    MESTRANDO("Mestrando"),
    MESTRA("Mestra"),
    MESTRE("Mestre"),
    DOUTORANDA("Doutoranda"),
    DOUTORANDO("Doutorando"),
    DOUTORA("Doutora"),
    DOUTOR("Doutor");

    private final String titulo;

    UserTituloEnum(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
}
