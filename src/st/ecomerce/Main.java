package st.ecomerce;

public class Main {
    public static void main(String[] args) {

        ITipoFrete frete = new FreteTransportadora();
        FreteCorreios freteCorreios = new FreteCorreios();
        FreteMotoboy freteMotoboy = new FreteMotoboy();
        FreteDrone freteDrone = new FreteDrone();

        System.out.println(freteCorreios.calcularFrete(10.0, 35));
        System.out.println(CalculadoraFrete.calculaFrete(10.0, 35, frete));
        System.out.println(freteMotoboy.calcularFrete(10.0, 35));
        System.out.println(freteDrone.calcularFrete(10.0, 35));

        System.out.println(frete.calcularFrete(10.00,10));
    }
}
