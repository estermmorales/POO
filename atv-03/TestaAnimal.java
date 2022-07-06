public class TestaAnimal {
    public static void main(String[] args){
        Animal animal1 = new Animal(5, "Cachorro", 25, 15, "Marrom");
        Animal animal2 = new Animal(5, "Cachorro", 25, 15, "Marrom");
        System.out.println(animal1.equals(animal2));
        animal2.setCor("Amarelo");
        animal2.setLargura(30);
        animal2.setPeso(8);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1);
        System.out.println(animal2);
    }
}
