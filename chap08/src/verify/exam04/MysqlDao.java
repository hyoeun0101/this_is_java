package verify.exam04;

public class MysqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Mysql���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Mysql���� ����");		
	}

	@Override
	public void update() {
		System.out.println("Mysql���� ����");		
	}

	@Override
	public void delete() {
		System.out.println("Mysql���� ����");		
	}

}