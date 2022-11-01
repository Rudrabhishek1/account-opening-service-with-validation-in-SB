package com.accountopeningservice.accountopeningservice.repository;

import com.accountopeningservice.accountopeningservice.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AccountRepository extends JpaRepository<Account,Long> {
   // AccountRepository.findByName(Sort.by(Sort.Direction.ASC, "name"));

   /* @Query(value = "SELECT * FROM Account ORDER BY name = :name ", nativeQuery = true)
    Account findByName(@Param("name") String name);*/
 /*  @Query(
           value = "SELECT * FROM Account ORDER BY name",
           countQuery = "SELECT count(*) FROM Users",
           nativeQuery = true)
   Page<Account> findAllUsersWithPagination(Pageable pageable);*/
}

