public class Main{

        public static void main(String[] args){

                Tocador[] tocadores = new Tocador[2];

                tocadores[0] = new Mp3Player("Master of Puppets");
                tocadores[1] = new VideoCassete("O Poderoso Chefão");

                for(Tocador t:tocadores){
                        t.play();
                        t.pause();
                }
        }
}
