# player-info
import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("選手");
        System.out.println("----------------------------------------------------------------------------------------");

        List<PlayerInfo> players = new ArrayList<>();
        players.add(new PlayerInfo("1","中村航輔","ナカムラコウスケ","ポルティモネンセ/ポルトガル"));
        players.add(new PlayerInfo("12","鈴木彩艶","スズキザイオン","シントトロイデン/ベルギー"));
        players.add(new PlayerInfo("23","権田修一","ゴンダシュウイチ","シントトロイデン/ベルギー"));

        String gkPosition = "GK";
        System.out.println(gkPosition);
        for (PlayerInfo gk : players){
            System.out.printf("%s %s %s %s%n",gk.getNumber(),gk.getName(),gk.getReading(),"("+gk.getTeam()+")");

        List<PlayerInfo> dfplayers = new ArrayList<>();
        dfplayers.add(new PlayerInfo("2","菅原由勢","スガワラユキナリ","AZ/オランダ"));
        dfplayers.add(new PlayerInfo("3","富安健洋","トミヤスタケヒロ","アーセナル/イングランド"));
        dfplayers.add(new PlayerInfo("4","板倉滉","イタクラコウ","シャルケ04/ドイツ"));
        dfplayers.add(new PlayerInfo("5","中山雄太","ナカヤマユウタ","ハダースフィールド/イングランド2部"));
        dfplayers.add(new PlayerInfo("21","伊藤洋輝","イトウヒロキ","シュツットガルト/ドイツ"));
        dfplayers.add(new PlayerInfo("15","谷口 彰悟","タニグチショウゴ","アル・ラーヤンSC/カタール"));

        String dfPosition = "DF";
        System.out.println(dfPosition);
        for (PlayerInfo df : dfplayers){
            System.out.printf("%s %s %s %s%n",df.getNumber(),df.getName(),df.getReading(),"("+df.getTeam()+")");
        }
        }
    }
}








public class PlayerInfo {
    private String number;
    private String name;
    private String reading;
    private String team;

    public PlayerInfo(String number, String name, String reading, String team) {
        this.number = number;
        this.name = name;
        this.reading = reading;
        this.team = team;
    }
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getReading() {
        return reading;
    }

    public String getTeam() {
        return team;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
