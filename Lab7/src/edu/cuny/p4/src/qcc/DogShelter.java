package edu.cuny.p4.src.qcc;

public class DogShelter  extends AnimalShelter{
    public Animal getanimal(){
        System.out.println("Dogshelter method called");
        return new Dog();
    }
    
}
