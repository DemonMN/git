package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.User;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name = "user")
public class UserHandler {
	private static Map<Integer, User> users = new HashMap<Integer, User>();
	static{
		users.put(1, new User(1, "Shagai Nyamdorj"));
	}
	@ApiMethod(name = "insert")
	public User insert(User user) {
		users.put(user.getId(), user);
		return user;
	}
	
	@ApiMethod(name = "all")
	public List<User> getAll() {
		return new ArrayList<User>(users.values());
	}
}
