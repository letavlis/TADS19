public class VideoCassete implements Tocador{
        
        private String filme;

        public VideoCassete(String filme){
                this.filme = filme;
        }

        @Override
        public int play(){
                System.out.println("Reproduzindo o filme..."+filme);
                return 0;
        }

        @Override
        public void pause(){
                System.out.println("Pausando o filme..."+filme);
        }
}
