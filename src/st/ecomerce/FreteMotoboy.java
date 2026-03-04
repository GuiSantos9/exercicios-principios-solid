package st.ecomerce;

public class FreteMotoboy implements ITipoFrete{

    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm){

        if(distanciaKm > 15){
            System.out.println("Tipo de frete invalido para mais de 15km para o motoboy!");
            return -1.0;
        }
        if(pesoKg > 15){
            System.out.println("Tipo de frete invalido para mais de 10kg para o motoboy!");
            return -1.0;
        }

        return 8.00 + (2.00 + distanciaKm);


    }

}
