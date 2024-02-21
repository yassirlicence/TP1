public class Etudiant {
    // Propriétés
    private String nom;
    private String prenom;
    private int age;
    private double note;
    
    // Constructeur
    public Etudiant(String nom, String prenom, int age, double note) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.note = note;
    }
    
    // Méthodes d'accès (getters) pour chaque propriété
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getNote() {
        return note;
    }
    
    // Méthodes de modification (setters) pour chaque propriété
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setNote(double note) {
        this.note = note;
    }
}
