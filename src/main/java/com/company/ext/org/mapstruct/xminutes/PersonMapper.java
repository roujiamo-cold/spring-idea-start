package com.company.ext.org.mapstruct.xminutes;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @description: TODO
 * @author: 刘子豪 2021/5/25 14:24
 * @email: liuzihao29@jd.com
 */
@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    @Mappings({
            @Mapping(target = "seatCount", source = "car.numberOfSeats"),
            @Mapping(target = "version", source = "version"),
    })
    PersonCarDto personCarToPersonDto(Person person, Car car, String version);
}
