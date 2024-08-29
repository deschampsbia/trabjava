abstract class Animal {

    private double tamanho;
    private double peso;
    private int idade;

    public void fazerBarulho() {
        System.out.println("Animal fazendo barulho.");
        //corpo do método fazerBarulho () - classe Animal
    }
    public void vaguear() {
        System.out.println("Animal vagueando...");
        //corpo do método vaguear() - classe Animal
    }
    public void comer() {
        System.out.println("Animal comendo...");
    }
    public void dormir() {
        System.out.println("Animal dormindo");
    }

//getter setter
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //outros métodos

    //métodos de acesso 


}