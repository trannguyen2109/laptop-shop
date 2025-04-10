package vn.nguyen_it.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.nguyen_it.laptopshop.domain.Order;
import vn.nguyen_it.laptopshop.domain.Users;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(Users user);
}
