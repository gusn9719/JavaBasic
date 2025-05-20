package item;

import java.util.*;

public class DDListItemDAO implements ItemDAO {

	private final List<ItemVO> list = new ArrayList<>();
	private int seq = 1; // itemCode 시퀀스

	@Override
	public void insert(ItemVO vo) {
		vo.setItemCode(seq++);
		list.add(vo);
	}

	@Override
	public List<ItemVO> selectAll() {
		return Collections.unmodifiableList(list);
	}

	@Override
	public List<ItemVO> selectBy(String decade, String category) {
		List<ItemVO> res = new ArrayList<>();
		for (ItemVO vo : list) {
			if (vo.getDecade().equals(decade) && vo.getCategory().equals(category)) {
				res.add(vo);
			}
		}
		return res;
	}

	@Override
	public boolean update(ItemVO vo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getItemCode() == vo.getItemCode()) {
				list.set(i, vo);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(int code) {
		return list.removeIf(v -> v.getItemCode() == code);
	}
//	- **기능은 동일** : 조건에 맞는 요소를 찾아 삭제  
//	- **장점** :  
//	  1. 코드 길이 ↓, 가독성 ↑ (한 줄)  
//	  2. 내부적으로 `Iterator` 제거 로직을 이미 포함 → 실수(ConcurrentModificationException) 방지  
//	- **Java 8**(수업 커리큘럼에 포함)부터 지원되는 문법이므로, “더 현대적인 표기” 정도로 이해하시면 됩니다.  
//	  필요한 경우 교수님 스타일에 맞춰 전통적인 `for` 루프로 바꿔 써도 무방합니다.
//
//	---
//
//	### 요약  
//	- **네이밍**: “DecaDive + List 기반 구현”을 드러내기 위해 `DDListItemDAO`.  
//	- **unmodifiableList**: 외부에서 DAO 내부 자료구조를 수정하지 못하도록 보호.  
//	- **람다 + removeIf**: 같은 기능을 더 간결·안전하게 표현하는 Java 8 식 문법.

}
