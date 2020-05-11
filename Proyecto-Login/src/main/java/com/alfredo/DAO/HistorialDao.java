package com.alfredo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alfredo.model.TbHistorial;
import com.alfredo.model.TbUsuariosp;

public class HistorialDao {

	public void agregarDatosHistorial(TbHistorial his) {
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Proyecto-Login");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(his);
		em.flush();
		em.getTransaction().commit();
	}
	
	
	
	
	public List<Object> historial(){
		List<Object> HISTO=new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Proyecto-Login");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			HISTO = em.createQuery("SELECT his.idHistorial, his.tbUsuariosp.idUsuarios, his.fecha, "
					+ " usu.nombre_usuario, usu.apellido_usuario"
					+ " FROM TbHistorial AS his"
					+ " INNER JOIN TbUsuariosp AS usu ON usu.idUsuarios = his.tbUsuariosp.idUsuarios ").getResultList();
			
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			
			System.out.println(e+"Error Dao");
		}
		return HISTO;
		
	}
	
	
}
