public class BuilderPadraoExemplo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Grande", "Fina")
                        .adicionarQueijoExtra(true)
                        .adicionarTomate(true)
                        .adicionarBacon(false)
                        .build();

        System.out.println(pizza);
    }
}
