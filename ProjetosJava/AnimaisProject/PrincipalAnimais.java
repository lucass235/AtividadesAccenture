public class PrincipalAnimais {
    public static void main(String[] args) {
        Gato cat = new Gato("Betinho", 2);
        Dog dog = new Dog("Cholo", 3);

        cat.emetirSom();
        dog.emetirSom();
    }
}
