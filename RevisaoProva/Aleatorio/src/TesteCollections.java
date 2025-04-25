import java.util.*;

class Aluno implements Comparable<Aluno> {

    private long matricula;

    public Aluno(long matricula) {
        this.matricula = matricula;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return Long.compare(matricula, aluno.getMatricula());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return matricula == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

}

public class TesteCollections {

    public static void main(String[] args) {

//        TreeMap<Integer, Cpf> mapaCpfs = new TreeMap<>();
//        mapaCpfs.put(1, new Cpf(1, 1));
//        mapaCpfs.put(5, new Cpf(5, 5));
//        mapaCpfs.put(3, new Cpf(3, 3));
//        Set<Integer> chaves = mapaCpfs.keySet();
//        for (Integer chave : chaves) {
//            if (chave != null)
//                System.out.println(chave);
//        }

        List<Aluno> alunos = new LinkedList<>(Set.of(
                new Aluno(98478234),
                new Aluno(65459345),
                new Aluno(15498948)
        ));

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getMatricula());
        }

        Collections.sort(alunos);

        alunos.forEach(a -> System.out.println(a.getMatricula()));

    }

}
