package com.swlc.elepath.elepath.service.impl;

import com.swlc.elepath.elepath.dto.ElephantDTO;
import com.swlc.elepath.elepath.entity.Elephant;
import com.swlc.elepath.elepath.reporitory.ElephantRepository;
import com.swlc.elepath.elepath.service.ElephantService;
import com.swlc.elepath.elepath.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ElephantServiceImpl implements ElephantService {

    @Autowired
    private ElephantRepository repository;

    @Override
    public ResponseEntity<StandardResponse<?>> addElephant(ElephantDTO dto) {
        try {
            Elephant elephant = new Elephant();
            elephant.setLocation(dto.getLocation());
            repository.save(elephant);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new StandardResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Cannot save","Internal Server Problem"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new StandardResponse<>(200, "Elephant Save Success", "OK"), HttpStatus.OK);
    }
}
