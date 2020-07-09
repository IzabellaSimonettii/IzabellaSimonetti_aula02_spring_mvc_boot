package br.com.bossini.aula02_spring_mvc_boot.controller;

import br.com.bossini.aula02_spring_mvc_boot.model.Veiculo;
import br.com.bossini.aula02_spring_mvc_boot.repository.VeiculoRepository;
import br.com.bossini.aula02_spring_mvc_boot.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping("/veiculos")
    public ModelAndView listarVeiculos() {

        ModelAndView mv = new ModelAndView ("lista_veiculos");
        List<Veiculo> veiculos = service.listarTodos();
        mv.addObject(new Veiculo());
        mv.addObject("veiculos", veiculos);
        return mv;
    }

    @PostMapping("/veiculos")
    public String salvar (Veiculo veiculo) {
        service.salvar(veiculo);
        return "redirect:/veiculos";
    }

}
