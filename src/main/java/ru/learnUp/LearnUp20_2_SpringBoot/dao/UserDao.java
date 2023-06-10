package ru.learnUp.LearnUp20_2_SpringBoot.dao;

import org.springframework.stereotype.Repository;
import ru.learnUp.LearnUp20_2_SpringBoot.model.User;

@Repository
public class UserDao {
	public User findBy(long id) {
		//select from db
		return  new User(1L, "Ivan", 20);
	}

	public User save(User user) {
		//insert in db
		return user;
	}
}
