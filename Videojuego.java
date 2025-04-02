package crud;

public class Videojuego {
        private int id;
        private String titulo;
        private String genero;
        private String descripcion;
        private int precio;

        public Videojuego() {
            
        }
        
        public Videojuego(String titulo, String genero, String descripcion, int precio) {
            this.titulo = titulo;
            this.genero = genero;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        public Videojuego(int id, String titulo, String genero, String descripcion, int precio) {
            this.id = id;
            this.titulo = titulo;
            this.genero = genero;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

          @Override
        public String toString() {
            return String.format("%-4d %-20s %-20s %-15s %-4d",
                    id,
                    titulo,
                    genero,
                    descripcion,
                    precio);
        }
    }
