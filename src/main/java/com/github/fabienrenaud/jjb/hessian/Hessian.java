package com.github.fabienrenaud.jjb.hessian;

import com.caucho.hessian.io.SerializerFactory;

public interface Hessian {

    static final SerializerFactory factory = new SerializerFactory();
}
