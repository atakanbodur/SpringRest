package com.edu.ozyegin.cs393.project.service;

import com.edu.ozyegin.cs393.project.dto.MemberDTO;
import com.edu.ozyegin.cs393.project.mapper.MemberMapper;
import com.edu.ozyegin.cs393.project.model.Member;
import com.edu.ozyegin.cs393.project.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository locationRepository;

    public List<MemberDTO> findAll() {
        List<Member> locationList = locationRepository.findAll();
        List<MemberDTO> dtos = new ArrayList<>();
        for (Member location : locationList) {
            dtos.add(MemberMapper.INSTANCE.entityToDTO(location));
        }
        return dtos;
    }

    public MemberDTO findById(int id) {
        Optional<Member> l = locationRepository.findById(id);
        if (l.isPresent()) {
            Member location = l.get();
            return MemberMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public MemberDTO save(MemberDTO locationDTO) {
        Member a = locationRepository.save(MemberMapper.INSTANCE.DTOToEntity(locationDTO));
        return MemberMapper.INSTANCE.entityToDTO(a);
    }
}
