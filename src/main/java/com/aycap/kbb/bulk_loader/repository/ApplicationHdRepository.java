package com.aycap.kbb.bulk_loader.repository;

import com.aycap.kbb.bulk_loader.entity.ApplicationHd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationHdRepository  extends JpaRepository<ApplicationHd, Long> {
    List<ApplicationHd> findTop10By();
}
