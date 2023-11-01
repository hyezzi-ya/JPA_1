package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // @Eembeddable 하나만 있어도 되지만 두개 다 적어준다
    private Address address;

    @OneToMany(mappedBy = "member") // 읽기전용
    private List<Order> orders = new ArrayList<>();

}
