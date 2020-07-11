package com.ashwin.android.databinding.presenter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ashwin.android.databinding.R;
import com.ashwin.android.databinding.data.repositoryimpl.UserRepositoryImpl;
import com.ashwin.android.databinding.data.source.SampleUsers;
import com.ashwin.android.databinding.databinding.ActivityMainBinding;
import com.ashwin.android.databinding.domain.model.User;
import com.ashwin.android.databinding.domain.repository.UserRepository;

public class MainActivity extends AppCompatActivity {
    private User user;
    private ClickListener clickListener;

    public class ClickListener {
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Button clicked", Toast.LENGTH_LONG).show();
        }

        public void onGreet(View view, String name) {
            Toast.makeText(view.getContext(), "Hello " + name, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserRepository userRepository = new UserRepositoryImpl(new SampleUsers());
        user = userRepository.getUser();
        binding.setUser(user);

        clickListener = new ClickListener();
        binding.setClickListener(clickListener);
    }
}