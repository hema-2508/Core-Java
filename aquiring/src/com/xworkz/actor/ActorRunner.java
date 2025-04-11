package com.xworkz.actor;

public class ActorRunner {
    public static void main(String[] args) {

        System.out.println("\n Human data type");
        Human human = new Human();
        human.breathe();

        System.out.println("\n Person datatype");
        Person person = new Person();
        person.express();
        person.breathe();

        System.out.println("\n Actor datatype");
        Actor actor = new Actor();
        actor.perform();
        actor.express();
        actor.breathe();
    }

}
