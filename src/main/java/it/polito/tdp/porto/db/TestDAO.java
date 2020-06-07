package it.polito.tdp.porto.db;

import java.util.List;

import it.polito.tdp.porto.model.PortoArticle;
import it.polito.tdp.porto.model.PortoCreator;

public class TestDAO {

	/**
	 * Test methods for the DAO
	 * @param args
	 */
	public static void main(String[] args) {
		PortoDAO dao = new PortoDAO() ;
		
		List<PortoCreator> creators = dao.getAllCreator() ;
		List<PortoArticle> articles = dao.getAllArticle() ;
		
		System.out.format("Loaded %d authors and %d articles\n", creators.size(), articles.size()) ;
		
		for( PortoCreator cre: creators) {
			System.out.format("%d %s %s\n", cre.getId(), cre.getFamily(), cre.getGiven()) ;
			List<PortoArticle> myArticles = dao.getArticlesOfCreator(cre) ;
			// cre.setArticoli(myArticles) ;
			for( PortoArticle art: myArticles) {
				System.out.format("    %d %d %s\n", art.getDate(), art.getEprintid(), art.getTitle()) ;
			}
		}
		
		
		for( PortoArticle art: articles) {
			System.out.format("%d %d %s\n", art.getDate(), art.getEprintid(), art.getTitle()) ;
			List<PortoCreator> myAutors = dao.getCreatorsOfArticle(art) ;
			// art.setCreators(myAutors) ;
			for( PortoCreator cre: myAutors ) {
				System.out.format("    %d %s %s\n", cre.getId(), cre.getFamily(), cre.getGiven()) ;
			}
				
		}
		
		

		
	}

}
