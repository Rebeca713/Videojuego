package crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorVideojuegos {
    Conexion c = new Conexion();

    public void alta(Videojuego p) throws SQLException {
        String sql = "INSERT INTO videojuego (titulo, genero, descripcion, precio) VALUES (?, ?, ?, ?)";

        try (Connection conn = c.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getTitulo());
            stmt.setString(2, p.getGenero());
            stmt.setString(3, p.getDescripcion());
            stmt.setInt(4, p.getPrecio());
            stmt.executeUpdate();
        }
    }

    // Listar todos los Videojuegos
    public List<Videojuego> listar() throws SQLException {
        String sql = "SELECT * FROM Videojuegos";
        List<Videojuego> videojuegos = new ArrayList<>();

        try (Connection conn = c.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Videojuego videojuego = new Videojuego(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getString("descripcion"),
                        rs.getInt("precio")
                );
                videojuegos.add(videojuego);
            }
        }
        return videojuegos;
    }
    
     
    
    // Buscar videojuego- por ID
    public Videojuego buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM viedojuego WHERE id = ?";
        try (Connection conn = c.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Videojuego(
                            rs.getInt("id"),
                            rs.getString("titulo"),
                            rs.getString("genero"),
                            rs.getString("descripcion"),
                            rs.getInt("precio")
                    );
                }
            }
        }
        return null; // Cliente no encontrado
    }

    // Modificar videojuego
    public boolean modificarVideojuego(int id, String titulo, String genero, String descripcion, String precio) throws SQLException {
        String sql = "UPDATE videojuego SET titulo = ?, genero = ?, descripcion = ?, precio = ? WHERE id = ?";

        try (Connection conn = c.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.setString(2, genero);
            stmt.setString(3, descripcion);
            stmt.setString(4, precio);
            stmt.setInt(5, id);

            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;
        }
    }

    // Eliminar videojuego
    public boolean eliminarVideojuego(int id) throws SQLException {
        String sql = "DELETE FROM videojuego WHERE id = ?";

        try (Connection conn = c.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int filasEliminadas = stmt.executeUpdate();
            return filasEliminadas > 0;
        }
    }
}
