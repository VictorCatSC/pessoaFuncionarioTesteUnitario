public class Funcionario extends Pessoa
{
	private Setor setor;
	private boolean estaAtivo;

	public Funcionario(String nome, int idade, char sexo, Setor setor, boolean estaAtivo)
	{
		super(nome, idade, sexo);
		this.setor = setor;
		this.estaAtivo = estaAtivo;
	}

	public void inativarFuncionario()
	{
		this.estaAtivo = false;
	}

	public void reativarFuncionario()
	{
		this.estaAtivo = true;
	}

	public Setor getSetor()
	{
		return setor;
	}

	public void setSetor(Setor setor)
	{
		this.setor = setor;
	}

	public boolean getEstaAtivo()
	{
		return estaAtivo;
	}

	public void setEstaAtivo(boolean estaAtivo)
	{
		this.estaAtivo = estaAtivo;
	}

	@Override
	public String toString()
	{
		return "Funcionario{" + "setor=" + setor + ", estaAtivo=" + estaAtivo + '}';
	}
}
