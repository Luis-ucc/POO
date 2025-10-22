public class Main {
    public static void main(String[] args) {
        Cancion rock = new CancionRock("Bohemian Rhapsody", "Queen", 354, "Progresivo");
        Cancion pop = new CancionPop("Blinding Lights", "The Weeknd", 200, true);
        Cancion normal = new Cancion("Imagine", "John Lennon", 183);

        System.out.println("Reproduciendo canciones:\n");
        
        rock.reproducir();
        System.out.println();
        pop.reproducir();
        System.out.println();
        normal.reproducir();    
    }
}