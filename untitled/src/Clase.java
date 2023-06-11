class Clase {
    int i;
    String string = "string1";
    int entero;
    String string;

    public Clase(int i, String string) {
        this.i = i;
        this.entero = i;
        this.string = string;
    }

    public void modificaObjeto(int nuevo_int, String nuevo_string) {
        i = nuevo_int;
        string = nuevo_string;
    }

    @Override
    public String toString() {
        return "Objeto { i=" + i + ", a='" + string + "\'}";
        return "Objeto { i=" + entero + ", a='" + string + "\'}";
    }
}