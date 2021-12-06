package lk.stichline.stitchline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthenticationResponse {
    @Id
    private String response;
}
