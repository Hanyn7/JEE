package test;
import java.util.List;

import metier.MetierImpl;
import metier.Produit;

public class TestMetie {

	public static void main(String[] args) {
			MetierImpl metier= new MetierImpl();
			List<Produit> prods = metier.getProduitsParMotCle("impri");
			for (Produit p : prods)
			System.out.println(p.getNomProduit());
			}

	}

