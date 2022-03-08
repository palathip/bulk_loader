package com.aycap.kbb.bulk_loader.boombibu;
import com.aycap.kbb.bulk_loader.entity.Boombibu;
import com.aycap.kbb.bulk_loader.repository.BoombibuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BoombibuService {
    @Autowired
    BoombibuRepository boombibuRepository;

    public List<Boombibu> get(){
        return boombibuRepository.findAll();
    }


    public Boombibu post(Boombibu boombibu) throws IOException {

        boombibuRepository.save(boombibu);
        return boombibu;
    }
}
