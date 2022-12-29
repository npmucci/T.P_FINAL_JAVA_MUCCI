package Enumeradores;

public enum EntretenimientosEnum {

    PASEAR(20), LEER(15), GIMNASIO(10), CANTAR(10), BAILAR(15);

    private int desaburrimiento;

    EntretenimientosEnum(int desaburrimiento){ this.desaburrimiento = desaburrimiento;}

    public int getDesaburrimiento() {
        return this.desaburrimiento;
    }
}
