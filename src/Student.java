import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Student {
    @NonNull
    private String name;
    @NonNull
    private Integer height;
}
