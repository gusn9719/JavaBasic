package item;

import java.util.List;

public interface ItemDAO {
    void insert(ItemVO vo);
    List<ItemVO> selectAll();
    List<ItemVO> selectBy(String decade, String category);
    boolean update(ItemVO vo);
    boolean delete(int code);
}
