package com.jack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
