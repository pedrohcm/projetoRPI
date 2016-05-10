package Funcionarios;

import Exceptions.FuncionarioException;

public class Funcionario {
	private String nome;
	private String matricula;
	private String senha;
	private String data;
	private String cargo;
	
	/**
	 * Construtor de Funcionario
	 * @param nome associa ao nome
	 * @param matricula associa a matricula
	 * @param senha associa a senha
	 * @param data associa a data de nascimento
	 * @param cargo associa ao cargo
	 * @throws FuncionarioException
	 */
	public Funcionario(String nome,String matricula,String senha,String data,String cargo) throws FuncionarioException{
		verifica(nome,matricula,senha);
		this.nome = nome;
		this.matricula = matricula;
		this.data = data;
		this.senha = senha;
		this.cargo = cargo;
	}
	/**
	 * Verifica se os dados sao validos
	 * @param nome associa ao nome
	 * @param matricula associa a matricula
	 * @param senha associa a senha
	 * @throws FuncionarioException
	 */
	private void verifica(String nome,String matricula,String senha) throws FuncionarioException{
		verificaNome(nome);
		verificaMatricula(matricula);
		verificaSenha(senha);
	}
	/**
	 * Verifica senha
	 * @param senha associa a senha
	 * @throws FuncionarioException
	 */
	private void verificaSenha(String senha) throws FuncionarioException{
		if (senha.equals("") || senha == null){
			throw new FuncionarioException("Senha invalida.");
		}
	}
	/**
	 * Verifica matricula
	 * @param matricula associa a matricula
	 * @throws FuncionarioException
	 */
	private void verificaMatricula(String matricula) throws FuncionarioException{
		if (matricula.equals("") || matricula == null){
			throw new FuncionarioException("Matricula Invalida!");
		}
	}
	/**
	 * Verifica o nome
	 * @param nome associa ao nome
	 * @throws FuncionarioException
	 */
	private void verificaNome(String nome) throws FuncionarioException{
		if (nome.equals("") || nome == null){
			throw new FuncionarioException("Nome do funcionario nao pode ser vazio.");
		}
	}
	/**
	 * Formata a data
	 * @param data de nascimento
	 * @return data formatada
	 */
	private String formataData(String data) {
		
		String[] newDate = data.split("/");
		
		String dia = newDate[0];
		String mes = newDate[1];
		String ano = newDate[2];
		String dataFormatada = ano + "-" + mes + "-" + dia;
		
		return dataFormatada;
	}
	public void confirmarSenha(String senha) throws FuncionarioException{
		if (!senha.equals(this.senha)){
			throw new FuncionarioException("Senha invalida.");
		}
	}
	public String getMatricula(){
		return this.matricula;
	}
	public String getSenha(){
		return this.senha;
	}
	public String getNome(){
		return this.nome;
	}
	public String getCargo(){
		return this.cargo;
	}
	public String getData(){
		return formataData(this.data);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public void setData(String data){
		this.data = data;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", senha=" + senha + ", data=" + data
				+ ", cargo=" + cargo + "]";
	}
}
