package dev.neuroncrafters.scispread_api.Databases;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_databases")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class DatabasesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String Titulo;

    @NotBlank
    @Column(nullable = false)
    private String Descricao;

    @NotBlank
    @Column(nullable = false)
    private String LinkForms;
}
