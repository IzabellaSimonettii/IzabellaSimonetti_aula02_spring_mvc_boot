package br.com.bossini.aula02_spring_mvc_boot.service;

import br.com.bossini.aula02_spring_mvc_boot.model.Veiculo;
import br.com.bossini.aula02_spring_mvc_boot.repository.VeiculoRepository;
import br.com.bossini.aula02_spring_mvc_boot.utils.CalculadoraUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository repository;

    public void salvar(Veiculo veiculo) {
        veiculo.setAutonomia(CalculadoraUtils.calculaKMPorLitro(veiculo.getLitro(), veiculo.getKm()));
        repository.save(veiculo);
    }

    public List<Veiculo> listarTodos(){
        List<Veiculo> veiculos = repository.findAll();
        return veiculos;
    }

}
