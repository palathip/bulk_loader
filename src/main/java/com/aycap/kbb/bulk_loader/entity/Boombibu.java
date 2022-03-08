package com.aycap.kbb.bulk_loader.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "BOOMBIBU_DB")
public class Boombibu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long boombibuId;

    String boombibuText;
}
