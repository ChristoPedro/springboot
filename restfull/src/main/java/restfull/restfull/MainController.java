package restfull.restfull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import restfull.restfull.entity.Pessoa;
import restfull.restfull.repository.PessoaRepository;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNovaPessoa (@RequestParam String nome, @RequestParam String email){
        Pessoa n = new Pessoa();
        n.setNome(nome);
        n.setEmail(email);
        pessoaRepository.save(n);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Pessoa> getAllPessoas(){
        return pessoaRepository.findAll();
    }
}
