package com.aycap.kbb.bulk_loader.boombibu;

import com.aycap.kbb.bulk_loader.entity.ApplicationHd;
import com.aycap.kbb.bulk_loader.entity.Boombibu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/v1/boombibu")
public class BoombibuController {
    @Autowired
    BoombibuService boombibuService;

    @GetMapping()
    public ResponseEntity<List<Boombibu>> BoombibuGet(){
        return ResponseEntity.ok(boombibuService.get());
    }

    @PostMapping()
    public ResponseEntity<Boombibu> Boombibu(
            @RequestBody Boombibu boombibu) throws IOException {
        return ResponseEntity.ok(boombibuService.post(boombibu));
    }
}
