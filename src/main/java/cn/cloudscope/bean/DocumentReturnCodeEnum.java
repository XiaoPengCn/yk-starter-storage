package cn.cloudscope.bean;

import lombok.AllArgsConstructor;

/**
 * Description: 文档服务异常代码
 *
 * @author wenxiaopeng
 * @date 2021/07/09 11:07
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2021. All Rights Reserved.
 * </pre>
 */
@AllArgsConstructor
public enum DocumentReturnCodeEnum {

	/** explain as msg */
	SERVER_UNAVAILABLE(6001, "文件服务不可用，请联系支持部门。"),
	DOCUMENT_EMPTY(6101, "空文件，请重新上传。"),
	;

	private final Integer code;

	private final String msg;

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
