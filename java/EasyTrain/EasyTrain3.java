package fr.hecten.dao;

import fr.hecten.modele.Arret;
import fr.hecten.modele.Trajet;

import java.sql.*;
import java.util.ArrayList;

public class EasyTrain3 {

    private static final String url = "jdbc:mariadb://mysql-victor.melwig.alwaysdata.net:3306/victormelwig_easytrain";
    private static final String user = "397496";
    private static final String password = "SkaiMite83*";

    private Connection getConnexion() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    // Ajouter un trajet
    public boolean ajouterTrajet(Trajet trajet) {
        boolean succes = false;

        try (Connection conn = getConnexion()) {
            String sql = "INSERT INTO Trajet VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, trajet.getCode());
            pstmt.setTimestamp(2, Timestamp.valueOf(trajet.getTempsDepart()));
            pstmt.setTimestamp(3, Timestamp.valueOf(trajet.getTempsArrivee()));
            pstmt.setInt(4, trajet.getArretDepart().getId());
            pstmt.setInt(5, trajet.getArretArrivee().getId());

            if (pstmt.executeUpdate() == 1) {
                succes = true;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return succes;
    }

    // Récupérer un trajet par code
    public Trajet getTrajetByCode(String code) {
        Trajet trajet = null;

        try (Connection conn = getConnexion()) {
            String sql = "SELECT * FROM Trajet WHERE code = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, code);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                trajet = new Trajet();
                trajet.setCode(rs.getString("code"));
                trajet.setTempsDepart(rs.getTimestamp("temps_depart").toLocalDateTime());
                trajet.setTempsArrivee(rs.getTimestamp("temps_arrivee").toLocalDateTime());

                Arret depart = new Arret();
                depart.setId(rs.getInt("arret_depart_id"));
                trajet.setArretDepart(depart);

                Arret arrivee = new Arret();
                arrivee.setId(rs.getInt("arret_arrivee_id"));
                trajet.setArretArrivee(arrivee);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return trajet;
    }

    // Récupérer tous les trajets
    public ArrayList<Trajet> getAllTrajet() {
        ArrayList<Trajet> trajets = new ArrayList<>();

        try (Connection conn = getConnexion()) {
            String sql = "SELECT * FROM Trajet";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Trajet t = new Trajet();
                t.setCode(rs.getString("code"));
                t.setTempsDepart(rs.getTimestamp("temps_depart").toLocalDateTime());
                t.setTempsArrivee(rs.getTimestamp("temps_arrivee").toLocalDateTime());

                Arret d = new Arret();
                d.setId(rs.getInt("arret_depart_id"));
                t.setArretDepart(d);

                Arret a = new Arret();
                a.setId(rs.getInt("arret_arrivee_id"));
                t.setArretArrivee(a);

                trajets.add(t);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return trajets;
    }
}