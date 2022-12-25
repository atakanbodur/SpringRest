package com.edu.ozyegin.cs393.project.mapper;

import com.edu.ozyegin.cs393.project.dto.LocationDTO;
import com.edu.ozyegin.cs393.project.dto.MemberDTO;
import com.edu.ozyegin.cs393.project.model.Location;
import com.edu.ozyegin.cs393.project.model.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface MemberMapper {
    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);
    MemberDTO entityToDTO(Member car);
    Member DTOToEntity(MemberDTO carDTO);
}
