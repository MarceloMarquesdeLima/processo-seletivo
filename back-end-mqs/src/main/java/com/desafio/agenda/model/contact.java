import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @NotNull
    private String nome;

    @Pattern(regexp = "\\d{11}", message = "CPF inválido")
    private String cpf;

    @Pattern(regexp = "\\d{14}", message = "CNPJ inválido")
    private String cnpj;

    private String cep;

    private Double latitude;
    private Double longitude;

}
