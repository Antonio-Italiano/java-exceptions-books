package org.exceptions.java;

public class Libro {

	private String title;
	private int numberPages;
	private String author;
	private String publisher;
	
	public Libro(String title, int numberPages, String author, String publisher) throws Exception {
		
		setTitle(title);
		setNumberPages(numberPages);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if (title.length() < 1 ){
			
			throw new Exception("Il titolo non puo' essere vuoto " + title.length());
		}
		
		this.title = title;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) throws Exception {
		if (numberPages <= 0 ){
			
			throw new Exception("Il numero di pagine non puo' essere minore di 1");
		}

		this.numberPages = numberPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if (author.length() <= 0 ){
			
			throw new Exception("L'autore non puo' essere vuoto ");
		}
		
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	protected String getLibroString() {
		
		return getTitle()
		+ "\nNumero Pagine:" + getNumberPages()
		+ "\nAutore: " + getAuthor()
		+ "\nEditore: " + getPublisher();
	}
	
	@Override
	public String toString() {
		return getLibroString();
	}
}
