/*
    CreateUser:fus
    CreateDate:2018-11-04 15:44:25
    my learning spring boot
*/

package com.fus.two;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
