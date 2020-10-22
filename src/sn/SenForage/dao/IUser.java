package sn.SenForage.dao;

import sn.SenForage.entities.User;
import java.util.List;

public interface IUser {
   public User add(User user);
   public List<User> list();
}
