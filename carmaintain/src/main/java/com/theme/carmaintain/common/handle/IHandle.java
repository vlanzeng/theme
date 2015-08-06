package com.theme.carmaintain.common.handle;

import java.util.Map;

@SuppressWarnings("rawtypes")
public interface IHandle {
	
	boolean receiveMessage(Map<String, Object> msgback, Object obj,Map headermap);
	
}
