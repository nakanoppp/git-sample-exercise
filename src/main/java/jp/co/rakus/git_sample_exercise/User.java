package jp.co.rakus.git_sample_exercise;

/**
 * ユーザーを表すドメイン.
 * @author shun.nakano
 *
 */
public class User {
	/** ID */
	private Integer id;
	/** 名前 */
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
