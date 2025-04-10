package vn.nguyen_it.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.nguyen_it.laptopshop.domain.Users;
import java.util.List;

//crud: create, read, update, delete
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users save(Users eric);

    void deleteById(long id);

    List<Users> findOneByEmail(String email);

    List<Users> findAll();

    Users findById(long id); // null

    boolean existsByEmail(String email);

    Users findByEmail(String email);
}
