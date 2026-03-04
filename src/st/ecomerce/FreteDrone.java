package st.ecomerce;

public class FreteDrone implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){

        if(distanciaKm > 5){
            System.out.println("Tipo de frete invalido para mais de 5km para o drone!");
            return -1.0;
        }
        if(pesoKg > 4){
            System.out.println("Tipo de frete invalido para mais de 4kg para o drone!");
            return -1.0;
        }

        return 25.00 + (4.00 + distanciaKm);


    }


}
