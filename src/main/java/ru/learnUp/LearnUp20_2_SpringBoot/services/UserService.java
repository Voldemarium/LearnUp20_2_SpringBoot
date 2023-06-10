package ru.learnUp.LearnUp20_2_SpringBoot.services;

import org.springframework.stereotype.Service;
import ru.learnUp.LearnUp20_2_SpringBoot.annotation.NeedPerformanceCheck;
import ru.learnUp.LearnUp20_2_SpringBoot.dao.UserDao;
import ru.learnUp.LearnUp20_2_SpringBoot.model.User;

@Service
public class UserService {

	private final UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public User getUserByID(long id) {
		return userDao.findBy(id);
	}

	@NeedPerformanceCheck  // метод с этой моей аннотацией требует проверки скорости выполнения
	public User saveUser(User user) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return userDao.save(user);
	}
}
