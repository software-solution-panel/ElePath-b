package com.swlc.elepath.elepath.service;

import com.swlc.elepath.elepath.dto.ElephantDTO;
import com.swlc.elepath.elepath.util.StandardResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface ElephantService {
    ResponseEntity<StandardResponse<?>> addElephant(MultipartFile image, Double latitude, Double longitude);

}
