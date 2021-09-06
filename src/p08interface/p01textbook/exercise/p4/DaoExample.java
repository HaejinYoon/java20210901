package p08interface.p01textbook.exercise.p4;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
