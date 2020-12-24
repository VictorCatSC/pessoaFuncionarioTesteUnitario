import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FuncionarioTest
{
	Funcionario f;

	@BeforeEach
	public void init()
	{
		f = new Funcionario("fulano", 30, 'M', Setor.DEV, true);
	}

	@Test
	@DisplayName("metodo inativarFuncionario está inativando funcionario")
	void testInativarFuncionario()
	{
		f.inativarFuncionario();
		boolean isActive = f.getEstaAtivo();

		Assertions.assertFalse(isActive);
	}

	@Test
	@DisplayName("metodo reativarFuncionario está reativando funcionario")
	void reativarFuncionario()
	{
		f.reativarFuncionario();
		boolean isActive = f.getEstaAtivo();

		Assertions.assertTrue(isActive);
	}

	@Test
	@DisplayName("getSetor retorna o setor correto do usuario")
	void getSetor()
	{
		Setor expectedValue = Setor.DEV;
		Setor actualValue = f.getSetor();

		Assertions.assertEquals(expectedValue, actualValue);
	}

	@Test
	@DisplayName("setSetor seta o setor correto")
	void setSetor()
	{
		Setor expectedValue = Setor.QA;
		f.setSetor(Setor.QA);
		Setor actualValue = f.getSetor();

		Assertions.assertEquals(expectedValue, actualValue);
	}


	@Test
	@DisplayName("setEstaAtivo seta corretamente status do funcionario")
	void setEstaAtivo()
	{
		boolean expectedValue = false;

		f.setEstaAtivo(false);
		Boolean actualValue = f.getEstaAtivo();

		Assertions.assertEquals(expectedValue, actualValue);

	}

}