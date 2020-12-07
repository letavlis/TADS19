public class MainDivisionByZero {

    public static void main(String[] args) {
        int valor = 10;
        int divisor = 0;

        try {
            int resultado = valor/divisor;
            System.out.println("O resultado é: "+resultado);
        }catch(ArithmeticException e){
            System.out.println("Ocorreu uma exceção:/ by zero");
        }
        System.out.println("Fim...");
    }
}
