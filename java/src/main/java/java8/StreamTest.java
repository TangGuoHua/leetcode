package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class StreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Card> list = shuffleCard();
//        list.add(new Card(11,"j"));
//        list.add(new Card(12,"Q"));
        
        Card total = list.stream().reduce(new Card(0,"none"),(c1, c2)->new Card(c1.getPoint()+c2.getPoint(),"total"));
//        System.out.println(list);
        System.out.println(total.getPoint());
    }
    
    private static ArrayList<Card> shuffleCard(){
        ArrayList<Card> cardList = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(11, "J");
        map.put(12, "Q");
        map.put(13, "K");
        map.put(20, "JOKE");
        System.out.println("开始洗牌： ");
        Card[] cardArray = new Card[54];
        int id = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                if(map.containsKey(i)) {
                    cardArray[id++] = new Card(i,map.get(i));
                }
                else {
                    cardArray[id++] = new Card(i,String.valueOf(i));
                }
                
            }
        }
        cardArray[id++] = new Card(20,map.get(20));
        cardArray[id++] = new Card(20,map.get(20));;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            swap(cardArray, r.nextInt(53), r.nextInt(53));
        }
        for (Card card : cardArray) {
            cardList.add(card);
        }
        System.out.println(cardList);
        return cardList;
    }
    

    private static void swap(Card[] cards, int i, int j) {
        Card tmp = cards[i];
        cards[i] = cards[j];
        cards[j] = tmp;
    }

}


class Card {
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Card(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

