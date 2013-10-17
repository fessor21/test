package lesn.mc.pagebase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public abstract class PageBaseAbstract{

	  /**
		 * 根据ID查找
		 * @param driver  驱动
		 * @param id  元素的id属性
		 */
		abstract WebElement findId(WebDriver driver, String id); 
		/**
		 * 根据name查找
		 * @param driver 驱动
		 * @param name 元素的name属性 
		 */
		abstract  WebElement findName(WebDriver driver, String name); 
	    /**
	     * 根据xpath查找
	     * @param driver 驱动
	     * @param xpath  xpath路径
	     */
		abstract  WebElement findXpath(WebDriver driver,String xpath);
		/**
		 * 根据className查找
		 * @param driver     驱动
		 * @param className  元素的class属性
		 */
		abstract  void findClassName(WebDriver driver, String className);
		/**
		 * 根据cssSelector查找
		 * @param driver    驱动
		 * @param cssselector 元素的css属性
		 */
		abstract  void findCssSelector(WebDriver driver, String cssselector);
		/**
		 * 根据LinkText查找
		 * @param driver   驱动
		 * @param linkText 元素的linkText属性
		 */
		abstract  void findLinkText(WebDriver driver, String linkText);
		/**
		 * 根据partialLinkText查找
		 * @param driver   驱动
		 * @param partialLinkText 元素的partialLinkText属性
		 */
		abstract  void findPartialLinkText(WebDriver driver, String partialLinkText);
		/**
		 * 根据tagName查找
		 * @param driver  驱动
		 * @param tagName 元素的tagName属性
		 */
		abstract  void findTagName(WebDriver driver, String tagName);
		
	     /**
	      * 根据id设置输入的内容
	      * @param driver 驱动
	      * @param id  元素的id属性
	      * @param value 需要设置的值
	     * @throws InterruptedException 
	      */
		abstract void  setId(WebDriver driver, String id,String value) throws InterruptedException;
		/**
		 * 根据name设置输入内容
		 * @param driver 驱动
		 * @param name   元素的name属性
		 * @param value  需要设置的值
		 */
		abstract void  setName(WebDriver driver, String name,String value);
		
		/**
		 * 根据Id属性的点击事件
		 * @param driver 驱动
		 * @param id  元素的id属性
		 */
		abstract void  clickForId(WebDriver driver,String id);
		
		/**
		 * 根据name属性的点击事件
		 * @param driver 驱动
		 * @param name  元素的name属性
		 */
		abstract void clickForName(WebDriver driver,String name);
		/**
		 * 根据xpath路径的点击事件
		 * @param driver 驱动
		 * @param xpath xpath路径
		 */
		abstract void clickForXpath(WebDriver driver,String xpath);
		/**
		 * 根据Id属性的清除事件
		 * @param driver 驱动
		 * @param id  元素的id属性
		 */
		abstract void clearForId(WebDriver driver,String id);
		/**
		 * 根据name属性的清除事件
		 * @param driver 驱动
		 * @param name  元素的name属性
		 */
		abstract void clearForName(WebDriver driver,String name);
		/**
		 * 根据xpath路径取得页面上的文本值
		 * @param driver 驱动
		 * @param xpath 元素的xpath属性
		 */
		abstract String byXpathGetText(WebDriver driver,String xpath);
		/**
		 * 根基xpath路径模拟enter键
		 * @param driver
		 * @param xpath
		 * @return
		 */
		abstract void byXpathEnter(WebDriver driver,String xpath);
		
		/**
		 * 根基xpath路径模拟鼠标按下键
		 * @param driver
		 * @param xpath
		 * @return
		 */
		abstract void byXpathDown(WebDriver driver,String xpath);
        /**
         * 选择frame
         * @param driver
         * @name  frame名称
         */
		abstract void swithFrame(WebDriver driver,String name);
		/**
		 * 跳出当前frame
		 * @param driver
		 */
		abstract void jumpFrame(WebDriver driver);
		/**
		 * 执行js
		 * @param driver
		 * @param str js语句
		 */
		abstract void executeScript(WebDriver driver,String str);
		
		/**
		 * 根据xpath设置输入内容
		 * @param driver 驱动
		 * @param xpath   xpath路径
		 * @param value  需要设置的值
		 */
		abstract void  setXpath(WebDriver driver, String xpath,String value);
		/**
		 * 选择没有id和name的iframe
		 * @param driver
		 */
		abstract void  switchForNoidnameInframe(WebDriver driver);
		/**
		 * 关闭js对话框（点击确定）
		 * @param driver
		 */
		abstract void  closeDialogbox(WebDriver driver)throws InterruptedException;
		/**
		 * 根据元素的class属性的点击事件
		 * @param driver
		 * @param classname class名称
		 */
		abstract void clickForClass(WebDriver driver,String classname);
		/**
		 * 根据xpath路径的清除事件
		 * @param driver
		 * @param xpath
		 */
		abstract void clearForXpath(WebDriver driver,String xpath);
        /**
         * 根据下拉选择框的id进行选择
         * @param driver
         * @param id   下拉框的id属性
         * @param values 需选择的值
         */
		abstract void selectDropdown(WebDriver driver,String id,String values);
        /**
         * 根据下拉选择框的Xpath路径进行选择
         * @param driver
         * @param xpath   下拉框的xpath路径 
         * @param values 需选择的值
         */
		abstract void selectNoIDDropdown(WebDriver driver,String xpath,String values);
		/**
		 * 根据ID取得页面上的文本值
		 * @param driver 驱动
		 * @param id 元素的id属性
		 */
		abstract String byIDGetText(WebDriver driver,String id);
		/**
		 * 根据弹出框显示的内容进行判断并关闭弹出框
		 * @param driver  驱动
		 * @param values  传入弹出框显示的内容
		 */
		abstract void  JudgeDialogbox(WebDriver driver,String values);
		/**
		 * 根据xpath路径判断并选择复选框
		 * @param driver  驱动
		 * @param xpath  xpath路径
		 */
		abstract void byXpathSelected(WebDriver driver,String xpath);
		
		abstract void moveElement(WebDriver driver,WebElement ement);
		/**
		 * 根据xpath路径获取input的value值
		 * @param driver
		 * @param xpath
		 * @return
		 */
		abstract String byXpathInputGetText(WebDriver driver,String xpath);
		
		/**
		 * 根据id获取input的value值
		 * @param driver
		 * @param id
		 * @return
		 */
		abstract String byIDInputGetText(WebDriver driver,String id);
}
