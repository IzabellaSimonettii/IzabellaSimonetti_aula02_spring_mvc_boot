package br.com.bossini.aula02_spring_mvc_boot.model;

import br.com.bossini.aula02_spring_mvc_boot.utils.CalculadoraUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DecimalFormat;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue
    private long id;

    private String marca;
    private String modelo;
    private String anoFabricacao;
    private String cor;
    private Double litro;
    private Double km;
    private Double autonomia;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getLitro() {
        return litro;
    }

    public void setLitro(Double litro) {
        this.litro = litro;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Double getAutonomia() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formatedAutonomia = decimalFormat.format(autonomia);
        return Double.parseDouble(formatedAutonomia);
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }
}
