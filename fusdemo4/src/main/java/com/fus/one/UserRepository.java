/*
    CreateUser:fus
    CreateDate:2018-11-04 15:41:25
    my learning spring boot
*/

package com.fus.one;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
