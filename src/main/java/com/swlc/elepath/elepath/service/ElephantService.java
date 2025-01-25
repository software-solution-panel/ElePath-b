package com.swlc.elepath.elepath.service;

import com.swlc.elepath.elepath.dto.ElephantDTO;
import com.swlc.elepath.elepath.util.StandardResponse;
import org.springframework.http.ResponseEntity;

public interface ElephantService {
    ResponseEntity<StandardResponse<?>> addElephant(ElephantDTO dto);

}
