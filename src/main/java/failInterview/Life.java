/*
 author Anastasiya
 created on 11/08/2021
 */


package failInterview;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Life {
    private Integer wasBorn;
    private Integer death;
}
