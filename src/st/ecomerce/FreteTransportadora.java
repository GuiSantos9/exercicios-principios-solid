package st.ecomerce;

public class FreteTransportadora implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){

        Double frete = 12.00 + (1.50 + pesoKg) + (00.3 + distanciaKm);

        if(pesoKg > 50) {
            return frete * 0.9;
        }

        return frete;
    }

}
