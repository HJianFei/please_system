/**   
* @Title: CharacterEncodingFilter.java 
* @Package com.hjianfei.please.filter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午11:09:53 
* @version V1.0   
*/
package com.hjianfei.please.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName: CharacterEncodingFilter
 * @Description: TODO(字符编码过滤器)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月20日 下午11:09:53
 * 
 */
public class CharacterEncodingFilter implements Filter {

	private FilterConfig filterConfig;
	private String encoding = "UTF-8";// 默认编码
	private boolean forceEncoding = false;// 是否保持request和response的编码一致

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		String tempE = filterConfig.getInitParameter("encoding");
		String tempFE = filterConfig.getInitParameter("forceEncoding");
		if (tempE != null) {
			encoding = tempE;
		}
		if ("true".equals(tempFE)) {
			forceEncoding = true;
		}
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		if (this.encoding != null && (this.forceEncoding || request.getCharacterEncoding() == null)) {
			request.setCharacterEncoding(this.encoding);
			if (this.forceEncoding) {
				response.setCharacterEncoding(this.encoding);// 与request的编码一致
			}
		}

		filterChain.doFilter(request, response);
	}

	public void destroy() {
	}

	public FilterConfig getFilterConfig() {
		return filterConfig;
	}

	public void setFilterConfig(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public boolean isForceEncoding() {
		return forceEncoding;
	}

	public void setForceEncoding(boolean forceEncoding) {
		this.forceEncoding = forceEncoding;
	}

}
