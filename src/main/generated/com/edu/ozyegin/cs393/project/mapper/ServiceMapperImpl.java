package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.ServiceDTO;
import com.edu.ozyegin.cs393.project.model.Service;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:08:58+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public ServiceDTO entityToDTO(Service car) {
        if ( car == null ) {
            return null;
        }

        ServiceDTO serviceDTO = new ServiceDTO();

        serviceDTO.setId( car.getId() );
        serviceDTO.setName( car.getName() );
        serviceDTO.setPrice( car.getPrice() );

        return serviceDTO;
    }

    @Override
    public Service DTOToEntity(ServiceDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Service service = new Service();

        service.setId( carDTO.getId() );
        service.setName( carDTO.getName() );
        service.setPrice( carDTO.getPrice() );

        return service;
    }
}
