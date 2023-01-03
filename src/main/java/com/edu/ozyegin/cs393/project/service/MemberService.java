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
    MemberRepository memberRepository;

    public List<MemberDTO> findAll() {
        List<Member> all = memberRepository.findAll();
        List<MemberDTO> dtos = new ArrayList<>();
        for (Member member : all) {
            dtos.add(MemberMapper.INSTANCE.entityToDTO(member));
        }
        return dtos;
    }

    public MemberDTO findById(int id) {
        Optional<Member> l = memberRepository.findById(id);
        if (l.isPresent()) {
            Member location = l.get();
            return MemberMapper.INSTANCE.entityToDTO(location);
        }
        else return null;
    }

    public MemberDTO save(MemberDTO memberDTO) {
        Member a = memberRepository.save(MemberMapper.INSTANCE.DTOToEntity(memberDTO));
        return MemberMapper.INSTANCE.entityToDTO(a);
    }
}
