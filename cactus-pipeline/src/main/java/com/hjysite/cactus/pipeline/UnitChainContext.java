package com.hjysite.cactus.pipeline;

/**
 * @description: TODO
 * @author: hjy
 * @date: 2021/11/22
 **/
public interface UnitChainContext extends InvokeUnitContext {

    UnitChainInnerContext getInnerContext(AbstractUnitChain.UnitNode unitNode);

    interface UnitChainInnerContext extends InvokeUnitContext {
    }
}
