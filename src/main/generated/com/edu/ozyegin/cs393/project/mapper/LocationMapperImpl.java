package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.model.Location;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:58+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Override
    public LocationDTO entityToDTO(Location car) {
        if ( car == null ) {
            return null;
        }

        LocationDTO locationDTO = new LocationDTO();

        locationDTO.setCode( car.getCode() );
        locationDTO.setName( car.getName() );
        locationDTO.setAddress( car.getAddress() );

        return locationDTO;
    }

    @Override
    public Location DTOToEntity(LocationDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Location location = new Location();

        location.setCode( carDTO.getCode() );
        location.setName( carDTO.getName() );
        location.setAddress( carDTO.getAddress() );

        return location;
    }
}
