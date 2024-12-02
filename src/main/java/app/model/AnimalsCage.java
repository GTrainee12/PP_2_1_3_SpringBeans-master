package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {


    private Animal animal1;
    private Animal animal2;
    private Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("Dog") Animal animal1,@Qualifier("Cat") Animal animal2,Timer timer) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.timer = timer;

    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString() + ", " + animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
