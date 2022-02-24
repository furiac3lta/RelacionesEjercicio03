package services;

import modelo.Carta;
import modelo.Mazo;

import java.security.Key;
import java.util.*;


public class MazoServices {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Carta> mazo = new HashMap<>();
    Map<Integer, Carta> mazoMezclado = new LinkedHashMap<>();
    Map<Integer, Carta> cartaMonton = new HashMap<>();
    int k = 0;
    int cartaElegida = 0;
    int cartaSiguiente;


    public MazoServices() {
    }
    public Map<Integer, Carta> crearMazo() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j != 8 && j != 9) {
                    k++;
                    Carta carta = new Carta(j, i);
                    mazo.put(k, carta);
                }
            }
        }
        System.out.println(mazo.size());
        return mazo;
    }
    public void mostrar() {
        for (Map.Entry<Integer, Carta> aux : mazo.entrySet()) {
            Integer key = aux.getKey();
            Carta value = aux.getValue();
            System.out.println("key: " + key + " value: " + value);
        }
    }

    public Map<Integer, Carta> barajar() {
        System.out.println("vamos a barajar las cartas");
        List<Integer> list = new ArrayList<>(mazo.keySet());
        Collections.shuffle(list);
        list.forEach(k -> mazoMezclado.put(k, mazo.get(k)));
        for (Map.Entry<Integer, Carta> aux : mazoMezclado.entrySet()) {
            Integer key = aux.getKey();
            Carta value = aux.getValue();
            System.out.println("key: " + key + " value: " + value);
        }
        return mazoMezclado;
    }
    //quiero poder imprimir los diferentes mazos de cartas creados
public void imprimir(){
    for (Map.Entry<Integer, Carta> aux : mazo.entrySet()) {
        Integer key = aux.getKey();
        Carta value = aux.getValue();
        System.out.println("key: " + key + " value: " + value);
    }
}
    public void siguienteCarta() {
        System.out.println("metodo siguiente carta");
        System.out.println("Elije una carta -->");
        cartaElegida = scanner.nextInt();
        for (Map.Entry<Integer, Carta> aux : mazo.entrySet()) {
            cartaSiguiente = cartaElegida + 1;
            if (cartaSiguiente == aux.getKey()) {
                System.out.println("la siguiente carta es:");
                System.out.println(aux.toString());
            }
        }
    }
    public void cartasDisponibles() {
        System.out.println("saca una carta");
        int carta = scanner.nextInt();
        mazo.remove(carta);
        System.out.println("quedan : " + mazo.size());
            for (Map.Entry<Integer, Carta> aux : mazo.entrySet()) {
                Integer key = aux.getKey();
                Carta value = aux.getValue();
                System.out.println("key: " + key + " value: " + value);
            }

        }
        public void darCartas(){
        List<Integer> lista = new ArrayList<>(mazoMezclado.keySet());
        List<Carta> listaC = new ArrayList<>(mazoMezclado.values());
            System.out.println("metodo darCartas");
            System.out.println("Cuantas cartas desea");
            int carta = scanner.nextInt();
            System.out.println("las cartas seleccionadas son");
           for (int i = 1; i <= carta; i++) {
                int key = lista.get(i);
                System.out.println("key: " + key + " Carta: " + listaC.get(i));
                cartaMonton.put(key, mazoMezclado.get(key));
                mazoMezclado.remove(key);
            }
            System.out.println("quedan : " + mazoMezclado.size());
            for (Map.Entry<Integer, Carta> aux : mazoMezclado.entrySet()) {
                Integer key = aux.getKey();
                Carta value = aux.getValue();
                System.out.println("key: " + key + " value: " + value);
            }
            System.out.println("Desea sacar mas cartas ?");
            System.out.println("1 - si || 2 - no");
            int respuesta = scanner.nextInt();
            if(respuesta == 1){
                System.out.println("cuantas cartas desea sacar");
                int c = scanner.nextInt();
                if(mazoMezclado.size()<c){
                    System.out.println("no se puede entregar esa cantidad de cartas");
                }else{
                    darCartas();
                }
            }
        }
        public void cartasMonton(){
            System.out.println("Metodo cartas Monton");
            for (Map.Entry<Integer, Carta> aux : cartaMonton.entrySet()) {
                Integer key = aux.getKey();
                Carta value = aux.getValue();
                System.out.println("key: " + key + " value: " + value);
            }
        }
        public void mostrarBaraja(){
            System.out.println("quedan : " + mazoMezclado.size());
            for (Map.Entry<Integer, Carta> aux : mazoMezclado.entrySet()) {
                Integer key = aux.getKey();
                Carta value = aux.getValue();
                System.out.println("key: " + key + " value: " + value);
            }
        }

        public void menu(){
            int opcion =0;
            int menu;
            do{
                System.out.println("Menu");
                System.out.println("1 - Crear mazo de cartas ");
                System.out.println("2 - Barajar mazo de cartas");
                System.out.println("3 - Siguiente Carta");
                System.out.println("4 - Cartas disponibles");
                System.out.println("5 - Dar Cartas");
                System.out.println("6 - Cartas monton");
                System.out.println("7 - Mostrar cartas");
                menu = scanner.nextInt();
                switch (menu){
                    case 1:
                        crearMazo();
                        mostrar();
                        break;
                    case 2:
                        barajar();
                        break;
                    case 3:
                        siguienteCarta();
                        break;
                    case 4:
                        cartasDisponibles();
                        break;
                    case 5:
                        darCartas();
                        break;
                    case 6:
                        cartasMonton();
                        break;
                    case  7:
                        mostrarBaraja();
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
                System.out.println("desea continuar con el programa");
                System.out.println("1 - para si");
                System.out.println("0 - para no");
                opcion = scanner.nextInt();

            }while (opcion == 1);
            System.out.println("Saliendo ...");
        }
    }





