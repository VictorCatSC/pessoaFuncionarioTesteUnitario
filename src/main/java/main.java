public class main
{
	public static void main(String[] args)
	{
		Funcionario f = new Funcionario("fulano", 30, 'M', Setor.DEV, true);
		System.out.printf(f.toString());
	}
}
