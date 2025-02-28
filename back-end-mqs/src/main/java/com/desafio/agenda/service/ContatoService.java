import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listar() {
        return contatoRepository.findAll();
    }

    public Contato obter(Long id) {
        return contatoRepository.findById(id).orElse(null);
    }

    @Transactional
    public Contato salvar(Contato contato) {
        return contatoRepository.save(contato);
    }

    @Transactional
    public void excluir(Long id) {
        contatoRepository.deleteById(id);
    }
}
