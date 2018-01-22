package jp.co.tis.tiscon3.dao;

import org.seasar.doma.*;
import jp.co.tis.tiscon3.configuration.DatabaseConfiguration;
import jp.co.tis.tiscon3.entity.CardOrder;
import java.util.List;

/**
 * @author kawasima
 */
@Dao(config = DatabaseConfiguration.class)
public interface CardOrderDao {

    @Select
    CardOrder selectById(Long id);

    @Select
    List<CardOrder> selectAll();

    @Insert
    int insert(CardOrder cardOrder);

    @Update
    int update(CardOrder cardOrder);

    @Delete
    int delete(CardOrder cardOrder);
}
