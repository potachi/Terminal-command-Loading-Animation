package com.slime;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public class SlimeSerif {
	
	/**
	 * 引数１個
	 */
	static String[] arg1_msgs = 
	{
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
		"絶対{0}だよ！",
		"{0}で元気を出してね",
		"聞いて聞いて、{0}！",
		"{0}があってちょうど良かった",
		"{0}はやだ！",
		"やっぱり{0}だ！",
		"{0}買って！",
		"ほら、アレ、{0}！",
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
		"{0}から連想することと言えば・・・",
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
		"今日の夕飯は、{0}カレー！",
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
		"ナイスガイ{0}",
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
		"壷を割ったら{0}が出てきた",
		"車に{0}を積んで、ドライブに連れてってほしいな♪",
		"{0}を覚えるとどんないいことがあるだろう♪",
		"{0}にはコラーゲンがいっぱい含まれてるんだって！",
		"{0}、ボクと同じ感じがする・・・",
		"{0}の世界は闇に包まれているらしい・・・",
		"{0}って、なぁに？",
		"{0}を歌にすると売れるとおもう！",
		"{0}についてのマンガがあったら、読んでみたいな",
		"銭湯で背中に{0}の絵が描いてある人を見たよ"
	};
	public static int arg1_minimum = 0;
	public static int arg1_maximum = arg1_msgs.length;
	public static int randomNum = arg1_minimum + (int)(Math.random() * arg1_maximum);
	
	public static String RamdomSerifArg1(String param)
	{
		String serif = MessageFormat.format(arg1_msgs[randomNum], param);
		return serif;
	}
	
	/**
	 * 引数２個
	 */
	static String[] arg2_msgs = 
	{
		"{0}について、{name}と電話したよ！",
		"{0}を{name}の鼻の穴に入れて、と・・・",
		"{name}は、大学で{0}の研究をするの？？",
		"{0}と{1}は、恋人以上、友達以下なんだって。",
		"{name}と{0}って、似てると思う",
		"{name}と{0}が結婚する夢見た",
		"{name}、{0}を武器に、世界をはばたくんだ！",
		"{name}のレントゲンに{0}写ってたよ",
		"{0}・・・{1}・・・おやスラ〜・・・",
		"{0}足す{1}は、なぁに？？",
		"{name}のパンツに{0}って書いちゃお♪",
		"{name}が寝てる間に、おでこにマジックで{0}と・・・",
		"{0}と{1}の間には、深〜い溝がある・・・",
		"{0}を覚えようとするなんて、{name}はすごいな〜",
		"{0}について覚えようとするところが、{name}らしいね！",
		"{0}と{1}を、ミキサーで混ぜているよ！"
	};
	
	/**
	 * 
	 * @param msg
	 * @param param
	 * @return
	 */
	public static String Serif (String msg, String param)
	{
		return MessageFormat.format(msg, param);	
	}

}
