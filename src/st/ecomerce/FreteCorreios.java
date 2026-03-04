package st.ecomerce;

public class FreteCorreios implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){

        if(pesoKg < 30){
            System.out.println("Tipo de Frete Invalido para encomendas com mais de 30kg!");
            return -1.0;
        }

        return 20.00 + (1.00 + pesoKg) + (0.03 + distanciaKm);
    }

}
