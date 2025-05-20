package item;

import java.util.List;

public class DDItemService implements ItemService {

	private final ItemDAO dao = new DDListItemDAO();

	@Override
	public void addItem(String n, String d, String c, int p) {
		dao.insert(new ItemVO(n, d, c, p));
	}

	@Override
	public List<ItemVO> getAll() {
		return dao.selectAll();
	}

	@Override
	public List<ItemVO> getBy(String d, String c) {
		return dao.selectBy(d, c);
	}

	@Override
	public boolean modify(ItemVO vo) {
		return dao.update(vo);
	}

	@Override
	public boolean remove(int code) {
		return dao.delete(code);
	}
}
