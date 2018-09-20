/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.aopalliance.aop;

/**
 * Tag interface for Advice. Implementations can be any type
 * of advice, such as Interceptors.
 *
 * @author Rod Johnson
 * @version $Id: Advice.java,v 1.1 2004/03/19 17:02:16 johnsonr Exp $
 *
 * Advice就是在Aop中定义的增强的内容,简单说就是我们想在连接点想做啥,都可以通过实现Advice实现.
 * 根据我们不同的需求,我们有不同的Advice的实现.
 * 常见的例如,我们想在连接点之前做一点东西, 有{@link org.springframework.aop.BeforeAdvice}
 * 想阻止目标方法的调用, 有 {@link org.springframework.aop.aspectj.AspectJAroundAdvice}
 */
public interface Advice {

}
