package com.dojo_java_orm;

import com.dojo_java_orm.model.Author;
import com.dojo_java_orm.model.Book;
import com.dojo_java_orm.repositories.AuthorRepository;
import com.dojo_java_orm.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DojoJavaOrmApplication {

    private static AuthorRepository authorRepository;
    private static BookRepository bookRepository;

    @Autowired
    public DojoJavaOrmApplication(AuthorRepository authorRepository,
                                  BookRepository bookRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(DojoJavaOrmApplication.class, args);

        // Exo 1: Créer des objets Book et Author et les sauvegarder dans la BDD

        //Exo 2: Ajouter une relation 1:N entre Author et Book (un auteur a écrit plusieurs livres)

        //Exo 3: Modifier la relation 1:N en N:N (un livre peut aussi avoir plusieurs auteurs)
    }
}
