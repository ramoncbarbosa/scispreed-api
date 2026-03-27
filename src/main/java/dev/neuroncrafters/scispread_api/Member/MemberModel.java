package dev.neuroncrafters.scispread_api.Member;

import dev.neuroncrafters.scispread_api.User.UserTituloEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_membros")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class MemberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Enumerated(EnumType.STRING)
    @Column(name = "cargo", nullable = false)
    private MemberRoleEnum cargo;

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
