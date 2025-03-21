public class ReceitaFederal {
    private static double totalImposto = 0;

    public static void registrarImposto(double valor) {
        totalImposto += valor;
    }

    public static double consultarImpostoDevido() {
        return totalImposto;
    }
}
