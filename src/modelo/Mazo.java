package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Mazo {
    private Carta carta;
    private HashMap<Integer, Carta> listaCartas = new HashMap<>();
    //int key;
    public Mazo() {
    }
    public Mazo(HashMap<Integer, Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }
    public HashMap<Integer, Carta> getListaCartas() {
        return listaCartas;
    }



    public Mazo(Carta carta) {
        this.carta = carta;
    }

    public void agregarCarta(Carta carta){

        listaCartas.put(0,carta);
    }


    @Override
    public String toString() {
        return "Mazo{" +
                "listaCartas=" + listaCartas +
                '}';
    }
}
