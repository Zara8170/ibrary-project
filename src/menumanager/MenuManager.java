package menumanager;
import java.util.Scanner;
import db.DBConnectionUtil;
import user.UserManager;

public class MenuManager {

	public final static int REGIST = 1;
    public final static int LOGIN = 2;
    public final static int EXIT = 3;
    public final static int BOOK_SEARCH = 1;
    public final static int USER_SEARCH = 2;
    public final static int FAVORITES = 3;
    public final static int LOGOUT = 4;
    public final static int USER_INFO = 1;
    public final static int SHOW_LENTLIST = 2;
    public final static int MAINMENU = 3;
    private Scanner scanner = new Scanner(System.in);
    private UserManager user = new UserManager();
    private DBConnectionUtil db = new DBConnectionUtil();
    
    public MenuManager() {
    }

    public void initMenu(){
        System.out.println("\n\n");
        System.out.println("   =====================================================");
        System.out.println("   =                                                   =");
        System.out.println("   =    ___   _                           _____        =");
        System.out.println("   =   |_ _| | |__  _ __ __ _ _ __ _   _ |  ___|       =");
        System.out.println("   =    | |  | '_ \\| '__/ _` | '__| | | || |           =");
        System.out.println("   =    | |  | |_) | | | (_| | |  | |_| || |___        =");
        System.out.println("   =   |___| |_.__/|_|  \\__,_|_|   \\__, ||_____|       =");
        System.out.println("   =                               |___/               =");
        System.out.println("   =                                                   =");
        System.out.println("   =       Welcome to Ibrary - Your Digital Library    =");
        System.out.println("   =                                                   =");
        System.out.println("   =====================================================");
        System.out.println("\n              Press Enter to continue...");
        scanner.nextLine();  // 사용자가 엔터를 누를 때까지 대기
        
    	while(true) {
    		db.getDBConnect();
    		System.out.println("<< 도서 대여관리 프로그램 >>"); 
    		System.out.println("1. 회원가입");
    		System.out.println("2. 로그인");
    		System.out.println("3. 종료");
    		System.out.print("선택: ");
    		int choice = scanner.nextInt();
    		scanner.nextLine();
    		
    		switch(choice){
    			case REGIST:
    				user.registerUser();
    				break;
    			case LOGIN:
    				user.loginProcess();
    				break;
    			case EXIT:
    				System.out.println("프로그램을 종료합니다.");
    				return;
    			default:
    				System.out.println("잘못된 번호를 선택하였습니다! 다시 선택해주세요!");
    		}
    	}  
    }
	public void iBraryMenu() {
		while(true) {
            System.out.println("\n=======================================");
            System.out.println("=    ___   _                           =");
            System.out.println("=   |_ _| | |__  _ __ __ _ _ __ _   _  =");
            System.out.println("=    | |  | '_ \\| '__/ _` | '__| | | | =");
            System.out.println("=    | |  | |_) | | | (_| | |  | |_| | =");
            System.out.println("=   |___| |_.__/|_|  \\__,_|_|   \\__, | =");
            System.out.println("=                               |___/  =");
            System.out.println("=======================================");
            System.out.println("<< 도서 대여 관리 프로그램 >>");
            System.out.println("1. 도서 검색");
            System.out.println("2. 유저");
            System.out.println("3. 즐겨찾기");
            System.out.println("4. 로그아웃");
			System.out.print("선택: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case BOOK_SEARCH:
//					booksearch();
					break;
				case USER_SEARCH:
					MyPage();
					break;
				case FAVORITES:
//					Favorites();
					break;
				case LOGOUT:
					System.out.println("로그아웃되었습니다.");
					return;
				default:
					System.out.println("잘못된 번호를 선택하였습니다! 다시 선택해주세요!");
			}
		}
	}

	public void MyPage() { 

		while(true) {
	        System.out.println("\n\n");
	        System.out.println("   =====================================================");
	        System.out.println("   =                   마이 페이지                      =");
	        System.out.println("   =                                                   =");
	        System.out.println("   =                     _______                       =");
	        System.out.println("   =                    /       \\                      =");
	        System.out.println("   =                   |  o   o  |                     =");
	        System.out.println("   =                   |    ^    |                     =");
	        System.out.println("   =                    \\  \\_/  /                      =");
	        System.out.println("   =                     \\_____/                       =");
	        System.out.println("   =                    /       \\                      =");
	        System.out.println("   =                   /         \\                     =");
	        System.out.println("   =                                                   =");
	        System.out.println("   =====================================================");
			System.out.println("1. 유저정보");
			System.out.println("2. 빌린 책 리스트");
			System.out.println("3. 메인메뉴");
			System.out.print("선택: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case USER_INFO:
					user.UserInformation();
					break;
				case SHOW_LENTLIST:
					user.ShowRentList();
					break;
				case MAINMENU:
					return;
				default:
					System.out.println("잘못된 선택입니다.");
			}
		}
	}
	
}