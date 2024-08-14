public class PrototypePadraoExemplo {
    public static void main(String[] args) {
        Carro carroOriginal = new CarroBasico("Sedan", "Preto");

        // Clonando o carroOriginal
        Carro carroClonado = carroOriginal.clone();
        carroClonado.exibir();

        // Modificando o clone
        ((CarroBasico) carroClonado).setCor("Vermelho");
        carroClonado.exibir();
    }
}


/*Explicação
Interface Carro: Define o método clone() para criar uma cópia do objeto e exibir() para mostrar as características do carro. A interface também estende Cloneable, uma marcação necessária para usar o método clone().

Classe CarroBasico: Implementa a interface Carro e define os detalhes de clonagem. A classe CarroBasico contém atributos como modelo e cor, que são clonados quando o método clone() é chamado.

Método clone(): Este método cria e retorna uma cópia do objeto atual. Aqui, usamos o método super.clone() para realizar a clonagem real.

Classe PrototypePadraoExemplo: Demonstra o uso do padrão Prototype. Cria um carro original, clona-o e depois faz uma modificação no clone, mostrando como o clone e o original podem ter variações. */