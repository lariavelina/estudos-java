void main() {
    var historicoDeOperacoes = new ArrayList<String>();

    var calculos = new EnumMap<operacao, BiFunction<Float, Float, Double>>(operacao.class);

    calculos.put(operacao.SOMA, (n1, n2) -> (double) (n1 + n2));
    calculos.put(operacao.SUBTRACAO, (n1, n2) -> (double) (n1 - n2));
    calculos.put(operacao.MULTIPLICACAO, (n1, n2) -> (double) (n1 * n2));
    calculos.put(operacao.DIVISAO, (n1, n2) -> (double) (n1 / n2));
    calculos.put(operacao.POTENCIACAO, (n1, n2) -> Math.pow(n1, n2));
    while(true) {
            IO.println("""
                     Calculadora v1.0, digite .exit para sair, ou enter para continuar.
                     """);
            var comando = IO.readln();
            if(comando.equals(".exit"))
                System.exit(0);
            else if(comando.equals("-h")) {
                IO.println("Histórico: ");
                for (var operacao : historicoDeOperacoes)
                    IO.println(operacao);
            }

            else if(comando.isEmpty()) {
                IO.println("Digite o primeiro número:");
                var n1 = IO.readln();
                IO.println("Digite o segundo número:");
                var n2 = IO.readln();
                IO.println("""
                    Digite a operação desejada:
                    + | Soma
                    - | Subtração
                    * | Multiplicação
                    / | Divisão
                    pow | Elevação
                    """);
                var simbolo = IO.readln();

                var num1 = Float.parseFloat(n1);
                var num2 = Float.parseFloat(n2);


                operacao operacaoEscolhida = switch (simbolo) {
                    case "+" -> operacao.SOMA;
                    case "-" -> operacao.SUBTRACAO;
                    case "*" -> operacao.MULTIPLICACAO;
                    case "/" -> operacao.DIVISAO;
                    case "pow" -> operacao.POTENCIACAO;
                    default -> null;
                };

                if (operacaoEscolhida == null) {
                    IO.println("Operação inválida");
                } else if (operacaoEscolhida == operacao.DIVISAO && num2 == 0) {
                    IO.println("Divisão por zero é inválida");
                } else {
                    var resultado = calculos.get(operacaoEscolhida).apply(num1, num2);

                    IO.println(resultado);

                    historicoDeOperacoes.add(
                            num1 + " " + simbolo + " " + num2 + " = " + resultado
                    );
                }
            }
    }
}