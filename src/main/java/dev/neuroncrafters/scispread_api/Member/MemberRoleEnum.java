package dev.neuroncrafters.scispread_api.Member;

public enum MemberRoleEnum {
    PESQUISADOR("Pesquisador"),
    PESQUISADORA("Pesquisadora");

    private final String cargo;

    MemberRoleEnum(String cargo){
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
