public class Main {
    public static void main(String[] args) {
        
        
        Guitarra guitarra1 = Guitarra.cloneDoModelo();
        System.out.println(guitarra1);

        Guitarra guitarra2 = Guitarra.cloneDoModelo();
        guitarra2.setModelo("Fender Stratocaster");
        guitarra2.setTipo("Elétrica");
        guitarra2.setCor("Azul");
        guitarra2.setPreco(2500.00);
        System.out.println(guitarra2);
    }
}
