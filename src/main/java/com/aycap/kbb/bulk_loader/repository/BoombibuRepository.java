package com.aycap.kbb.bulk_loader.repository;
import com.aycap.kbb.bulk_loader.entity.ApplicationHd;
import com.aycap.kbb.bulk_loader.entity.Boombibu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoombibuRepository extends JpaRepository<Boombibu, Long> {
    @Override
    List<Boombibu> findAll();
}
