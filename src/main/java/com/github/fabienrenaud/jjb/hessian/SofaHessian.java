package com.github.fabienrenaud.jjb.hessian;

import com.caucho.hessian.io.SerializerFactory;

public interface SofaHessian {

    static final SerializerFactory factory = new SerializerFactory();
}
