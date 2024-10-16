
    import org.springframework.stereotype.Respository;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
import com.baidoo.blogserveer.post;

@Respository

public interface  postrespostory extends JpaRepository<post,long>{}


