package item;

import java.util.List;

public interface ItemService {
    void addItem(String name, String dec, String cat, int price);
    List<ItemVO> getAll();
    List<ItemVO> getBy(String dec, String cat);
    boolean modify(ItemVO vo);
    boolean remove(int code);
}
