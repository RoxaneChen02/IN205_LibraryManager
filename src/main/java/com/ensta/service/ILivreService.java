package com.ensta.service;

import java.util.List;

import com.ensta.librarymanager.exception.DaoException;
import com.ensta.librarymanager.exception.ServiceException;
import com.ensta.librarymanager.modele.Livre;

public interface ILivreService {

	public List<Livre> getList() throws ServiceException;
	public List<Livre> getListDispo() throws ServiceException;
	public Livre getById(int id) throws ServiceException;
	public int create(Livre livre) throws ServiceException;
	public void update(Livre livre) throws ServiceException;
	public void delete(int id) throws ServiceException;
	public int count() throws ServiceException;
	
}
