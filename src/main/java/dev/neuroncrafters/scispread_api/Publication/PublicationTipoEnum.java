package dev.neuroncrafters.scispread_api.Publication;

import lombok.Getter;

@Getter
public enum PublicationTipoEnum {
    MONOGRAFIA("Monografia"),
    ARTIGO("Artigo"),
    DIVULGACAO_CIENTIFICA("Divulgação Científica"),
    CAPITULO_LIVRO("Capítulo de Livro"),
    LIVRO("Livro"),
    PAPER("Paper"),
    RESUMO("Resumo"),
    PATENTE("Patente");

    private final String descricao;

    PublicationTipoEnum(String descricao) {
        this.descricao = descricao;
    }
}
