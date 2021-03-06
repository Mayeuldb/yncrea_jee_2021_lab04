package yncrea.lab04.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab04.core.entity.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

}
