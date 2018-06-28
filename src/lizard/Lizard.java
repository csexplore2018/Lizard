
package lizard;


public class Lizard extends Animal {
    
    private String name = "Lizard";
    public String food = "Reptile Munchies";
    
    
    
    
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        a.talk();
        
        Salamander s = new Salamander();
        System.out.println(s.name);
        s.talk();
    }
    
}

class Animal {
    
    public String name = "Animal";
    public String food = "Food";
    
    public void talk(){
            System.out.println("trill");
        }
}

class Liizard extends Animal {

    public void talk() {
        System.out.println("fthththththrill");
    }

}

class Salamander extends Lizard{
    public String name = "Salamander";
    public String color = "Red";
}