package Singleton;

import java.util.ArrayList;
import java.util.List;


public class Undo {
    private static Undo instance = null;
    private List<String> pedidos;

    //creo un constructor privado y un método static luego que permite obtener una unica instacia
    //con el patron Singleton
    private Undo() {
        pedidos = new ArrayList<String>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }
    
    //los métodos para añadir, eliminar y listar
    public void addPedido(String pedido) {
        pedidos.add(pedido);
    }

    public void removePedido() {
        if (pedidos.size() > 0) {
            pedidos.remove(pedidos.size() - 1);
        }
    }

    public void listaPedidos() {
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}