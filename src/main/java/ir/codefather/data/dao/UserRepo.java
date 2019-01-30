package ir.codefather.data.dao;

import ir.codefather.data.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
