package africa.semicolon.promeescuous.repositories;

import africa.semicolon.promeescuous.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}