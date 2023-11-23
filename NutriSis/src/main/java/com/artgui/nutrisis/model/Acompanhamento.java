package com.artgui.nutrisis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Acompanhamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dataInicio;
    private String dataFinal;

    @OneToMany(mappedBy = "acompanhamento", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<RegistroDiario> registrosDiarios;

    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne()
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;

    public Acompanhamento(
            String dataInicio,
            String dataFinal
    ){
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public Acompanhamento(
            String dataInicio,
            String dataFinal,
            List<RegistroDiario> registrosDiarios,
            Cliente cliente,
            Nutricionista nutricionista
    ) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.registrosDiarios = registrosDiarios;
        this.cliente = cliente;
        this.nutricionista = nutricionista;
    }
    
    public void copy(Acompanhamento outro){
        this.id = outro.getId();
        this.dataInicio = outro.getDataInicio();
        this.dataFinal = outro.getDataFinal();
        this.registrosDiarios = outro.getRegistrosDiarios();
        this.cliente = outro.getCliente();
        this.nutricionista = outro.getNutricionista();
    }
    
    public void adicionarRegistroDiario(RegistroDiario registroDiario){
        this.registrosDiarios.add(registroDiario);
    }
    
    public void removerRegistroDiario(RegistroDiario registroDiario){
        this.registrosDiarios.remove(registroDiario);
    }        
    
}