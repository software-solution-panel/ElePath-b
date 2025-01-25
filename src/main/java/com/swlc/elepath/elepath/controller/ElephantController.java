package com.swlc.elepath.elepath.controller;

import com.swlc.elepath.elepath.dto.ElephantDTO;
import com.swlc.elepath.elepath.service.ElephantService;
import com.swlc.elepath.elepath.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/elephant")
public class ElephantController {

    @Autowired
    private ElephantService elephantService;
    @PostMapping("/addElephant")
    private ResponseEntity<StandardResponse<?>> addRate(@RequestBody ElephantDTO dto) {
        return elephantService.addElephant(dto);
    }
}
