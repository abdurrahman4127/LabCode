package Lab_5.FromClass;

public class Tiger implements Animal {
    @Override
    public void animalSound()
    {
        System.out.println("Halumm!!!");
    }

    @Override
    public void run()
    {
        System.out.println("Run Tiger Run");
    }
}
