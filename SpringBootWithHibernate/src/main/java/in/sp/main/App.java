package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import in.sp.main.entities.User;
import in.sp.main.repository.DBOperation;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        DBOperation db = context.getBean(DBOperation.class);
        User user = db.getUserDetails(1);

        if (user != null) {
            System.out.println(user.getName());
            System.out.println(user.getEmail());
            System.out.println(user.getCity());
        } else {
            System.out.println("User not found");
        }
    }
}
