package com.ashwin.android.databinding.data.repositoryimpl;

import com.ashwin.android.databinding.data.source.SampleUsers;
import com.ashwin.android.databinding.domain.model.User;
import com.ashwin.android.databinding.domain.repository.UserRepository;

import java.util.List;
import java.util.Random;

public class UserRepositoryImpl implements UserRepository {
    private static final Random random = new Random();
    private SampleUsers sampleUsers;

    public UserRepositoryImpl(SampleUsers sampleUsers) {
        this.sampleUsers = sampleUsers;
    }

    @Override
    public User getUser() {
        List<User> userList = sampleUsers.getUserList();
        int index = random.nextInt(userList.size());
        return userList.get(index);
    }
}
