package io.codelex.oop.computers;

public class TestComputers {
    public static void main(String[] args) {
        Computer macbook = new Computer("M2", 24, "Apple M2", "Apple", "MacBook Pro");
        Computer asus = new Computer("AMD RYZEN 5", 8, "AMD RADEON", "Asus", "VivoBook");
        Computer msi = new Computer("INTEL CORE i7", 16, "NVIDIA GFORCE RTX 3070TI", "MSI", "Raider");

        System.out.println("MacBook Pro: " + macbook);
        System.out.println("Asus VivoBook: " + asus);
        System.out.println("MSI Raider: " + msi);

        System.out.println("\nHashcode of MacBook Pro: " + macbook.hashCode());
        System.out.println("Hashcode of Asus VivoBook: " + asus.hashCode());
        System.out.println("Hashcode of MSI Raider: " + msi.hashCode());

        System.out.println("\nAre MacBook Pro and MSI Raider the same? " + macbook.equals(msi));
        System.out.println("Then maybe Asus VivoBook is the same as MSI Raider? " + asus.equals(msi));

        System.out.println("\nHei, let's update this VivoBook with new RAM");
        asus.setRam(16);
        System.out.println("New specs for Asus VivoBook: " + asus);

        Laptop air = new Laptop("M1", 8, "Apple M1", "Apple", "MacBook Air", "18 hours");
        System.out.println("\nMacBook Air: " + air);
    }
}
