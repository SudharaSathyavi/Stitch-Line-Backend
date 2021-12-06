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
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private int mobile_number;
    private String date_of_birth;
    private String gender;
    private String language;
}
