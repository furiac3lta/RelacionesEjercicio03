package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Mazo {
    Carta carta = new Carta();
    private HashMap<Integer, Carta> listaCartas = new HashMap<>();
    int key;
    public Mazo() {
    }
    public Mazo(HashMap<Integer, Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }
    public HashMap<Integer, Carta> getListaCartas() {
        return listaCartas;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public Mazo(Carta carta) {
        this.carta = carta;
    }

    public void agregarCarta(Carta carta){
        key = 0;
        listaCartas.put(0,carta);
    }


    @Override
    public String toString() {
        return "Mazo{" +
                "listaCartas=" + listaCartas +
                '}';
    }
}
