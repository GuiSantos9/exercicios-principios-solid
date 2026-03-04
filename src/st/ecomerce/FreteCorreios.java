package st.ecomerce;

public class FreteCorreios implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){
        return 20.00 + (1.00 + pesoKg) + (0.03 + distanciaKm);
    }

}
