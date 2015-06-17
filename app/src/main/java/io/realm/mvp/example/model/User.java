package io.realm.mvp.example.model;

/**
 * Created by TheFinestArtist on 6/7/15.
 */
public class User {

    private String fullName;
    private String email;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FullName : " + fullName + "\nEmail : " + email;
    }
}
