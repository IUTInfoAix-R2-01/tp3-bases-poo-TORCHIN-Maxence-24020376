package exoProf;

public class livre {
	private String name;
	private double price;
	private int quantite;
	
	public livre() {
		name = "titre";
		price = 2.50;
		quantite = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantite() {
		return quantite;
	}
}
