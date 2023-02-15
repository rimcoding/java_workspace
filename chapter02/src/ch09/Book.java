package ch09;
//import 잘못 연결됐을때 컨트롤 + 쉬프트 + o
public class Book {

	private int totalPage;
	private String title;
	private String author;
	private String number;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(int totalPage, String title,String author) {
		this(title,author);
		this.totalPage = totalPage;
	}
	
	public int getTotalPage() {
		//누가봐도 멤버변수라고 보이면 this를 안써도 된다.
		return this.totalPage;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
	this.title = title;	
	}
	
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String title) {
		this.title = title;	
		}
	public void ShowInfo() {
		System.out.println(">>>책정보<<<");
		System.out.println("책번호 : "+number);
		System.out.println("제목 : "+title);
		System.out.println("저자 : "+author);
	}

}

