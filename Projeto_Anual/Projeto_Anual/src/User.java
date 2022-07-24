import java.time.LocalDate;
import java.time.Period;



public class User {
    public static int contador = 0;
    private String username;
    private LocalDate birthDate;
    private String email;
    private int idUser;
    private int age;
    LocalDate currentDate =  LocalDate.now(); 

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public User(String username, LocalDate birthDate, String email) {
        contador++;
        this.username = username;
        this.birthDate = birthDate;
        this.email = email;
        this.idUser = contador;
        this.age = calculateAge(birthDate, currentDate);
    }
    
    public int getAge() {
        return age;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public boolean podeJogar(Jogo jogo) {
        if(age < jogo.getIdadeMinima()) return false;
        return true;
    }

    public Review writeReview(Jogo jogo, int stars, String avaliacao) {
        Review review = new Review(stars, avaliacao, jogo, this);
        return review;
    }
}
