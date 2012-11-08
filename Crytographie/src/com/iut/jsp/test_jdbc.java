package com.iut.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test_jdbc {

	private static void affiche(String message) {
		System.out.println(message);
	}

	public static void arret(String message) {
		System.err.println(message);
		System.exit(99);
	}

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		String requete = "";
		// chargement du pilote

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			arret("impossible de charger le pilote jdbc pour mysql");
		}

		// Connexion a la base de données
		affiche("connexion a la base de données");
		try {
			String DBurl = "jdbc:mysql://localhost/jsimpore";
			con = DriverManager.getConnection(DBurl, "jsimpore", "");
		} catch (Exception e) {
			// TODO: handle exception
			arret("COnnexion a la base de données impossible");
			arret(e.getMessage());
		}
		affiche("Creation d'un enregistrement");
		requete = "INSERT INTO personnel(nom) values('Nom3')";
		try {
			Statement stat = con.createStatement();
			int nbmaj = stat.executeUpdate(requete);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		affiche("Creation et execution de la requete");
		requete = "SELECT * FROM personnel";
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(requete);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
