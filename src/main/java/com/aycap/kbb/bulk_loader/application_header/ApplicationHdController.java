package com.aycap.kbb.bulk_loader.application_header;

import com.aycap.kbb.bulk_loader.entity.ApplicationHd;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

//https://stackoverflow.com/questions/53803780/tests-in-spring-boot-with-database-h2
//https://nordicapis.com/10-best-practices-for-naming-api-endpoints/
@RestController
@Slf4j
@RequestMapping(path = "/v1/bulk-loader/application-header")
public class ApplicationHdController {

    @Autowired
    ApplicationHdService applicationHdService;

    @GetMapping()
    public ResponseEntity<List<ApplicationHd>> applicationHeader() {
        return ResponseEntity.ok(applicationHdService.get());
    }

    @PostMapping()
    public ResponseEntity<List<ApplicationHd>> applicationHeader(
            @RequestParam("file") MultipartFile mFile) throws IOException {
        return ResponseEntity.ok(applicationHdService.post(mFile));
    }
}
