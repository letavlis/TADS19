public class Mp3Player implements Tocador{
  
        private String musica;

        public Mp3Player(String musica){
                this.musica = musica;
        }

        @Override
        public int play(){
                System.out.println("Tocando o MP3..."+musica);
                return 0;
        }
        
        @Override
        public void pause(){
                System.out.println("Pausando o MP3..."+musica);
        }
}
