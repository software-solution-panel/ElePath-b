package com.swlc.elepath.elepath.service.impl;

import com.swlc.elepath.elepath.dto.ElephantDTO;
import com.swlc.elepath.elepath.entity.Elephant;
import com.swlc.elepath.elepath.reporitory.ElephantRepository;
import com.swlc.elepath.elepath.service.ElephantService;
import com.swlc.elepath.elepath.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
@Transactional
public class ElephantServiceImpl implements ElephantService {

    @Autowired
    private ElephantRepository repository;

    @Value("${spring.web.resources.static-locations}")
    private String uploadDir;
    @Override
    public ResponseEntity<StandardResponse<?>> addElephant(MultipartFile imageFile, Double latitude, Double longitude) {
        try {
            File uploadFolder = new File(uploadDir.replace("file:", ""));
            if (!uploadFolder.exists()) {
                uploadFolder.mkdirs();
            }

            String originalFileName = imageFile.getOriginalFilename();
            String extension = originalFileName != null ? originalFileName.substring(originalFileName.lastIndexOf(".")) : ".jpg";
            String fileName = System.currentTimeMillis() + extension;
            Path filePath = Paths.get(uploadFolder.getAbsolutePath(), fileName);

            Files.copy(imageFile.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            Elephant elephant = new Elephant();
            elephant.setImagePath("/uploads/" + fileName);
            elephant.setLatitude(latitude);
            elephant.setLongitude(longitude);
            repository.save(elephant);

            return new ResponseEntity<>(new StandardResponse<>(200, "Elephant Save Success", "OK"), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new StandardResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Cannot save", "Internal Server Problem"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
