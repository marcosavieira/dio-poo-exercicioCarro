import javax.swing.*;

public class Carro<tamanhoCarroP> {

    private String nomeCarroP = "Carro Pequeno";
    private String nomeCarroM = "Carro Medio";
    private String nomeCarroG = "Carro Grande";
    private Integer tamanhoCarroP = 4;
    private Integer tamanhoCarroM = 7;
    private Integer tamanhoCarroG = 12;

    public String getNomeCarroP(){return nomeCarroP;}
    public String getNomeCarroM(){return nomeCarroM;}
    public String getNomeCarroG(){return nomeCarroG;}
    public Integer getTamanhoCarroP(){return tamanhoCarroP ;}
    public Integer getTamanhoCarroM(){return tamanhoCarroM ;}
    public Integer getTamanhoCarroG(){return tamanhoCarroG ;}

    public String entraNoCarroP() {
        if (tamanhoCarroP > 0) {
            System.out.println("Entrou no " + nomeCarroP);
            return "Agora " + nomeCarroP + " tem espaço para  " + (tamanhoCarroP -= 1) + " pessoas";
        } else
        return "O carro " + nomeCarroP + " já está cheio!";
    }

    public String entraNoCarroM() {
        if (tamanhoCarroM > 0) {
            System.out.println("Entrou no " + nomeCarroM);
            return "Agora " + nomeCarroM + " tem espaço para  " + (tamanhoCarroM -= 1) + " pessoas";
        } else
            return "O carro " + nomeCarroM + " já está cheio!";
    }

    public String entraNoCarroG() {
        if (tamanhoCarroG > 0) {
            System.out.println("Entrou no " + nomeCarroG);
            return "Agora " + nomeCarroG + " tem espaço para  " + (tamanhoCarroG -= 1) + " pessoas";

        } else
            return "O carro " + nomeCarroG + " já está cheio!";
    }

    public String saiDoCarroP() {
        if (tamanhoCarroP < 4) {
            System.out.println("Saiu do " + nomeCarroP);
            return "Agora " + nomeCarroP + " tem espaço para  " + (tamanhoCarroP += 1) + " pessoas";
        } else
            return "O " + nomeCarroP + " já está vazio!";
    }

    public String saiDoCarroM() {
        if (tamanhoCarroM < 7) {
            System.out.println("Saiu do " + nomeCarroM);
            return "Agora " + nomeCarroM + " tem espaço para  " + (tamanhoCarroM += 1) + " pessoas";

        } else
            return "O " + nomeCarroM + " já está vazio!";
    }

    public String saiDoCarroG() {
        if (tamanhoCarroG < 12) {
            System.out.println("Saiu do " + nomeCarroG);
            return "Agora " + nomeCarroG+ " tem espaço para  " + (tamanhoCarroG += 1) + " pessoas";
        } else
            return "O " + nomeCarroG + " já está vazio!";
    }

}
