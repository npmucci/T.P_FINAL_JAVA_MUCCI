package Enumeradores;

public enum HigieneEnum {
    BAÑARSE(20), LIMPIARSE(10);

    private int higiene;

    HigieneEnum(int higiene){ this.higiene = higiene;}

    public int getHigiene() {return this.higiene;}
}

