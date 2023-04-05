package day09.practicesong;

import static day07.static_.Utility.input;
import static day07.static_.Utility.makeLine;

public class MusicianView {

    private final static MusicianRepository mr;
    static {
        mr = new MusicianRepository();
    }

    public static void start() {

        while (true) {
            System.out.println("\n****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", mr.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();

            String menuNum = input(">> ");

            switch(menuNum) {
                case "1" :
                    insertMenu();
                    break;
                case "2" :
                    searchMenu();
                    break;
                case "3" :
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 번호를 잘 입력해주세요.");
                    break;
            }
        }


        }

    // 1번 메뉴 기능
    private static void insertMenu() {

        System.out.println("\n# 노래 등록을 시작합니다.");
        String newSinger = input("- 가수명: ");
        String newSong = input("- 노래명: ");

        // 신규 가수인 경우
        if (!mr.isRegistered(newSinger)) {
            mr.addPlayList(newSinger, newSong);
            System.out.printf("\n# %s님이 신규 등록되었습니다.\n", newSinger);
        } else { // 기존가수인 경우
            boolean flag = mr.addNewSong(newSinger, newSong);
            if (flag) {
                System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.\n", newSinger, newSong);
            } else {
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", newSong);
            }
        }

    }

    // 2번 메뉴 기능
    private static void searchMenu() {

        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String newSinger = input("- 가수명: ");

        if (mr.isRegistered(newSinger)) {
            // 등록된 경우
            System.out.printf("\n# %s님의 노래목록 \n", newSinger);
            makeLine();
            String[] songs = mr.getSongs(newSinger);
            for (int i = 0; i < songs.length; i++) {
                System.out.printf("* %d. %s\n", i+1, songs[i]);
            }
        } else {
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
        }
    }
}
