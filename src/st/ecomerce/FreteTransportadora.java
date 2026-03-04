package st.ecomerce;

public class FreteTransportadora implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){
        return 12.00 + (1.50 + pesoKg) + (00.3 + distanciaKm);
    }

}
