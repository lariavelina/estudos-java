public enum operacao {
    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/"),
    POTENCIACAO("pow");

    private String simbolo;

    operacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}