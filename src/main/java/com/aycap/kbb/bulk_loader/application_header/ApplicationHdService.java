package com.aycap.kbb.bulk_loader.application_header;

import com.aycap.kbb.bulk_loader.entity.ApplicationHd;
import com.aycap.kbb.bulk_loader.mapper.TextFileReader;
import com.aycap.kbb.bulk_loader.repository.ApplicationHdRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Slf4j
public class ApplicationHdService {
    @Autowired
    TextFileReader<ApplicationHd> textFileReader;

    @Autowired
    ApplicationHdRepository applicationHdRepository;

    public List<ApplicationHd> get() {
        return applicationHdRepository.findTop10By();
    }

    public List<ApplicationHd> post(MultipartFile mFile) throws IOException {
        Path temp = Files.createTempFile("ApplicationHd_", ".txt");
        mFile.transferTo(temp);
        List<ApplicationHd> apps =
                applicationHdRepository.saveAllAndFlush(textFileReader.supplier(temp).get().collect(Collectors.toList()));
        if (!Files.deleteIfExists(temp)) log.info("File doesn't exist.");
        return apps.subList(0, 10);
    }
}
