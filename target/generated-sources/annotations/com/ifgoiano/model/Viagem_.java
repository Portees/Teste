package com.ifgoiano.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-09T15:11:33")
@StaticMetamodel(Viagem.class)
public class Viagem_ { 

    public static volatile SingularAttribute<Viagem, String> cpfViajante;
    public static volatile SingularAttribute<Viagem, String> motivo;
    public static volatile SingularAttribute<Viagem, String> periodoDataFim;
    public static volatile SingularAttribute<Viagem, Float> valorOutrosGastos;
    public static volatile SingularAttribute<Viagem, Integer> identificadorProcessoViagem;
    public static volatile SingularAttribute<Viagem, Float> codOrgaoSuperior;
    public static volatile SingularAttribute<Viagem, String> nomeOrgaoSolicitante;
    public static volatile SingularAttribute<Viagem, String> nomeViajante;
    public static volatile SingularAttribute<Viagem, String> periodoDataInicio;
    public static volatile SingularAttribute<Viagem, String> destinos;
    public static volatile SingularAttribute<Viagem, Float> valorDiarias;
    public static volatile SingularAttribute<Viagem, Float> valorPassagens;
    public static volatile SingularAttribute<Viagem, Integer> id;
    public static volatile SingularAttribute<Viagem, String> nomeOrgaoSuperior;
    public static volatile SingularAttribute<Viagem, String> cargoViajante;

}