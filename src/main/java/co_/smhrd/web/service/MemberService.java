package co_.smhrd.web.service;

import co_.smhrd.web.dto.Cloud_Member;
import co_.smhrd.web.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    public List<Cloud_Member> memberList(){
        return repository.findAll();
    }

}
