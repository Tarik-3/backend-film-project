package ma.emi.backend;

import ma.emi.backend.entities.Favorite;
import ma.emi.backend.entities.User;
import ma.emi.backend.repositories.FavoriteRepository;
import ma.emi.backend.repositories.FilmRepository;
import ma.emi.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

import static java.util.Arrays.stream;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
    @Autowired
    FavoriteRepository favoriteRepository;

    @Autowired
    FilmRepository filmRepository;
    @Autowired
    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Moha","Tarik","Malik").forEach(name ->{
            User user = new User();
            user.setUsername(name);
            userRepository.save(user);
        });
        System.out.println("Tarik jjhhnjn !!!");
        System.out.println(userRepository.findAll());
        
        userRepository.findAll().forEach(user->{
            Favorite favorite = new Favorite();
            favorite.setUser(user);
            favoriteRepository.save(favorite);
        });
        favoriteRepository.findAll().forEach(user->{
        System.out.println(user.toString());

        });
//        System.out.println(favoriteRepository.findAll());
    }
}
