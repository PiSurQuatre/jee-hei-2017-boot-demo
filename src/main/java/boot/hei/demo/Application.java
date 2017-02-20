package boot.hei.demo;

import boot.hei.demo.dao.ClientDao;
import boot.hei.demo.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Service
    public class Initializer{

        @Autowired
        private ClientDao clientDao;

        @PostConstruct
        public void init(){
            clientDao.save(new Client("Michu","Germaine"));
            clientDao.save(new Client("Michu","Ghislain"));
            clientDao.save(new Client("Willemant","Amaury"));
        }
    }

}
