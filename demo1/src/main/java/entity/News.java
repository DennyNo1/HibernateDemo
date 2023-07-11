package entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Table;
import java.util.Date;

/**
 * User: Denny
 * Date: 2023/7/11 15:47
 * Description
 */
@Data
public class News
{
    private Integer id;
    private String title;
    private String author;
    private Date date;
}
