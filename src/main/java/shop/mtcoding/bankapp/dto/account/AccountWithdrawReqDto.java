package shop.mtcoding.bankapp.dto.account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountWithdrawReqDto {
    // DTO는 래퍼클래스로 만들어야한다 (null값을 받을수잇음)
    private Long amount;
    private String wAccountNumber;
    private String wAccountPassword;
}
