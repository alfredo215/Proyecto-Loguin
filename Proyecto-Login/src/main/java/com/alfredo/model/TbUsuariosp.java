package com.alfredo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_usuariosp database table.
 * 
 */
@Entity
@Table(name="tb_usuariosp")
@NamedQuery(name="TbUsuariosp.findAll", query="SELECT t FROM TbUsuariosp t")
public class TbUsuariosp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuarios;

	private String apellido_usuario;

	private String contrasena;

	private String nombre_usuario;

	private String usuario;

	//bi-directional many-to-one association to TbHistorial
	@OneToMany(mappedBy="tbUsuariosp")
	private List<TbHistorial> tbHistorials;

	public TbUsuariosp() {
	}

	public int getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getApellido_usuario() {
		return this.apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombre_usuario() {
		return this.nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<TbHistorial> getTbHistorials() {
		return this.tbHistorials;
	}

	public void setTbHistorials(List<TbHistorial> tbHistorials) {
		this.tbHistorials = tbHistorials;
	}

	public TbHistorial addTbHistorial(TbHistorial tbHistorial) {
		getTbHistorials().add(tbHistorial);
		tbHistorial.setTbUsuariosp(this);

		return tbHistorial;
	}

	public TbHistorial removeTbHistorial(TbHistorial tbHistorial) {
		getTbHistorials().remove(tbHistorial);
		tbHistorial.setTbUsuariosp(null);

		return tbHistorial;
	}

	@Override
	public String toString() {
		return "TbUsuariosp [idUsuarios=" + idUsuarios + ", apellido_usuario=" + apellido_usuario + ", contrasena="
				+ contrasena + ", nombre_usuario=" + nombre_usuario + ", usuario=" + usuario + ", tbHistorials="
				+ tbHistorials + "]";
	}

}