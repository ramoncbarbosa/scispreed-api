package dev.neuroncrafters.scispread_api.Publication;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name="tb_publications")
public class PublicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String foto;

    @NotBlank
    @Column(nullable = false)
    private String titulo;

    @NotBlank
    @Column(nullable = false)
    private String resumo;

    @NotBlank
    @Column(nullable = false)
    private String urlDoc;

    @NotBlank
    @Column(nullable = false)
    private String tipo; //trocar para o enum depois

    @NotBlank
    @Column(nullable = false)
    private String[] autores; //vincular a UM ou MAIS pesquisadores ou membros

    @Column(nullable = true)
    private String orientador; //vincular a UM pesquisador ou membro

    @Column(nullable = true)
    private String coorientador; //pode ou não ter um coorientador

    @NotBlank
    @Column(nullable = false)
    private String citacao; //padrão abnt

    @NotBlank
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy HH:mm:ss")
    private LocalDate dataDaPublicacao;
}
