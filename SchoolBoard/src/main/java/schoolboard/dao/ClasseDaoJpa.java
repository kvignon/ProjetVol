package schoolboard.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import schoolboard.model.Classe;

@Repository
@Transactional
public class ClasseDaoJpa implements ClasseDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Classe> findAll() {
		Query query = em.createQuery("from GestionDeClasse");
		return query.getResultList();
	}

	@Override
	public Classe find(Long id) {
		return em.find(Classe.class, id);
	}

	@Override
	public void create(Classe obj) {
		em.persist(obj);
	}

	@Override
	public Classe update(Classe obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Classe obj) {
		em.remove(em.merge(obj));
	}

}


