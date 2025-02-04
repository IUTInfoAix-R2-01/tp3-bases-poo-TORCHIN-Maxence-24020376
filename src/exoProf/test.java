package exoProf;

public class test {
    public static void main(String[] args) {
        livre l1 = new livre("Jurassic Park", 21.50, 500);
        System.out.println("Nom : " + l1.getName());
        System.out.println("Prix : " + l1.getPrice());
        System.out.println("Quantité : " + l1.getQuantite());
        System.out.println("=============================");
        livre l2 = new livre("1984", 15.99, 300);
        System.out.println("Nom : " + l2.getName());
        System.out.println("Prix : " + l2.getPrice());
        System.out.println("Quantité : " + l2.getQuantite());
        System.out.println("=============================");
        livre l3 = new livre("Harry Potter et la pierre philosophale", 25.00, 1000);
        System.out.println("Nom : " + l3.getName());
        System.out.println("Prix : " + l3.getPrice());
        System.out.println("Quantité : " + l3.getQuantite());
	}

}
