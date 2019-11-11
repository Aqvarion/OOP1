package library;

import java.util.Objects;

public class Author {

    String name;
    String email;
    char gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                Objects.equals(name, author.name) &&
                Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 17;
        result=prime*result + (name == null?0:name.hashCode());
        result=prime*result+(email==null?0:email.hashCode());
        result=prime*result+(int)gender;
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }



    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
