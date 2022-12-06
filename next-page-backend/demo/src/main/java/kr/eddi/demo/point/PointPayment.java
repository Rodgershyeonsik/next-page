package kr.eddi.demo.point;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PointPayment {

    @Id
    @Comment("결제 번호")
    private Long payment_id;

    @Column
    private Long payAmount;

    @Column
    private Long chargedPoint;

    @CreatedDate
    private LocalDate payDate;

    // 회원 entity와 매핑 예정
    // OneToMany(mappedBy = "order_id", fetch = FetchTye.Lazy)
    // private Member member_id;

    /**
     * 매핑된 회원 entity의 list에 해당 주문 내역 entity를 추가합니다.
     */
    public void updateToMember() {
        // 아래에 해당하는 메소드를 회원 entity에도 추가해야함
        // this.member_id.updatePointPaymentList(this);
    }


}
