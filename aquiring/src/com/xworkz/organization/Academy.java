package com.xworkz.organization;

public class Academy extends Organization {
    public Academy() {
        System.out.println("no-arg constructor of Academy");
    }

    public void teach() {
        System.out.println("Running teach in Academy");

        Organization org1 = new Organization();
        Organization org2 = new Academy();

        Academy academy1 = new Academy();
}

}
