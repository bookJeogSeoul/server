package com.app.bookJeog.domain.dto;


import com.app.bookJeog.domain.enumeration.PostType;
import com.app.bookJeog.domain.enumeration.ReceiverStatus;
import com.app.bookJeog.domain.vo.PostVO;
import com.app.bookJeog.domain.vo.ReceiverVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ReceiverDTO {
    @EqualsAndHashCode.Include
    private Long id;
    private String receiverTitle;
    private String receiverText;
    private ReceiverStatus receiverStatus;
    private String createdDate;
    private String updatedDate;

    public ReceiverVO toVO() {
        return ReceiverVO.builder()
                .id(id)
                .receiverTitle(receiverTitle)
                .receiverText(receiverText)
                .receiverStatus(receiverStatus)
                .createdDate(createdDate)
                .updatedDate(updatedDate)
                .build();
    }


}
