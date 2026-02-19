package assignment0213.interfaceCheckQuest07;

public class MySqlDao implements DataAccessObject{

        @Override
        public void select() {
            System.out.println("Mysql DB에서 검색");
        }

        @Override
        public void insert() {
            System.out.println("Mysql DB에서 삽입");
        }

        @Override
        public void delete() {
            System.out.println("Mysql DB에서 삭제");

        }

        @Override
        public void update() {
            System.out.println("Mysql DB에서 수정");
        }

}
