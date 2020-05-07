package com.alfredo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alfredo.model.TbUsuariosp;

public class UsuarioDao {
	
	public List<TbUsuariosp> EntradaUsuario(TbUsuariosp usu){
		List<TbUsuariosp> User=new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("Proyecto-Login");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			User = em.createQuery("from TbUsuariosp as u where u.usuario='"+usu.getUsuario()+"' and u.contrasena='"+usu.getContrasena()+"'").getResultList();
			
			em.getTransaction().commit();
			
			for (TbUsuariosp datosid:User) {

				usu.setIdUsuarios(datosid.getIdUsuarios());
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e+"Error Dao");
		}
		return User;
		
	}

}
