package st.ecomerce;

public class FreteMotoboy implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){
        return 8.00 + (2.00 + distanciaKm);
    }

}
