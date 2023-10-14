import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>(); 

    public ListaMovimientos() {
        movimientos.add(new Movimiento("Ala aural", 75, 20, Tipo.PSIQUICO));
        movimientos.add(new Movimiento("Arrumaco", 60, 30, Tipo.PSIQUICO));

        movimientos.add(new Movimiento("Canto ardiente", 80, 10, Tipo.FUEGO));
        movimientos.add(new Movimiento("Coraza trampa", 150, 40, Tipo.FUEGO));

        movimientos.add(new Movimiento("Terra Temblor", 60, 20, Tipo.TIERRA));
        movimientos.add(new Movimiento("Excavar", 80, 10, Tipo.TIERRA));

        movimientos.add(new Movimiento("Meteoros", 60, 20, Tipo.NORMAL));


    }

    public Movimiento buscarMovimientoPorNombre (String nombre) {
        for(Movimiento movimiento : movimientos) {
            if(movimiento.getNombre().equals(nombre)) {
                return movimiento;
            }
        }
        return null;
    }


    
}