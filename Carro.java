public class Carro {
    private String cor;
    private String marca;

    public void exibirMensagem(){
        System.out.printf("\nEste carro é %s e da marca %s", cor, marca);
    }

    public void acelerar(){
        System.out.printf("\nO carro %s está acelerando!", cor);
    }

    public void freiar(){
        System.out.printf("\nO carro %s está freiando!", cor);
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setMarca( String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }
    // MÉTODO CONSTRUTOR
    /*public Carro(String cor, String marca){
        this.cor = cor;
        this.marca = marca;
    } */
}