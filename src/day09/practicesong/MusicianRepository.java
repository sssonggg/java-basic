package day09.practicesong;

import day04.array.StringList;
import day09.music.Artist;

public class MusicianRepository {
    // 필요한 함수?
    // 1) 가수 등록하기(빈 가수 배열이 필요함, 가수 배열에 등록하면 추가)
    // 2) 노래 등록하기 (노래 배열에 노래 추가)
    // 3) 노래 정보를 검색.... 검색을 뭘로 받을것?
    // 4) 프로그램 종료는 view 에서


    // 1) 가수 등록하기
    private static Muisician[] muisician;
    static {
        muisician = new Muisician[0];
    }; // 뮤지션 배열생성 초기화


    // 2) 신규가수를 첫 노래와 함께 배열에 추가하는 기능
    // 필요한 변수는 입력될 가수와 입력받을 노래이므로 매개변수에 넣기
public void addPlayList(String newSinger, String newSong) {
//    // 1. 가수 객체 생성
//    Muisician muisician1 = new Muisician();
//    // 2. 생성된 가수 객체에 전달받은 이름 셋팅
//    muisician1.setName(newSinger);
//    // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
//    muisician1.setSongs(new StringList());
//    // 4. 해당 노래목록에 전달받은 노래 추가
//    muisician1.getSongs().push(newSong);

    Muisician muisician1 = new Muisician(newSinger,new StringList(newSong));

    // 5. 가수배열에 해당 가수 객체 추가
    Muisician[] temp = new Muisician[muisician.length + 1];
    for (int i = 0; i < muisician.length; i++) {
        temp[i] = muisician[i];
    }
    temp[temp.length - 1] = muisician1;
    muisician = temp;
}


// 3) 검색하기
    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String newSinger) {
        return findArtistByName(newSinger) != null;
    }

    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Muisician findArtistByName(String newSinger) {
        for (Muisician artist : muisician) {
            if (newSinger.equals(artist.getName())) {
                return artist;
            }
        }
        return null;
    }

    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean addNewSong(String newSinger, String newSong) {

        // 1. 기존 가수정보를 불러온다
        Muisician foundSinger = findArtistByName(newSinger);
        // 2. 그 가수 객체에서 노래목록을 뺴온다.
        StringList songList = foundSinger.getSongs();
        // 3. 그 노래목록에 새 노래를 추가한다.
        if(!songList.includes(newSinger)) {
            songList.push(newSong);
            return true;
        }
        return false;
    }
    // 특정 가수의 노래목록을 반환하는 기능
    public String[] getSongs(String newSinger) {
        return findArtistByName(newSinger).getSongs().getsArr();
    }
    // 등록된 가수의 수 반환
    public int count() {
        return muisician.length;
    }

}
