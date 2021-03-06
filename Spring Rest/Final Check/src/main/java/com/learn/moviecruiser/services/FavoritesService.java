package com.learn.moviecruiser.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.moviecruiser.dao.FavoriteDao;
import com.learn.moviecruiser.exception.FavoritesEmptyException;
import com.learn.moviecruiser.model.Movie;



@Service
public class FavoritesService {

	@Autowired
	FavoriteDao favoriteDao;
	
	public void addFavoritesMovie(long userId, long movieId)
	{
		favoriteDao.addFavoritesMovie(userId, movieId);
	}
	
	public List<Movie> getAllFavoriteMovies(long userId) throws FavoritesEmptyException
	{
		return favoriteDao.getAllFavoritesMovies(userId);
	}
	
	public void removeFavoriteMovie(long userId, long movieId)
	{
		favoriteDao.removeFavoritesMovie(userId, movieId);
	}

}