package dev.neuroncrafters.scispread_api.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Enumerated(EnumType.STRING)
    @Column(name = "cargo", nullable = false)
    private UserRoleEnum cargo;

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
}
