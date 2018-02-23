package com.slime;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;
import org.atilika.kuromoji.Tokenizer.Builder;
import org.atilika.kuromoji.Tokenizer.Mode;

import com.ibm.icu.text.Transliterator;

import lombok.Data;

public class SlimeSerif {
	
	/**
	 * 引数なし
	 */
	static String[] arg0_msgs = 
	{
		"英語が得意になるには、脳内にアメリカ人の友だちをつくるといいよ！",
		"地理の勉強がつまらなかったら、観光ガイドの気になるページを色々見てみると楽しくなってくるかも？",
		"ボクはいつでも{name}の味方だよ！",
		"ゼリーいっぱいたべた",
		"ぐだ〜",
		"しゃきぃ",
		"グリーンカレーって、メロン味なの？",
		"こんにゃくゼリー買ってもらった♪",
		"わたあめおいしい",
		"お祭り行きたい",
		"GORORON堂がGORORON、GORORON、て鳴いてる",
		"フレー、フレー、{name}！",
		"いざ、冒険の旅へ！！",
		"ボク、前回りできるんだよ",
		"問題か解答の上で右クリックすると、メニューが出てくるよ",
		"とび箱は３０段くらいとべるよ！",
		"このどんぐりはどこにあったの？",
		"おやスラ〜・・・",
		"ふぃぁ〜おん",
		"スラスラ〜♪",
		"すらスラおぼえるすらスラ～",
		"のんびりのんびり",
		"勉強が進まなくて、顔面水色になっちゃった",
		"ボクはつおいんだぞ！",
		"歩いてると、脳が活性化されるって、GORORON堂の人が言っていたよ",
		"勉強が終わったら、一緒に海に行こうよ♪",
		"勉強が終わったら、一緒に山に行こうよ♪",
		"勉強が終わったら、一緒に公園に行こうよ♪",
		"レインボーブリッジ連れてって〜",
		"遊園地連れてって〜",
		"デパート連れてって〜",
		"公園連れてって〜",
		"トイレ連れてって〜",
		"漫画喫茶行かない？",
		"カラオケ行こうよ！",
		"あめをなめてたらなくなっちゃったんだけど、どうして？？",
		"洞窟で探検しようよ！",
		"プールに連れてって〜",
		"西から昇ったお日様が東に沈んじゃったよ〜",
		"ボク、オリジナル飲み物を発明したんだ！麦茶牛乳だよ。ミルクティーみたいでしょ？",
		"お茶を入れてきたよ！",
		"紅茶を入れてきたよ！",
		"コーヒーを入れてきたよ！",
		"ココアを持ってきたよ",
		"梅干しを持ってきたよ",
		"ビー玉を拾ったよ",
		"あんず飴を買ってきたよ",
		"マシュマロを持ってきたよ",
		"無理しないでね",
		"ゼリーのぬか漬けを作ってみたよ！",
		"チョコを持ってきたよ",
		"おせんべい持ってきたよ",
		"キャラメルを持ってきたよ",
		"ピーナッツ持ってきた",
		"ヨーグルトを持ってきたよ",
		"ゼリー一緒に食べよ",
		"サイダーでゆで卵の味付けをしているよ！",
		"サイダー持ってきたよ",
		"ホットコーラでほへっと一息♪",
		"くすぐったい・・・",
		"ぷるぷる・・・",
		"ボク、銭湯行ってくる！",
		"理解してから覚えるより、理解できてなくても覚えてから理解しようとした方が効率がいい、てGORORON堂の人が言っていたよ",
		"記憶力は後天的に変えられる、てGORORON堂の人が言っていたよ",
		"勉強は、楽しくやるものだとおもうんだ",
		"なかなか覚えられないことは、大きな声で音読してみるといいみたいだよ",
		"覚えたはずのことを忘れてしまうと、ショックを受けるかもしれないけど、忘れるってことが記憶を強化するって、GORORON堂の人が言っていたよ",
		"赤や青は、記憶に残りやすい色なんだって！",
		"9月になったらふぃあ〜をををををん",
		"お疲れサマー",
		"ぷるんぷるんにさりげなく～♪さりげなく～まなぶだけさ～♪",
		"ボクは綺麗好きだから、ゴミには触りたくないから、掃除はしないんだ♪",
		"さっき{name}のお父さんが干し芋を食べていたよ！そしたら、干し芋の中に歯が入ってた、って言って、怒ってGORORON堂にクレームの電話かけていたよ。でも、その後、「おかしいな、おれの歯が1本ないなぁ」って不思議そうにしていたよ。",
		"今日は{name}のパンツではたきを作ってみたよ！",
		"問題を解く＝思い出そうとするプロセスが記憶を強化する、てGORORON堂の人が言っていたよ	",
		"問題を作る、というプロセスが記憶を強化する、てGORORON堂の人が言っていたよ",
		"解答が長いと覚えにくいから、短い単語を解答にするといいみたいだよ",
		"暗記ノートをやったあと、すぐにその分野の本を読むと、スイスイ頭に入ってくるよ",
		"忘れかけた頃に復習するのが、一番記憶に残るんだって！",
		"ボクの名前は、すらスラ〜",
		"フルーチェにソーダ味があったらいいなあ",
		"ボク、実はゼリーでできてるんだよ！",
		"ボクの正体は、インクびん・・・じゃないよ！",
		"この帽子はストローハットっていうんだよ",
		"ボク、つかれちゃった",
		"ボク、眠くなってきた",
		"♪こわれるほど覚えても〜 ３分の１も覚えてない〜♪",
		"おもちゃ買ってほしい",
		"公園に行きたいな",
		"おさんぽおさんぽ",
		"電子レンジにたまごを入れたら、爆発しちゃった",
		"ここは平和でいいね〜",
		"{name}のうちは、居心地がいいね！",
		"問題を右クリックすると、メニューが出てくるよ",
		"消しゴムをふせんにドラッグすると、ふせんを消すことができるよ",
		"ふせんを消しゴムにドラッグすると、ふせんを消すことができるよ",
		"登録されているQAカードに消しゴムをドラッグすると、QAを消すことができるよ",
		"ふせんが貼ってあるクリスタルボードは、ドラッグで動かすことができるよ",
		"虫めがねは、ドラッグで動かすことができるよ",
		"虫めがねの上にふせんをドラッグすると、そのふせんが貼ってあるQ&Aを検索することができるよ",
		"ひなたぼっこ",
		"おやつ食べたい",
		"いじめないでね",
		"Q&Aカードはスクロールできるよ",
		"ふせんが貼ってあるクリスタルボードは、スクロールできるよ",
		"ノートの中身は、縦にスクロールできるよ"
	};
	public static int arg0_minimum = 0;
	public static int arg0_maximum = arg0_msgs.length;
	
	/**
	 * 引数0個のセリフをランダムで返す
	 * @param param
	 * @return
	 */
	public String RamdomSerifArg0(String owner_name)
	{
		int randomNum = arg0_minimum + (int)(Math.random() * arg0_maximum);
		String serif = arg0_msgs[randomNum];
		// TODO セッションからオーナー名取得
		serif = serif.replace("{name}", owner_name);
		return serif;
	}
	
	/**
	 * 引数１個
	 */
	static String[] arg1_msgs = 
	{
		/**
		 * 名詞
		 */
		"冷蔵庫に{0}入ってた",
		"{0}を電子レンジに入れたら爆発しちゃった",
		"{0}飲んじゃった",
		"炊飯器に{0}が入ってたけど、カピカピになってた",
		"{0}からカビが生えてる〜！",
		"道端に{0}が落ちていたよ",
		"{0}を使って、強くなるんだ！",
		"{0}に憧れる・・・",
		"{0}でしりとりしよう！",
		"{0}のゲームがあったら、主人公はボク？",
		"だいじょうぶ、{0}があるから！",
		"{0}を使うなら、今しかないよ！",
		"{0}で元気を出してね",
		"{0}があってちょうど良かった",
		"{0}はやだ！",
		"やっぱり{0}だ！",
		"{0}買って！",
		"{0}について、なんだか思い出せないなぁ・・・",
		"お金と{0}、どっちが大事？",
		"FAXで{0}にスルメを送ろうとしたら、こわれちゃった",
		"水と、ゼラチンと、{0}を混ぜて、と・・・",
		"今日は{0}で遊ぼうかな♪",
		"ボク、{0}と間違えて食べられちゃいそうになった・・・",
		"トイレットペーパーに{0}のお絵描きした",
		"{0}をうす〜くのばす。",
		"{0}見てたらおなかすいた",
		"{0}の話は眠くなるスラ〜",
		"{0}と友達になったよ！",
		"{0}と仲間になったよ！",
		"{0}を覚えると人気者になれるらしいよ！",
		"今度銭湯に{0}持ってく！",
		"{0}よりボクの方がかわいいもん！",
		"{0}かぁ、深いね",
		"ヒゲのはえた{0}",
		"{0}生えてきた",
		"{0}って、今流行ってるんだよ！",
		"{0}の花粉飛んできた",
		"{0}の塗り絵、作れるかなぁ",
		"{0}の写真を検索してみたらどうかな？？",
		"{0}って面白いの？",
		"{0}を使って悪者を退治するんだ！",
		"デートに{0}持ってくの？",
		"学校に{0}持ってきちゃいけないの？",
		"おやつに{0}は含まれる？",
		"{0}をペットにしたい",
		"合コンで{0}の話するといい、てGORORON堂の人が言ってた",
		"{0}のこと熱く話したい！",
		"{0}って、極道！？",
		"{0}から鼻毛でてた",
		"{0}食べてみたい",
		"{0}でジュース作ってほしい",
		"{0}を洗濯機で洗ってあげたよ",
		"ボク、ぷるぷるじゃなくなってしまって病院に行ったら、{0}の薬をもらったよ",
		"蛇口から{0}出てる",
		"{0}って、リモコン操作できるの？",
		"{0}と冒険に行く！！",
		"{0}って、もっちり",
		"{0}、ぷるぷるしてるの？",
		"{0}のこと考えるとお化け屋敷行きたくなる",
		"{0}のせいで電車止まっちゃった",
		"{0}よりゼリーの方が好き",
		"マツコデラックスの{0}",
		"{0}より、遊びが大事！",
		"{0}についてもっと詳しく教えて！ボク難しいこと聞いてるとぐっすり眠れるんだ♪",
		"{0}の上に乗ったら、刺さっちゃった＞＜",
		"{0}と靴下間違えちゃった",
		"{0}の未来は、キラキラ",
		"銭湯で{0}見かけた",
		"{0}の謎解きごっこをしよう♪",
		"今日はお味噌汁に{0}を入れてみたんだ♪",
		"{0}を遠足にもっていってもいい？",
		"ずんだ餅の中に{0}が入ってた・・・",
		"{0}を使って世界を変えよう！",
		"{0}を使った魔法を使おうよ！",
		"{0}についての本って、売ってるの？",
		"今の世の中には、{0}が必要なんだって",
		"戦時中は{0}をどうしていたんだろう？",
		"{0}があるから、ひとりぼっちじゃないよ",
		"釣りに行ったら、{0}が釣れちゃった",
		"お地蔵さんの横に{0}が置いてあったよ",
		"おさんぽしてたら、{0}についてアンケートをとってる人がいたよ",
		"{0}はすっぱい味がする",
		"{0}は甘い味がする",
		"{0}は苦い味がする",
		"{0}はライムの香りがする",
		"{0}のスープ",
		"ポップな{0}",
		"邪悪な{0}",
		"東京の夜景は{0}でできている",
		"{0}っぽいスライム",
		"{0}とひなたぼっこ",
		"{0}への切符",
		"{0}に向かってふぃああああをん！",
		"{0}とお散歩",
		"干し芋の中に{0}入ってた",
		"パンには{0}を付ける派？？",
		"{0}かけご飯",
		"{0}味のゼリー",
		"{0}風のおじいちゃん",
		"今日のラッキーアイテムは、{0}！",
		"ごみ箱に{0}入ってたけど、いらないの？",
		"{0}をヤフオクで売ったらいくらくらいになるんだろう？",
		"お日様さんさん、{0}さんさん",
		"{0}が空飛んでた",
		"銭湯で{0}が泳いでたよ",
		"銭湯に{0}が浮かんでいたよ",
		"今をときめく{0}",
		"壷を割ったら{0}が出てきた",
		"車に{0}を積んで、ドライブに連れてってほしいな♪",
		"{0}を覚えるとどんないいことがあるだろう♪",
		"{0}にはコラーゲンがいっぱい含まれてるんだって！",
		"{0}の世界は闇に包まれているらしい・・・",
		"{0}を歌にすると売れるとおもう！",
		"{0}についてのマンガがあったら、読んでみたいな",
		"銭湯で背中に{0}の絵が描いてある人を見たよ",
		"{0}おもしろい！",
		"{0}つまらない・・・",
		"ほっぺたに{0}ついてるよ",
		"トイレでキレイな{0}を拾ったよ！",
		"{0}について、{name}と電話したよ！",
		"{0}を{name}の鼻の穴に入れて、と・・・",
		"{name}は、大学で{0}の研究をするの？？",
		"{name}と{0}って、似てると思う",
		"{name}と{0}が結婚する夢見た",
		"{name}、{0}を武器に、世界をはばたくんだ！",
		"{name}のレントゲンに{0}写ってたよ",
		"{name}のパンツに{0}って書いちゃお♪",
		"今夜、{name}のおでこにマジックで{0}・・・",
		"{name}が寝てる間に、おでこにマジックで{0}と・・・",
		"{0}を覚えようとするなんて、{name}はすごいな〜",
		"{0}について覚えようとするところが、{name}らしいね！",
		
		/**
		 * 未分類
		 */
		"絶対{0}だよ！",
		"聞いて聞いて、{0}！",
		"ほら、アレ、{0}！",
		"{0}から連想することと言えば・・・",
		"今日の夕飯は、{0}カレー！",
		"ナイスガイ{0}",
		"{0}、ボクと同じ感じがする・・・",
		"マジカル{0}",
		"{0}って、なぁに？"		
	};
	public static int arg1_minimum = 0;
	public static int arg1_maximum = arg1_msgs.length;
	
	/**
	 * 引数１個のセリフをランダムで返す
	 * @param param
	 * @return
	 */
	public String RamdomSerifArg1(String param, String owner_name)
	{
		int randomNum = arg1_minimum + (int)(Math.random() * arg1_maximum);
		String serif = MessageFormat.format(arg1_msgs[randomNum], param);
		// TODO セッションからオーナー名取得
		serif = serif.replace("{name}", owner_name);
		return serif;
	}
	
	/**
	 * ノートを閉じているときのメッセージ
	 */
	static String[] note_close_msgs = 
	{
		"休憩する？",
		"遊びに行こうよ！"
	};
	
	public static int note_close_minimum = 0;
	public static int note_close_maximum = note_close_msgs.length;
	
	/**
	 * ノートを閉じてるときのセリフをランダムで返す
	 * @param param
	 * @return
	 */
	public String RamdomSerifNoteClose(String param, String owner_name)
	{
		int randomNum = note_close_minimum + (int)(Math.random() * note_close_maximum);
		String serif = MessageFormat.format(note_close_msgs[randomNum], param);
		// TODO セッションからオーナー名取得
		serif = serif.replace("{name}", owner_name);
		return serif;
	}

	/**
	 * 引数２個
	 */
	static String[] arg2_msgs = 
	{
		"{0}と{1}は、恋人以上、友達以下なんだって。",
		"{0}・・・{1}・・・おやスラ〜・・・",
		"{0}足す{1}は、なぁに？？",
		"{0}と{1}の間には、深〜い溝がある・・・",
		"{0}と{1}を、ミキサーで混ぜているよ！"
	};
	
	/**
	 * 
	 * @param msg
	 * @param param
	 * @return
	 */
	public static String Serif (String msg, String param, String owner_name)
	{
		return MessageFormat.format(msg, param);	
	}

	public static String Japanese_to_Roman(String japanese) {
		String roman = "";
		Tokenizer tokenizer = Tokenizer.builder().build();
	    for (Token token : tokenizer.tokenize(japanese)) {
	    	String parts = token.getSurfaceForm();
	    	// カタカナでなければ変換
	    	if (!parts.matches("^[ァ-ヶ]+$"))
	    	{
	    		parts = getKatakana(parts);
	    	}
	    	if (parts.equals("ハ") && token.getAllFeatures().split(",")[0].equals("助詞"))
	    	{
	    		parts = "ワ";
	    	}
	    	parts = getRoman(parts);
	    	if (parts.equals("？"))
	    	{
	    		parts = "?";
	    	}
	    	if (parts != null && !parts.equals("null"))
	    	{
	    		roman = roman + parts;
	    	}
	      System.out.println(token.getSurfaceForm() + "\t" + token.getAllFeatures());
	    }
	    System.out.println(roman);
	    return roman;
	}
	
	public static String getKatakana(String word) {
        if (word == null)
            return "";
        Builder builder = Tokenizer.builder();
        builder.mode(Mode.NORMAL);
        Tokenizer tokenizer = builder.build();
        List<Token> tokens = tokenizer.tokenize(word);
        StringBuilder sb = new StringBuilder();
        for (Token token : tokens)
            sb.append(token.getReading());
        if (sb.toString() == null)
        {
        	return "";
        }
        return sb.toString();
    }
	
	public static String getRoman(String word)
	{
	    Transliterator transliterator = Transliterator.getInstance("Katakana-Latin");
	    String result = transliterator.transliterate(word);
	    System.out.println(result);
	    if (result == null)
	    {
	    	return "";
	    }
	    return result;
	}	
}
