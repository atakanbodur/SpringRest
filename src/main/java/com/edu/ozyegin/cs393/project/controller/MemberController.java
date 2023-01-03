package com.edu.ozyegin.cs393.project.controller;

import com.edu.ozyegin.cs393.project.dto.MemberDTO;
import com.edu.ozyegin.cs393.project.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/members")
@CrossOrigin
public class MemberController {
    @Autowired
     MemberService memberService;

    @GetMapping(value = "")
    List<MemberDTO> findAll() {
        return memberService.findAll();
    }

    @GetMapping(value = "/{id}")
    MemberDTO findById(@PathVariable int id) {
        return memberService.findById(id);
    }

    @PostMapping("/save")
    MemberDTO save(@RequestBody MemberDTO locationDTO){
        return memberService.save(locationDTO);
    }

}
