package com.portfolioapbe.ger.Security.Repository;

import com.portfolioapbe.ger.Security.Entity.Rol;
import com.portfolioapbe.ger.Security.Enums.RolName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RRol extends JpaRepository<Rol, Integer> {
    //metodos
    Optional<Rol> findByRolName (RolName rolName);
}
