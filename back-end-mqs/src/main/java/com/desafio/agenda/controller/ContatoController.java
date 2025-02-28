import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/contatos")
@Validated
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public List<Contato> listar() {
        return contatoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> obter(@PathVariable Long id) {
        Contato contato = contatoService.obter(id);
        return contato != null ? ResponseEntity.ok(contato) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Contato> criar(@Valid @RequestBody Contato contato) {
        Contato contatoSalvo = contatoService.salvar(contato);
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoSalvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contato> atualizar(@PathVariable Long id, @Valid @RequestBody Contato contato) {
        Contato contatoExistente = contatoService.obter(id);
        if (contatoExistente == null) {
            return ResponseEntity.notFound().build();
        }
        contato.setId(id);
        Contato contatoAtualizado = contatoService.salvar(contato);
        return ResponseEntity.ok(contatoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (contatoService.obter(id) == null) {
            return ResponseEntity.notFound().build();
        }
        contatoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
