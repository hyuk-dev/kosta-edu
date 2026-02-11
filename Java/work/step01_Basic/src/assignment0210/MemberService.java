package assignment0210;

public class MemberService {
    public boolean login(String id, String password) {
    	// 앞에 변수를 두고 equals 하지 않는 것이 null pointer 에러를 방지하는데 도움이 된다.
        if("hong".equals(id) && "12345".equals(password)) {
            return true;
        }
        return false;
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
