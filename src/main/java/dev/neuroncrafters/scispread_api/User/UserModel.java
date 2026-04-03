package dev.neuroncrafters.scispread_api.User;

import dev.neuroncrafters.scispread_api.Publication.PublicationModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "publications")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private UserLoginStatusEnum loginStatus;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, max = 36, message = "A senha ter entre 8 e 36 caracteres")
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "cargo", nullable = false)
    private UserRoleEnum cargo;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "titulo", nullable = false)
    private UserTituloEnum titulacao;

    @Column(nullable = false)
    private String area_de_atuacao;

    @Column(nullable = false)
    private String vinculo;

    @Column(nullable = true)
    private String lattes;

    @Column(nullable = true)
    private String foto;

    //um user pode ter varias publicacoes
    @ManyToMany(mappedBy = "autores")
    private List<PublicationModel> publications;
}
