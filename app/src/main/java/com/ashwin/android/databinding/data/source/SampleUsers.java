package com.ashwin.android.databinding.data.source;

import com.ashwin.android.databinding.domain.model.User;

import java.util.ArrayList;
import java.util.List;

public class SampleUsers {
    private static List<User> userList;
    static {
        userList = new ArrayList<>();
        userList.add(new User("Alice", "alice@email.com"));
        userList.add(new User("Bob", "bob@yahoo.com"));
        userList.add(new User("Clara", "clara10@mail.com"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
