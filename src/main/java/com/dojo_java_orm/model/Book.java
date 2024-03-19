package com.dojo_java_orm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


//TODO EXO1
@Getter
@Setter
public class Book {
   private String title;
   private String isbn;
}
