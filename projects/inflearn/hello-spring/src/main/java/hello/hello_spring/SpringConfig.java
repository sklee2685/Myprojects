package hello.hello_spring;
import hello.hello_spring.repository.*;
import hello.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig { // 자바 코드로 직접 스프링 빈 등록

    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    //private EntityManager em;
    //
    //@Autowired
    //public SpringConfig(EntityManager em) {
    //    this.em = em;
    //}
    //
    ////private DataSource dataSource;
    ////@Autowired
    ////public SpringConfig(DataSource dataSource) {
    ////    this.dataSource = dataSource;
    ////}

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    //@Bean
    //public MemberRepository memberRepository() {
    //    //return new MemoryMemberRepository();
    //    //return new JdbcMemberRepository(dataSource);
    //    //return new JdbcTemplateMemberRepository(dataSource);
    //    //return new JpaMemberRepository(em);
    //}
}
