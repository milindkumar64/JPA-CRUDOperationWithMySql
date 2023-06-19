package com.bridgelabz.JPACrudOperation.doa;

import com.bridgelabz.JPACrudOperation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

}
