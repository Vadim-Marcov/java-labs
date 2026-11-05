package org.example;

public class App 
{
    public static void main( String[] args )
    {
        CelestialBody[] bodies = {
                new Planet("Земля", 5.9, 1274, 1),
                new Planet("Марс", 6.3, 677, 2),
                new Planet("Юпитер", 1.8, 539, 3),
                new Star("Солнце", 1.9, 1391, 5000),
                new Star("Сириус", 4.0, 2384, 9999)
        };

        for (int i = 0; i < bodies.length; i++) {
            bodies[i].displayInfo();
            System.out.println();
        }
    }
}
