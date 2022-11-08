package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Webtoon;

public class WebtoonController {
    private ArrayList<Webtoon> list = new ArrayList<Webtoon>();

    // 기본 웹툰 데이터들
{
        list.add(new Webtoon(1, "참교육", "채용택", 15,
                            "무너진 교권을 지키기 위해 교권보호국 소속 나화진의 참교육이 시작된다!\r\n<부활남> 채용택 작가 X <신석기녀> 한가람 작가의 신작!", "mon",
                            "https://comic.naver.com/webtoon/list?titleId=758037&weekday=mon"));
        list.add(new Webtoon(2, "윈드브레이커", "조용석", 12,
                            "혼자서 자전거를 즐겨타던 모범생 조자현.\r\n원치 않게 자전거 크루의 일에 자꾸 휘말리게 되는데...\r\n자유를 꿈꾸는 청춘들의 스트릿라이딩 드라마!", "mon",
                            "https://comic.naver.com/webtoon/list?titleId=602910&weekday=mon"));
        list.add(new Webtoon(3, "대신 심부름을 해다오", "고아라", 0,
                             "요괴도 있고 사랑도 있고 비밀도 있는 마을, 의양리.\r\n" + 
                             "이곳에서 나고 자란 은호는 스무살이 되었고\r\n" + 
                             "산 속에서 20년 동안 잠들어있던 도깨비가 깨어났다.\r\n" + 
                             "은호의 소중한 친구를 지키기 위해서는 할 일이 있다는데...?\r\n" + 
                             "가까워지는 인연들에 대한 따뜻한 감성 판타지!", "tue",
                             "https://comic.naver.com/webtoon/list?titleId=769551&weekday=tue"));
        list.add(new Webtoon(3, "너의 순정, 나의 순정", "정살", 0,
                            "반장인 태리는 최근 계속해서 반 분위기를 흐리는 권지호 무리 때문에 스트레스를 받는다. 그러던 중 우연히 알게 된 지호의 비밀을 약점 잡아 지호를 제압하는데 성공하고, 그 일을 기점으로 지호는 태리에게 꼼짝하지 못하며 그렇게 둘의 비밀스러운(?) 상하관계가 시작되는데…",
                            "tue", "https://comic.naver.com/webtoon/list?titleId=797258&weekday=tue"));
        list.add(new Webtoon(4, "마녀와 용의 신혼일기", "뉴릉이", 15,
                            "한 번의 실수로 인생을 꿰인 천재 마녀의 달콤살벌 신혼생활!\r\n" + 
                            "신입과의 하룻밤으로 모든 지위와 명성에 먹칠 당하게 된 천재 마법사 웬디.\r\n" + 
                            "그런데 뭐..? 비밀을 지켜줄 테니 결혼해달라고...?!", "wed",
                            "https://comic.naver.com/webtoon/list?titleId=755668&weekday=wed"));
        list.add(new Webtoon(5, "헬퍼 2 : 킬베로스", "삭", 19,
                            "역시는 역시 역시군.\r\n" + 
                            "킬베로스 트라이브의 대장 장광남이 펼치는 스트릿 액션 만화.", "wed",
                            "https://comic.naver.com/webtoon/list?titleId=670143&weekday=wed"));
        list.add(new Webtoon(6, "이상한 변호사 우영우", "삭", 15,
                            "한국대 로스쿨 수석 졸업에,\r\n" + 
                            "변호사 시험 성적 1,500점 이상!\r\n" + 
                            "국내 업계 2위 법무법인 한바다의 인턴 변호사가 된 우영우.\r\n" + 
                            "\r\n" + 
                            "영우는 자신의 능력을 증명해내고 '진짜 변호사'가 될 수 있을까?", "thu",
                            "https://comic.naver.com/webtoon/list?titleId=798173&weekday=thu"));
        list.add(new Webtoon(7, "독립일기", "자까", 0,
                            "처음으로 나만의 집이 생긴다면?\r\n" + 
                            "자까 작가의 나혼자 사는 이야기", "thu",
                            "https://comic.naver.com/webtoon/list?titleId=748105&weekday=thu"));
        list.add(new Webtoon(8, "너의 키스씬", "조니조", 12,
                            "예능작가 이슬, 새로 담당한 예능프로그램에 최애 아이돌인 블록슛 승찬의 출연소식을 듣는다.\r\n" + 
                            "10년 넘게 좋아한 최애를 만난다는 기대도 잠시, 방송국에서 우연히 최애가 다른 사람과 몰래 키스하는 현장을 목격한다.\r\n" + 
                            "게다가 담당한 예능 프로그램은 출연자들끼리 데이트 하는 모습으로 가득한 연애버라이어티라는데...\r\n" + 
                            "나 아닌 다른 사람과 썸타고 연애하는 모습을 지켜봐야 한다. 비록 그가 나의 최애, 혹은 썸남일지라도.\r\n" + 
                            "<점핑오버> 조니조 작가 신작!", "fri",
                            "https://comic.naver.com/webtoon/list?titleId=794423&weekday=fri"));
        list.add(new Webtoon(9, "히어로 킬러", "꿀벌", 15,
                            "전쟁은 빌런들의 패배로 막을 내렸다.\r\n" + 
                            "이제 세상은 부패한 히어로들이 지배하고 있다.\r\n" + 
                            "그리고, 그런 히어로들 중 하나가 이화의 언니를 죽였다.\r\n" + 
                            "언니를 죽인 게 누구인지는 모르지만 상관없다.\r\n" + 
                            "한 놈씩 죽이다 보면 그중에 있을 테니까.\r\n" + 
                            "이화는 매일 밤 영웅들을 사냥하는 빌런, 히어로 킬러가 된다.\r\n" + 
                            "​\r\n" + 
                            "한 악당의 지독한 액션 활극.\r\n" + 
                            "“모조리 죽이고, 빼앗아 주마!”", "fri",
                            "https://comic.naver.com/webtoon/list?titleId=766563&weekday=fri"));
        list.add(new Webtoon(10, "키스의 여왕", "영영이", 15,
                            "누구라도 보는 순간 키스하고 싶게 만드는 여자, ‘키스의 여왕’이라는 별명을 가진 월드스타 손유리는 IT 업계의 억만장자 데이브 천과의 드라마틱한 열애 후 성대한 결혼식을 올린다.\r\n" + 
                            "평범한 신혼여행을 거부하고 지상 최고의 허니문 여행을 떠난 그녀는 로맨틱한 첫날밤에 미친 사랑과 거대한 운명의 폭풍에 휩싸이게 되는데…\r\n" + 
                            "“당신이 알던 그 남자는 죽었어.”", "sat",
                            "https://comic.naver.com/webtoon/list?titleId=791936&weekday=sat"));
        list.add(new Webtoon(11, "호랑이형님", "이상규", 15,
                            "신비한 힘을 가진 아이를 이용하여 세상을 지배하려는 반인반수 흰눈썹!\r\n" + 
                            "\r\n" + 
                            "그리고 얼떨결에 아이의 보호자가 된 괴물호랑이 빠르와 착호갑사 지망생 가우리!\r\n" + 
                            "이제 힘을 합쳐 흰눈썹으로부터 아이와 세상을 지켜라!!!", "sat",
                            "https://comic.naver.com/webtoon/list?titleId=650305&weekday=sat"));
        list.add(new Webtoon(12, "이번 생도 잘 부탁해", "삭", 0,
                            "전생을 기억하는 삶은 어떨까? 매번 전생을 기억하는 무료한 삶을 살던 18회차 인생, 윤주원이란 이름으로 살던 12살에 서하를 만나게 된다.\r\n" + 
                            "특별할 거 없던 그 아이가 무료한 삶을 특별하게 만들어주었지만 교통사고로 18회차 인생이 끝나고 만다.\r\n" + 
                            "다시 태어난 19회차 인생, 윤주원에서 반지음이란 이름으로 다시 서하를 만나러 간다.", "sun",
                            "https://comic.naver.com/webtoon/list?titleId=746858&weekday=sun"));
        list.add(new Webtoon(13, "소녀재판", "루즌아", 15,
                            "학교에서 아무것도 아니었던 소녀의 예측불허 재판이 시작된다!\r\n" + 
                            "평범한 박가을은 소위 '잘나가는 그룹'에 속하는 한유현의 비밀스러운 사건을 목격하고\r\n" + 
                            "이를 이용해 한유현을 협박해서 본인이 동경했던 그룹에 속하고 싶어하는데...", "sun",
                            "https://comic.naver.com/webtoon/list?titleId=743838&weekday=sun"));
    }
    
    // 전체 웹툰 조회
    public ArrayList<Webtoon> printAll(){
        
        return list;
    }

    // 요일별 웹툰 조회
    public ArrayList<Webtoon> byDayPrint(String day){
        ArrayList<Webtoon> dayList = new ArrayList<Webtoon>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDay().equals(day)) {
                dayList.add(list.get(i));
            }
        }
        return dayList;
    }

    // 웹툰 검색하기
    public ArrayList<Webtoon> searched(String keyword){
        ArrayList<Webtoon> searched = new ArrayList<Webtoon>();
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTitle().contains(keyword) ||
               list.get(i).getCartoonist().contains(keyword)) {
                searched.add(list.get(i));
            }
        }
        return searched;
    }

}
