package com.swlc.elepath.elepath.controller;

import com.swlc.elepath.elepath.dto.ElephantDTO;
import com.swlc.elepath.elepath.service.ElephantService;
import com.swlc.elepath.elepath.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
@RequestMapping("/elephant")
public class ElephantController {

    @Autowired
    private ElephantService elephantService;
    @PostMapping("/addElephant")
    private ResponseEntity<StandardResponse<?>> addRate(@RequestParam("image") MultipartFile image,
                                                        @RequestParam("latitude") Double latitude,
                                                        @RequestParam("longitude") Double longitude) {
        return elephantService.addElephant(image, latitude, longitude);
    }

    @GetMapping("/getAllElephant")
    private ResponseEntity<StandardResponse<?>> getAllElephant() {
        return elephantService.getAllElephant();
    }

}
