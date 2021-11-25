package java08_interface.lab03_bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //책장에서 책을 빼옴.
	}

	@Override
	public int getSize() {	//책장의 책의 개수.	
		return getCount();	//shelf 클래스에 정의된 매소드.
	}

}
