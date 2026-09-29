class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    //Getters
    public String getTitular() {
        return titular;
    }

    public String getnumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("ERRO: Campo vazio! Insira um nome válido!");
        }
        else {
            this.titular = titular;
            System.out.println("Alterado titular com sucesso!");
        }
    }

    //public double depositar(double valor) {
    // TODO: CRIAR MÉTODO
    //}

    //public double sacar(double valor) {
    // TODO: CRIAR MÉTODO
    //}
}