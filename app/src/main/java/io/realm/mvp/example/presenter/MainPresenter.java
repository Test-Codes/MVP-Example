package io.realm.mvp.example.presenter;

import io.realm.mvp.example.model.User;

/**
 * Created by TheFinestArtist on 6/9/15.
 */
public class MainPresenter {

    private User user;
    private View view;

    public MainPresenter(View view) {
        this.view = view;
        user  = new User();
    }

    public void updateFullName(String fullName) {
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email) {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    public interface View {
        void updateUserInfoTextView(String info);
    }
}
