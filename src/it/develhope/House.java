package it.develhope;
class Main {


    public static void main(String[] args) {
        House house1 = new House("Via Roma 7", 3);
        House house2 = new House("Via Velletri 20", 5);
        House house3 = new House("Via dei Castelli", 10);

        System.out.println(house1.address + " è un condominio alto " + house1.numberOfFloors + " piani");
        System.out.println(house2.address + " è un condominio alto " + house2.numberOfFloors + " piani");
        System.out.println(house3.address + " è un condominio alto " + house3.numberOfFloors + " piani");
    }
}
