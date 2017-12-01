package entity;

public class Student {
	private String studentNo;
	private String loginPwd;
	private String studentName;
	private String sex;
	private Integer GradeId;

	public Student() {
	}

	public Student(String studentNo, String loginPwd, String studentName,
			String sex, Integer gradeId) {
		super();
		this.studentNo = studentNo;
		this.loginPwd = loginPwd;
		this.studentName = studentName;
		this.sex = sex;
		GradeId = gradeId;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getGradeId() {
		return GradeId;
	}

	public void setGradeId(Integer gradeId) {
		GradeId = gradeId;
	}

}
