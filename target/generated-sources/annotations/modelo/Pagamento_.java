package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-29T18:44:06")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Float> codOrgaoSuperior;
    public static volatile SingularAttribute<Pagamento, Float> codUnidadeGestoraPagadora;
    public static volatile SingularAttribute<Pagamento, String> valor;
    public static volatile SingularAttribute<Pagamento, Float> codOrgaoPagador;
    public static volatile SingularAttribute<Pagamento, String> nomeOrgaoPagador;
    public static volatile SingularAttribute<Pagamento, Integer> id;
    public static volatile SingularAttribute<Pagamento, Integer> identificadorProcessoViagem;
    public static volatile SingularAttribute<Pagamento, String> nomeOrgaoSuperior;
    public static volatile SingularAttribute<Pagamento, String> tipoPagamento;
    public static volatile SingularAttribute<Pagamento, String> nomeUnidadeGestoraPagadora;

}