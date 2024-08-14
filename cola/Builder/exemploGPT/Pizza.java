public class Pizza {
    private String tamanho;
    private String massa;
    private boolean queijoExtra;
    private boolean tomate;
    private boolean bacon;

    private Pizza(PizzaBuilder builder) {
        this.tamanho = builder.tamanho;
        this.massa = builder.massa;
        this.queijoExtra = builder.queijoExtra;
        this.tomate = builder.tomate;
        this.bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza [tamanho=" + tamanho + ", massa=" + massa + 
               ", queijoExtra=" + queijoExtra + ", tomate=" + tomate + 
               ", bacon=" + bacon + "]";
    }

    // Classe Builder
    public static class PizzaBuilder {
        private String tamanho;
        private String massa;
        private boolean queijoExtra;
        private boolean tomate;
        private boolean bacon;

        public PizzaBuilder(String tamanho, String massa) {
            this.tamanho = tamanho;
            this.massa = massa;
        }

        public PizzaBuilder adicionarQueijoExtra(boolean queijoExtra) {
            this.queijoExtra = queijoExtra;
            return this;
        }

        public PizzaBuilder adicionarTomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public PizzaBuilder adicionarBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
