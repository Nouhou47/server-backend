package com.softgraph.servermngtspringboot.repository;

import com.softgraph.servermngtspringboot.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author NDACH https://github.com/Nouhou47
 * @version 1.0
 * @since 14/02/2024
 */
public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
    Server findByName(String name);
}
