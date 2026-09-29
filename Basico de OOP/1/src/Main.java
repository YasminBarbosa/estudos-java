public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Onix";
        carro1.cor = "Branco";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.modelo = "Monza";
        carro2.cor = "Vinho";
        carro2.ano = 1996;

        Carro carro3 = new Carro();
        carro3.modelo = "Opala";
        carro3.cor = "Preto";
        carro3.ano = 1980;

        System.out.println("1: " + "Modelo: " + carro1.modelo + "Cor: " + carro1.cor + "Ano: " + carro1.ano);
        System.out.println("2: " + "Modelo: " + carro2.modelo + "Cor: " + carro2.cor + "Ano: " + carro2.ano);
        System.out.println("3: " + "Modelo: " + carro3.modelo + "Cor: " + carro3.cor + "Ano: " + carro3.ano);
    }
}