package it.corso.mygym.service;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDto;

public interface UserService {
    User save(UserDto userDto);
    User findById(Long id);
    User deleteById(Long id);
    User update(Long id, UserDto userDto);

    //TODO findAll();
}
