package wise_saying_2023_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	private Scanner sc;

	public App(Scanner sc) {
		this.sc = sc;
	}

	public void run() {
		System.out.println("== 명언 앱 실행 ==");

		int lastId = 0;
		List<WiseSaying> wiseSayings = new ArrayList<>();
		while (true) {
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();
			
			if (cmd.equals("종료")) {
				break;
			} else if (cmd.equals("등록")) {
				int id = lastId + 1;
				System.out.print("명언 : ");
				String content = sc.nextLine().trim();
				System.out.print("작가 : ");
				String author = sc.nextLine().trim();
				
				WiseSaying wiseSaying = new WiseSaying(id, content, author);
				wiseSayings.add(wiseSaying);
				
				System.out.printf("%d번 명언이 등록되었습니다.\n", id);
				lastId++;
				
			} else if(cmd.equals("목록")) {
				if(wiseSayings.size() == 0) {
					System.out.println("등록된 명언이 없습니다.");
				} else {
					System.out.println("명언이 있습니다.");
					System.out.println("등록 된 명언 수: " + wiseSayings.size());
					
				}
				
			} else {
				System.out.println("존재하지 않는 명령어입니다.");
			}
		}
	}
}