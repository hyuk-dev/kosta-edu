package ex0212.board;

public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("insert = "+ board);
		System.out.println(getClass().getSimpleName() + "insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("upload = "+ board);
		System.out.println(getClass().getSimpleName() + "update call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		return new UploadBoard(no, "제목", "익명", "내용", "test.jpg");
	}

}
