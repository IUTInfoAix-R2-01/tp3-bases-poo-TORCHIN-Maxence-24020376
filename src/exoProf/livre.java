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
	public livre (String name, double price,int quantite) {
		this.name = name ;
		this.price = price ;
		this.quantite = quantite ;
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public String toString() {
        return "[nom = " + name + ", prix = " + price + ", quantite = " + quantite +"]";
    }
}
