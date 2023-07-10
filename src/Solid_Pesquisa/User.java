package Solid_Pesquisa;


    public class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void save() {
            // Lógica para salvar o usuário no banco de dados
        }
    }

