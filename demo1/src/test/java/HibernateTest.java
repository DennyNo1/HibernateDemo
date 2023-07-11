
import entity.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

/**
 * User: Denny
 * Date: 2023/7/11 16:40
 * Description
 */
public class HibernateTest
{
    @Test
    public void test()
    {
        // 创建Hibernate会话工厂
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

// 创建Hibernate会话
        Session session = sessionFactory.openSession();

// 开启事务
        Transaction transaction = session.beginTransaction();

        try {
            // 创建一个实体对象
            News entity = new News();
            entity.setId(1);
            entity.setAuthor("zhang");
            entity.setTitle("bomb");
            entity.setDate(new Date());


            // 保存实体到数据库
            session.save(entity);

            // 提交事务
            transaction.commit();
        } catch (Exception e) {
            // 回滚事务
            transaction.rollback();
        } finally {
            // 关闭会话
            session.close();
            // 关闭会话工厂
            sessionFactory.close();
        }

    }
}
