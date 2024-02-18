import Students.GryffindorStudent;

public class Main {
    public static void main(String[] args) {

        GryffindorStudent harryPotter = new GryffindorStudent
                (40,100,90,50,100);
        GryffindorStudent Ron = new GryffindorStudent
                (40,100,90,63,100);

        harryPotter.compare(Ron);




    }
}