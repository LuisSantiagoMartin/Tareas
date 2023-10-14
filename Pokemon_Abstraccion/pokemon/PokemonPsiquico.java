public class PokemoPsiquico extends Pokemon{    
    public PokemonPsiquico(String nombre, int nivel) {
        super(nivel, nombre, Tipo.PSIQUICO);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

    setMovimiento(0, listaMovimientos.buscarMovimientoPorNombre("Ala aural"));
    setMovimiento(1, listaMovimientos.buscarMovimientoPorNombre("Arrumaco"));
    setMovimiento(2, listaMovimientos.buscarMovimientoPorNombre("Terra temblor"));
    setMovimiento(3, listaMovimientos.buscarMovimientoPorNombre("Meteoros"));
    }


    
    @Override
    public double obtenerEfectividad (Pokemon pokemon) {
        double efectividad = 1.0;

        
        
        if(pokemon.getTipo() == Tipo.LUCHA) efectividad = 0.5;
        if(pokemon.getTipo() == Tipo.PSIQUICO) efectividad = 0.5;
        if(pokemon.getTipo() == Tipo.BICHO) efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.FANTASMA) efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.SINISESTRO) efectividad = 2.0;




        return efectividad;
    }
}