package gourp77.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByUsername(String username);
    User findUserByUsername(String username);
    boolean existsUserByEmail(String email);
    User findUserByEmail(String email);
}
