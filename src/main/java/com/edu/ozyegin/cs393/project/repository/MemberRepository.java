package com.edu.ozyegin.cs393.project.repository;

import com.edu.ozyegin.cs393.project.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
