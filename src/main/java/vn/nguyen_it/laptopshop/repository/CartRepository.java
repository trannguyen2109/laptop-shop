package vn.nguyen_it.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.nguyen_it.laptopshop.domain.Cart;
import vn.nguyen_it.laptopshop.domain.Users;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(Users user);
}
