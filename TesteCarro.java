public class TesteCarro {
    public static void main(String[] args) {
    //EXERCÍCIO 1 - 2.4
        Carro carro1 = new Carro();
        carro1.setCor("Prata");
        carro1.setMarca("Hyundai");
        System.out.println("Este carro é " + carro1.getCor() + " da marca " + carro1.getMarca());
        carro1.acelerar();
        

        Carro carro2 = new Carro();
        carro2.setCor("Preto");
        carro2.setMarca("Ford");
        System.out.println("\nEste carro é " + carro2.getCor() + " da marca " + carro2.getMarca());
        carro2.freiar();
        

    //EXERCÍCIO 3 - 4: Usando o método Construtor
    /*  Carro carro1 = new Carro("Preto", "Ford");
        Carro carro2 = new Carro("Vermelho", "Chevrolet");
        
        carro1.exibirMensagem();
        carro1.freiar();

        carro2.exibirMensagem();
        carro2.acelerar();
    */
    }
}