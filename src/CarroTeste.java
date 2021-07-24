public class CarroTeste  {
    public static void main(String[] args) {

        Carro carro = new Carro();


        System.out.println(carro.getNomeCarroP() + " tem espaço para " + carro.getTamanhoCarroP() + " pessoas");
        System.out.println(carro.getNomeCarroM() + " tem espaço para " + carro.getTamanhoCarroM() + " pessoas");
        System.out.println(carro.getNomeCarroG() + " tem espaço para " + carro.getTamanhoCarroG() + " pessoas");
        System.out.println(carro.entraNoCarroP());
        System.out.println(carro.entraNoCarroM());
        System.out.println(carro.entraNoCarroG());
        System.out.println(carro.saiDoCarroP());
        System.out.println(carro.saiDoCarroM());
        System.out.println(carro.saiDoCarroG());




    }
}
