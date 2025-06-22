package member.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import member.HashMapMemberDAO;
import member.MemberDAO;
import member.MemberVO;

public class ObjFileHashMapMemberDAO extends HashMapMemberDAO implements FileMemberDB, MemberDAO {
	private String dataFileName = DATA_FILE + ".obj";

	public ObjFileHashMapMemberDAO() {
		loadMembers();
	}

	@Override
	public void saveMembers() {
		try (FileOutputStream fos = new FileOutputStream(dataFileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(memberDB);
  
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void loadMembers() {
		try (FileInputStream fis = new FileInputStream(dataFileName);
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			memberDB = (Map<String, MemberVO>) ois.readObject();
			for (MemberVO member : memberDB.values()) {
				if (member.getMemberNo() >= memberSeq)
					memberSeq = member.getMemberNo() + 1;
			}

		} catch (FileNotFoundException e) {
			System.out.println("[DB로딩] " + dataFileName + "가 없습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean insertMember(MemberVO member) {
		boolean result = super.insertMember(member);
		if (result)
			saveMembers();
		return result;
	}

	@Override
	public boolean updateMember(MemberVO newMember) {
		boolean result = super.updateMember(newMember);
		if (result)
			saveMembers();

		return result;
	}

	@Override
	public boolean deleteMember(String id) {
		boolean result = super.deleteMember(id);
		if (result)
			saveMembers();
		return result;
	}

}
