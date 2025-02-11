package org.covy.repository;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository {

    // 간단히 메모리에 저장하는 예시
    private final List<Member> memberList = new ArrayList<>();

    public void save(Member member) {
        memberList.add(member);
    }

    public List<Member> findAll() {
        return memberList;
    }
}

