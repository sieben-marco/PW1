import java.io.*;

public class ExercicioSalvarLerObjeto {

	public static void main(String[] args) {

		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\04513901055\\AulaExcecoes\\src\\Arquivo.bin"));) {
			Pessoa objPessoa = new Pessoa();
			out.writeObject(objPessoa);
		} catch (SecurityException e) {
			System.err.println("sem permissão de escrita");
		} catch (NullPointerException e) {
			System.out.println("obj nulo");
		} catch (FileNotFoundException e) {
			System.out.println("arquivo de escrita não encontrado");
		} catch (InvalidClassException e) {
			System.out.println("classe do obj invalida");
		} catch (NotSerializableException e) {
			System.out.println("nao implementou a interface serializable");
		} catch (IOException e) {
			System.out.println("problema ao escrever no arquivo");
		}

		// leitura do obj
		try (ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\04513901055\\AulaExcecoes\\src\\Arquivo.bin"));) {
			Pessoa objPessoa = (Pessoa) in.readObject();
			System.out.println(objPessoa);
		} catch (SecurityException e) {
			System.err.println("sem permissão de leitura");
		} catch (NullPointerException e) {
			System.out.println("obj nulo");
		} catch (FileNotFoundException e) {
			System.out.println("arquivo de escrita não encontrado");
		} catch (InvalidClassException e) {
			System.out.println("classe do obj invalida");
		} catch (StreamCorruptedException e) {
			System.out.println("obj corrompido");
		} catch (ClassNotFoundException e) {
			System.out.println("classe não encontrada");
		} catch (NotSerializableException e) {
			System.out.println("nao implementou a interface serializable");
		} catch (OptionalDataException e) {
			System.out.println("não é obj é tipo primitivo");
		} catch (IOException e) {
			System.out.println("problema ao ler no arquivo");
		}
	}

}
