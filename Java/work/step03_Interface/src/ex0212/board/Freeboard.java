package ex0212.board;

/**
 * 자유게시판 속성 관리
 */
public class Freeboard extends Board {
	public Freeboard() {}

	public Freeboard(int no, String subject, String writer, String content) {
		super(no, subject, writer, content);
	}
}
