public class Etudiant {
    // Propriétés
    private String nom;
    private int age;
    
    // Constructeur
    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    // Méthodes d'accès (getters) pour chaque propriété
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
    
    // Méthodes de modification (setters) pour chaque propriété
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
