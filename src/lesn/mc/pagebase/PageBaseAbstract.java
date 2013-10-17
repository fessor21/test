package lesn.mc.pagebase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public abstract class PageBaseAbstract{

	  /**
		 * ����ID����
		 * @param driver  ����
		 * @param id  Ԫ�ص�id����
		 */
		abstract WebElement findId(WebDriver driver, String id); 
		/**
		 * ����name����
		 * @param driver ����
		 * @param name Ԫ�ص�name���� 
		 */
		abstract  WebElement findName(WebDriver driver, String name); 
	    /**
	     * ����xpath����
	     * @param driver ����
	     * @param xpath  xpath·��
	     */
		abstract  WebElement findXpath(WebDriver driver,String xpath);
		/**
		 * ����className����
		 * @param driver     ����
		 * @param className  Ԫ�ص�class����
		 */
		abstract  void findClassName(WebDriver driver, String className);
		/**
		 * ����cssSelector����
		 * @param driver    ����
		 * @param cssselector Ԫ�ص�css����
		 */
		abstract  void findCssSelector(WebDriver driver, String cssselector);
		/**
		 * ����LinkText����
		 * @param driver   ����
		 * @param linkText Ԫ�ص�linkText����
		 */
		abstract  void findLinkText(WebDriver driver, String linkText);
		/**
		 * ����partialLinkText����
		 * @param driver   ����
		 * @param partialLinkText Ԫ�ص�partialLinkText����
		 */
		abstract  void findPartialLinkText(WebDriver driver, String partialLinkText);
		/**
		 * ����tagName����
		 * @param driver  ����
		 * @param tagName Ԫ�ص�tagName����
		 */
		abstract  void findTagName(WebDriver driver, String tagName);
		
	     /**
	      * ����id�������������
	      * @param driver ����
	      * @param id  Ԫ�ص�id����
	      * @param value ��Ҫ���õ�ֵ
	     * @throws InterruptedException 
	      */
		abstract void  setId(WebDriver driver, String id,String value) throws InterruptedException;
		/**
		 * ����name������������
		 * @param driver ����
		 * @param name   Ԫ�ص�name����
		 * @param value  ��Ҫ���õ�ֵ
		 */
		abstract void  setName(WebDriver driver, String name,String value);
		
		/**
		 * ����Id���Եĵ���¼�
		 * @param driver ����
		 * @param id  Ԫ�ص�id����
		 */
		abstract void  clickForId(WebDriver driver,String id);
		
		/**
		 * ����name���Եĵ���¼�
		 * @param driver ����
		 * @param name  Ԫ�ص�name����
		 */
		abstract void clickForName(WebDriver driver,String name);
		/**
		 * ����xpath·���ĵ���¼�
		 * @param driver ����
		 * @param xpath xpath·��
		 */
		abstract void clickForXpath(WebDriver driver,String xpath);
		/**
		 * ����Id���Ե�����¼�
		 * @param driver ����
		 * @param id  Ԫ�ص�id����
		 */
		abstract void clearForId(WebDriver driver,String id);
		/**
		 * ����name���Ե�����¼�
		 * @param driver ����
		 * @param name  Ԫ�ص�name����
		 */
		abstract void clearForName(WebDriver driver,String name);
		/**
		 * ����xpath·��ȡ��ҳ���ϵ��ı�ֵ
		 * @param driver ����
		 * @param xpath Ԫ�ص�xpath����
		 */
		abstract String byXpathGetText(WebDriver driver,String xpath);
		/**
		 * ����xpath·��ģ��enter��
		 * @param driver
		 * @param xpath
		 * @return
		 */
		abstract void byXpathEnter(WebDriver driver,String xpath);
		
		/**
		 * ����xpath·��ģ����갴�¼�
		 * @param driver
		 * @param xpath
		 * @return
		 */
		abstract void byXpathDown(WebDriver driver,String xpath);
        /**
         * ѡ��frame
         * @param driver
         * @name  frame����
         */
		abstract void swithFrame(WebDriver driver,String name);
		/**
		 * ������ǰframe
		 * @param driver
		 */
		abstract void jumpFrame(WebDriver driver);
		/**
		 * ִ��js
		 * @param driver
		 * @param str js���
		 */
		abstract void executeScript(WebDriver driver,String str);
		
		/**
		 * ����xpath������������
		 * @param driver ����
		 * @param xpath   xpath·��
		 * @param value  ��Ҫ���õ�ֵ
		 */
		abstract void  setXpath(WebDriver driver, String xpath,String value);
		/**
		 * ѡ��û��id��name��iframe
		 * @param driver
		 */
		abstract void  switchForNoidnameInframe(WebDriver driver);
		/**
		 * �ر�js�Ի��򣨵��ȷ����
		 * @param driver
		 */
		abstract void  closeDialogbox(WebDriver driver)throws InterruptedException;
		/**
		 * ����Ԫ�ص�class���Եĵ���¼�
		 * @param driver
		 * @param classname class����
		 */
		abstract void clickForClass(WebDriver driver,String classname);
		/**
		 * ����xpath·��������¼�
		 * @param driver
		 * @param xpath
		 */
		abstract void clearForXpath(WebDriver driver,String xpath);
        /**
         * ��������ѡ����id����ѡ��
         * @param driver
         * @param id   �������id����
         * @param values ��ѡ���ֵ
         */
		abstract void selectDropdown(WebDriver driver,String id,String values);
        /**
         * ��������ѡ����Xpath·������ѡ��
         * @param driver
         * @param xpath   �������xpath·�� 
         * @param values ��ѡ���ֵ
         */
		abstract void selectNoIDDropdown(WebDriver driver,String xpath,String values);
		/**
		 * ����IDȡ��ҳ���ϵ��ı�ֵ
		 * @param driver ����
		 * @param id Ԫ�ص�id����
		 */
		abstract String byIDGetText(WebDriver driver,String id);
		/**
		 * ���ݵ�������ʾ�����ݽ����жϲ��رյ�����
		 * @param driver  ����
		 * @param values  ���뵯������ʾ������
		 */
		abstract void  JudgeDialogbox(WebDriver driver,String values);
		/**
		 * ����xpath·���жϲ�ѡ��ѡ��
		 * @param driver  ����
		 * @param xpath  xpath·��
		 */
		abstract void byXpathSelected(WebDriver driver,String xpath);
		
		abstract void moveElement(WebDriver driver,WebElement ement);
		/**
		 * ����xpath·����ȡinput��valueֵ
		 * @param driver
		 * @param xpath
		 * @return
		 */
		abstract String byXpathInputGetText(WebDriver driver,String xpath);
		
		/**
		 * ����id��ȡinput��valueֵ
		 * @param driver
		 * @param id
		 * @return
		 */
		abstract String byIDInputGetText(WebDriver driver,String id);
}
