package dev.neuroncrafters.scispread_api.User;

public enum UserRoleEnum {
    ADMIN("Administrador(a)"),
    COORDENADORA("Coordenadora"),
    COORDENADOR("Coordenador"),
    COORDENADORAADJUNTA("Coordenadora Adjunta"),
    COORDENADORADJUNTO("Coordenador Adjunto"),
    BOLSISTA("Bolsista"),
    VOLUNTARIO("Voluntário"),
    TECNICO("Técnico"),
    TECNICA("Técnica");

    private final String cargo;

    UserRoleEnum(String cargo){
        this.cargo = cargo;
    }

    public String getDescricao(){
        return cargo;
    }
}
