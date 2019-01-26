package entities;

import entities.Egzemplarz;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-22T11:42:09")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile SingularAttribute<Film, String> studio;
    public static volatile SingularAttribute<Film, String> rezyser;
    public static volatile SingularAttribute<Film, Integer> filmId;
    public static volatile SingularAttribute<Film, String> nosnik;
    public static volatile CollectionAttribute<Film, Egzemplarz> egzemplarzCollection;
    public static volatile SingularAttribute<Film, String> tytul;

}