package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.Constants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

@Activate(group = {Constants.CONSUMER, Constants.PROVIDER}, value = Constants.VALIDATION_KEY, order = 10000)
public class MyFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("开始调用 MyFilter");
        Result result = invoker.invoke(invocation);
        System.out.println("结束调用 MyFilter");
        return result;
    }
}
