package HomeWork;

public class Main{
    public static void main(String[] args){
        User user = new User("Abdula");
        user.report();
        user.save();
        Persister persister = new Persister(user);
        persister.save();
    }
}