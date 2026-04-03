package dev.neuroncrafters.scispread_api.Publication;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.neuroncrafters.scispread_api.User.UserModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="tb_publications")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "publications")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PublicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
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

    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PublicationTipoEnum tipoEnum;

    @ManyToMany
    @NotNull
    @JoinTable(
            name = "publications_autores",
            joinColumns = @JoinColumn(name = "publications_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<UserModel> autores;

    @ManyToMany
    @NotNull
    private List<UserModel> cooautores; //caso a revista peça que cadastre coautores

    @ManyToOne
    private UserModel orientador; //vincular a UM pesquisador ou membro

    @ManyToOne
    private UserModel coorientador; //pode ou não ter um coorientador

    @NotBlank
    @Column(nullable = false)
    private String citacao; //padrão abnt

    @NotBlank
    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDaPublicacao;
}
