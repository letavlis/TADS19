public class MainOutOfBounds {
    public static void main(String[] args) {
        int[] vetor = new int[] {1,2,3,4};
        try {
            for (int i = 0; i <= 4; i++){
                System.out.println("vetor["+i+"]: "+vetor[i]);
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Ocorreu uma exceção!! "+e.getMessage());
        }

        System.out.println("Fim..");
    }
}
