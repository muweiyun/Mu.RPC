package Mu.rpc.user;

import java.util.List;

import Mu.rpc.cousumer.param.Response;


public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
