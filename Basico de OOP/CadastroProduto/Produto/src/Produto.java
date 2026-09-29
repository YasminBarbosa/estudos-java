class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int codigo;

    //Construtor
    public Produto() {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuandidadeEstoque(quantidadeEstoque);
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    public int getCod(){
        return codigo;
    }

    //Setters
    public void setNome(String nome) {
            if (nome.length() < 3){
            System.out.println("Número de caracteres insuficientes");
        }
        else {
            this.nome = nome;
        }
    }

    public void setPreco(double preco){
        if (preco <= 0.00) {
            System.out.println("Insira um valor válido!")
        }
        else{
            this.preco = preco;
        }
    }

    public void setQuandidadeEstoque(int quantidadeEstoque) {
        if (preco <= 0) {
            System.out.println("Insira um valor válido!")
        }
        else{
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    //public getPrecoComDesconto(double percentual) {
    // criar método
    //}
}