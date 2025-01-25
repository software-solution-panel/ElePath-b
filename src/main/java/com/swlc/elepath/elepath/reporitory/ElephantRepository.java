package com.swlc.elepath.elepath.reporitory;

import com.swlc.elepath.elepath.entity.Elephant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElephantRepository extends JpaRepository<Elephant,Long> {
}
