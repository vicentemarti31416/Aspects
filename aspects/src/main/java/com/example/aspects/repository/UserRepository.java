package com.example.aspects.repository;

import com.example.aspects.entity.User;

public interface UserRepository {

	User findUserByPosition(int position);
}
