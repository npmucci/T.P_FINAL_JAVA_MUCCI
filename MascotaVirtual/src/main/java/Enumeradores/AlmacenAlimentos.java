package Enumeradores;

public enum AlmacenAlimentos {
    HAMBURGUESA(10), LECHUGA(15), ZANAHORIA(15), MANZANA(20), PESCADO(15), HELADO(5), GOLOSINA(5);

    private int energiaAportada;
    private int nivelHambre;

    AlmacenAlimentos(int energia) {
        this.energiaAportada = energia;
    }

    public int getEnergiaAportada() {
        return energiaAportada;
    }
}
