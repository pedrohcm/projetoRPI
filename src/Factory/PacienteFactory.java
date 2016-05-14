package Factory;

import Exceptions.DataInvalidaException;
import Exceptions.PacienteException;
import Paciente.Paciente;

public class PacienteFactory {
	private int ID;
	/**
	 * Construtor
	 */
	public PacienteFactory(){
		ID = 1;
		
	}
	/**
	 * Cria paciente
	 * @param nome associa ao nome
	 * @param nascimento associa ao paciente
	 * @param peso associa ao peso
	 * @param sexo associa ao sexo
	 * @param genero associa ao genero
	 * @param tipoSanguineo associa ao tipo sanguineo
	 * @return paciente gerado
	 * @throws PacienteException
	 * @throws DataInvalidaException
	 */
	public Paciente criarPaciente(String nome,String nascimento,double peso,String sexo,String genero,String tipoSanguineo) throws PacienteException, DataInvalidaException{
		Paciente paciente = new Paciente(nome,nascimento,peso,sexo,genero,tipoSanguineo,ID);
		ID++;
		return paciente;
	}

}