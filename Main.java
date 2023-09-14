# main
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("選手");
        System.out.println("----------------------------------------------------------------------------------------");


        List<PlayerInfo> gkplayers = new ArrayList<>();
        gkplayers.add(new PlayerInfo("1", "中村航輔", "ナカムラコウスケ", "ポルティモネンセ/ポルトガル"));
        gkplayers.add(new PlayerInfo("12", "鈴木彩艶", "スズキザイオン", "シントトロイデン/ベルギー"));
        gkplayers.add(new PlayerInfo("23", "権田修一", "ゴンダシュウイチ", "シントトロイデン/ベルギー"));

        String gkPosition = "GK";
        System.out.println(gkPosition);
        for (PlayerInfo gk : gkplayers) {
            System.out.printf("%s %s %s %s%n", gk.getNumber(), gk.getName(), gk.getReading(), "(" + gk.getTeam() + ")");
        }

        List<PlayerInfo> dfPlayers = new ArrayList<>();
        dfPlayers.add(new PlayerInfo("2", "菅原由勢", "スガワラユキナリ", "AZ/オランダ"));
        dfPlayers.add(new PlayerInfo("3", "富安健洋", "トミヤスタケヒロ", "アーセナル/イングランド"));
        dfPlayers.add(new PlayerInfo("4", "板倉滉", "イタクラコウ", "シャルケ04/ドイツ"));
        dfPlayers.add(new PlayerInfo("5", "中山雄太", "ナカヤマユウタ", "ハダースフィールド/イングランド2部"));
        dfPlayers.add(new PlayerInfo("21", "伊藤洋輝", "イトウヒロキ", "シュツットガルト/ドイツ"));
        dfPlayers.add(new PlayerInfo("15", "谷口 彰悟", "タニグチショウゴ", "アル・ラーヤンSC/カタール"));
        dfPlayers.add(new PlayerInfo("25", "チェイス・アンリ", "", "シュツットガルト/ ドイツ"));
        dfPlayers.add(new PlayerInfo("22", "毎熊 晟矢", "マイクマセイヤ", "セレッソ大阪"));

        String dfPosition = "DF";
        System.out.println(dfPosition);
        for (PlayerInfo df : dfPlayers) {
            System.out.printf("%s %s %s %s%n", df.getNumber(), df.getName(), df.getReading(), "(" + df.getTeam() + ")");
        }


        List<PlayerInfo> mfPlayers = new ArrayList<>();
        mfPlayers.add(new PlayerInfo("6", "遠藤航", "エンドウワタル", "リバプール/イングランド"));
        mfPlayers.add(new PlayerInfo("8", "守田 英正", "モリタヒデマサ", "スポルティング/ポルトガル"));
        mfPlayers.add(new PlayerInfo("7", "三苫薫", "ミトマカオル", "ブライトン/イングランド"));
        mfPlayers.add(new PlayerInfo("14", "久保建英", "クボタケフサ", "レアル・ソシエダ/スペイン"));
        mfPlayers.add(new PlayerInfo("17", "伊藤純也", "イトウジュンヤ", "ランス/フランス"));
        mfPlayers.add(new PlayerInfo("10", "堂安律", "ドウアンリツ", "フライブルク/ドイツ"));
        mfPlayers.add(new PlayerInfo("11", "鎌田大地", "カマダダイチ", "ラツィオ/イタリア"));
        mfPlayers.add(new PlayerInfo("13", "旗手怜央", "ハタテレオ", "セルティック/スコットランド"));
        mfPlayers.add(new PlayerInfo("18", "田中碧", "タナカアオ", "デュッセルドルフ/ドイツ２部"));

        String mfPotision = "MF";
        System.out.println(mfPotision);
        for (int i = 0; i < mfPlayers.size(); i++) {
            PlayerInfo mf = mfPlayers.get(i);
            System.out.printf("%s %s %s %s%n", mf.getNumber(), mf.getName(), mf.getReading(), "(" + mf.getTeam() + ")");
        }


        List<PlayerInfo> fwPlayers = new ArrayList<>();
        fwPlayers.add(new PlayerInfo("9", "上田 綺世", "ウエダアヤセ", "フェイエノールト/オランダ"));
        fwPlayers.add(new PlayerInfo("20", "前田大然", "マエダタイゼン", "セルティック/スコットランド"));
        fwPlayers.add(new PlayerInfo("16", "古橋 亨梧", "フルハシキョウゴ", "セルティック/スコットランド"));


        String fwPotision = "FW";
        System.out.println(fwPotision);
        for (int i = 0; i < fwPlayers.size(); i++) {
            PlayerInfo fw = fwPlayers.get(i);
            System.out.printf("%s %s %s%n", fw.getNumber(), fw.getName(), fw.getReading(), "(" + fw.getTeam() + ")");
        }

    }

}
