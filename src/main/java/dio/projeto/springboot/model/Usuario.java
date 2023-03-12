package dio.projeto.springboot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tab_user")
public class Usuario {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Integer id;
	
	@Column(length = 20, nullable = false)
	private String login;
	
	@Column(length = 100, nullable = false)
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tab_user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role_id")
    private List<String> roles = new ArrayList<>();
	
	public Usuario() {	
		
	}

	public Usuario(String login, String password) {
		this.login = login;
		this.password = password;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + 
				", password=" + password + "]";
	}

}
