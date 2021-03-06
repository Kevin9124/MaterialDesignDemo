package ren.solid.materialdesigndemo.constants;

/**
 * Created by _SOLID
 * Date:2016/3/30
 * Time:14:02
 * <br/>
 * <p>
 * 本Demo使用的api全部来源：豆瓣
 * <p>
 * https://developers.douban.com/
 */
public class Apis {
    /**
     * 图书搜索
     * <p>
     * q	查询关键字	q和tag必传其一<br/>
     * tag	查询的tag	q和tag必传其一<br/>
     * start	取结果的offset	默认为0<br/>
     * count	取结果的条数	默认为20，最大为100
     */
    public static String SearchBookApi = "https://api.douban.com/v2/book/search";

    /**
     * 请求格式： http://api.douban.com/v2/book/26637801
     */
    public static String GetBookInfoApi = "http://api.douban.com/v2/book";

    /**
     * 正在热映的电影
     */
    public static String MovieInTheaters = "http://api.douban.com/v2/movie/in_theaters";

    /**
     * q 	query string 	str 	Y 	Y 	Y 	-
     * tag 	tag query string 	str 	Y 	Y 	Y 	-
     * start 	start 	int 	Y 	Y 	Y 	0
     * count 	count 	int 	Y 	Y 	Y 	20
     * <br/>
     * Example:GET /v2/movie/search?q=张艺谋 GET /v2/movie/search?tag=喜剧
     */
    public static String MovieSearch = "http://api.douban.com/v2/movie/search";
}
