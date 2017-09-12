package com.fortis.designmode.struct.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    /**
     * 1. 主要优点
     组合模式的主要优点如下：
     (1) 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
     (2) 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
     (3) 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
     (4) 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。
     2. 主要缺点
     组合模式的主要缺点如下：
     在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现，这个实现过程较为复杂。
     * @throws Exception
     */
    @Test
    public void sendNotifaction() throws Exception {
        MyCompany myCompany = new MyCompany();
        myCompany.add(new AUnit());
        myCompany.add(new BUnit());
        myCompany.sendNotifaction("hello");
    }

}