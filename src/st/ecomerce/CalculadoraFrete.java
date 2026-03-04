package st.ecomerce;

public class CalculadoraFrete {

    public static Double calculaFrete(Double pesoKm,
                                      Integer distanciaKm,
                                      ITipoFrete frete){

        return frete.calcularFrete(pesoKm,distanciaKm);

    }

}
