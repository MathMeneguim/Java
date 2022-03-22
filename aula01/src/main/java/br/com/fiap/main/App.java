package br.com.fiap.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.entity.Aluno;

public class App {

public static void main(String[] args) {
	
	//"FIAP_PU" --> persistence.xml chamada
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FIAP_PU");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	//starta a transacao | sem begin impossivel transacionar
	entityManager.getTransaction().begin();
	
	//instanciacao obj Aluno
//	Aluno aluno = new Aluno(); // new | Transient
//	aluno.setNome("Matheus");
//	aluno.setMatricula("88123");
//	aluno.setAtivo(true);
//	aluno.setCpf("513.639.778-06");
//	aluno.setDataNascimento(LocalDate.of(2003, 9, 21));
//	aluno.setDataCadastro(LocalDateTime.now());
//	aluno.setDataAtualizacao(LocalDateTime.now());

	//fala que vai ser salvo
	//entityManager.persist(aluno); // Managed
//	
//	Aluno aluno = entityManager.find(Aluno.class, 1L);
//	aluno.setNome("Matheus Novo");
//	aluno.setCpf("111.111.111-11");
//	aluno.setMatricula("22222");
	
	Aluno aluno2 = new Aluno(); // new | Transient
	aluno2.setNome("Bruno");
	aluno2.setMatricula("89321");
	aluno2.setAtivo(true);
	aluno2.setCpf("540.300.878-09");
	aluno2.setDataNascimento(LocalDate.of(2003, 6, 24));
	aluno2.setDataCadastro(LocalDateTime.now());
	aluno2.setDataAtualizacao(LocalDateTime.now());	
	
	Aluno aluno3 = new Aluno();
	aluno3.setNome("Pedro");
	aluno3.setMatricula("86540");
	aluno3.setAtivo(true);
	aluno3.setCpf("222.222.222-22");
	aluno3.setDataNascimento(LocalDate.of(1974, 9, 10));
	aluno3.setDataCadastro(LocalDateTime.now());
	aluno3.setDataAtualizacao(LocalDateTime.now());
	
	Aluno aluno4 = new Aluno();
	aluno4.setNome("Giovanna");
	aluno4.setMatricula("89768");
	aluno4.setAtivo(true);
	aluno4.setCpf("333.333.333-33");
	aluno4.setDataNascimento(LocalDate.of(2002, 11, 30));
	aluno4.setDataCadastro(LocalDateTime.now());
	aluno4.setDataAtualizacao(LocalDateTime.now());
	
	//fala que vai ser salvo
	entityManager.persist(aluno2);
	entityManager.persist(aluno3);
	entityManager.persist(aluno4);
	

	//print Aluno
	//System.out.println(aluno);
	System.out.println(aluno2);
	System.out.println(aluno3);
	System.out.println(aluno4);
	
//	Query query = entityManager.createQuery("SELECT a FROM Aluno a");
//	List<Aluno> resultado = query.getResultList();
//	
//	
//	//resultado.forEach(null)System.out::println); -- newest
//	//resultado.forEach( a -> {System.out.println(a)})
//	for (Aluno a : resultado) {
//		System.out.println(a);
//	}
	
	
	
//	entityManager.remove(aluno);
//	
//	if (entityManager.find(aluno.getClass(), 1L) == null) {
//		System.out.println("Aluno morto");		
//	}
	
	//executa atualizacao e envia p/ banco
	entityManager.getTransaction().commit();
	entityManager.close(); //Detached
	entityManagerFactory.close();
	//sempre feche entityManager| entityManagerFactory
}

}
