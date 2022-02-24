package modelo;

import java.util.Objects;


public class Carta {

    private int numero;
    private String palo;

    public Carta() {
    }

    public Carta(int numero, int palo) {
        this.numero = numero;
        if(palo == 1){
            this.palo = "espada";
        }else if(palo ==2){
            this.palo ="copa";
        }else if(palo ==3) {
            this.palo = "basto";
        }else if(palo ==4) {
            this.palo = "oro";
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }

}
